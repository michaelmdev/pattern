package enterprise.unitofwork;

import java.util.*;

/**
 * @author michael.malevannyy@gmail.com, 24.04.2017
 */

public class UnitOfWork {

    private List<DomainObject> newObjects = new ArrayList<>();
    private List<DomainObject> dirtyObjects = new ArrayList<>();
    private List<DomainObject> removedObjects = new ArrayList<>();

    public void registerNew(DomainObject object) { /**/ }
    public void registerDirty(DomainObject object) { /**/ }
    public void registerRemoved(DomainObject obj) { /**/ }
    public void registerClean(DomainObject obj) { /**/ }

    public void commit() {
        insertNew();
        updateDirty();
        deleteRemoved();
    }

    private void insertNew() {
        for (DomainObject object : newObjects) {
            MapperRegistry.getMapper(object.getClass()).insert(object);
        }
    }


    static UnitOfWork instance;

    private Map<Long, Person> personMap = new HashMap();

    public static void addPerson(Person person) {
        instance.personMap.put(person.getId(), person);
    }

    public static Person getPerson(Long key) {
        return instance.personMap.get(key);
    }

    private void deleteRemoved() {

    }

    private void updateDirty() {
    }


}
