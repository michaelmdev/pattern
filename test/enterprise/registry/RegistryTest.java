package enterprise.registry;

import enterprise.unitofwork.Person;
import org.junit.jupiter.api.Test;

/**
 * @author michael.malevannyy@gmail.com, 20.05.2017
 */

class RegistryTest {
    @Test
    public void test(int idPerson) {

        PersonFinder personFinder = Registry.getInstance().getPersonFinder();

        Person person = personFinder.findPeron(idPerson);
    }

}