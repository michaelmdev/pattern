package enterprise.datamapper;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.h2.Driver;
import org.junit.jupiter.api.TestFactory;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by program on 20.05.2017.
 */
class PersonMapperTest {

    private static final String jdbcUrl = "jdbc:h2:~/person";
    private static final String jdbcDriver = "org.h2.Driver";
    private static PersonMapper personMapper;

    @BeforeAll
    static void initJdbc() throws ClassNotFoundException, SQLException {
        final Class<?> driverClass = Class.forName(jdbcDriver);
        final Connection connection = DriverManager.getConnection(jdbcUrl);
        personMapper = new PersonMapper(connection);
    }

    @Test
    void findByIdTest() throws SQLException, RecordNotFoundException {
        Person person = personMapper.findById(1);

        System.out.println(person.getFirstName());
    }

    @Test
    void insertTest() {


        Person person = new Person();
        person.setFirstName("Alexander");
        person.setLastName("Pushkin");
        personMapper.insert(person);



    }

    @Test
    void update() {

    }

    @Test
    void delete() {

    }

}