package enterprise.registry;

/**
 * @author michael.malevannyy@gmail.com, 20.05.2017
 */

class Registry {
    private static Registry instance = new Registry();

    public static Registry getInstance() {
        return instance;
    }

    protected PersonFinder personFinder = new PersonFinder();

    public PersonFinder getPersonFinder() {
        return personFinder;
    }
}