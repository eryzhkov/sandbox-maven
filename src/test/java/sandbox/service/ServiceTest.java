package sandbox.service;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by eRyzhkov on 04.08.2014.
 */
public class ServiceTest {

    @Test
    public void sayHelloToTest() {
        String name = "Vasya";
        String expectedResult = "Hello, " + name + "!";
        IService service = new Service();
        assertTrue(expectedResult.equals(service.sayHelloTo(name)));
    }

}
