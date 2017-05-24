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
    public void registerRemoved(DomainObject object) { /**/ }
    public void registerClean(DomainObject object) { /**/ }

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

    private static ThreadLocal current = new ThreadLocal();

    public static void newCurrent() {
        setCurrent(new UnitOfWork());
    }

    public static void setCurrent(UnitOfWork unitOfWork) {
        current.set(unitOfWork);
    }

    public static UnitOfWork getCurrent() {
        return (UnitOfWork) current.get();
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
