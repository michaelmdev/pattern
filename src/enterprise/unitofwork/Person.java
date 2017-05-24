package enterprise.unitofwork;

/**
 * @author michael.malevannyy@gmail.com, 24.04.2017
 */

public class Person extends DomainObject {
    private String lastName;
    private String firstName;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public static Person create(String name) {
        Person person = new Person();
        person.markNew();
        return person;
    }

}
