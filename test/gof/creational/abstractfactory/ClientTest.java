package gof.creational.abstractfactory;

import org.junit.jupiter.api.Test;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.validation.Schema;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author michael.malevannyy@gmail.com, 22.03.2017
 */

class ClientTest {
    @Test
    public void testDoSomeUseful() {
        Client client = new Client();
        client.doSomeUseful(Fabric.ulmart);
    }

}