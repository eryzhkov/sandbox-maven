package sandbox.service;

/**
 * Created by eRyzhkov on 30.07.2014.
 */
public class Service implements IService {
    @Override
    public void sayHelloTo(String name) {
        System.out.println("Hello, " + name + "!");
    }
}
