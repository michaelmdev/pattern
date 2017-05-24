package enterprise.unitofwork;// program@globall.ru @ 24.04.2017.

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonMapper implements RowMapper {
    public Person mapRow(ResultSet resultSet, int i) throws SQLException {
        Person person = new Person();
        person.setId(resultSet.getLong(DataContract.Person.ID));
        person.setFirstName(resultSet.getString(DataContract.Person.firstName));
        person.setLastName(resultSet.getString(DataContract.Person.lastName));
        return person;
    }
}
