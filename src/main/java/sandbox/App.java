package sandbox;

import sandbox.service.IService;
import sandbox.service.Service;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        IService service = new Service();
        System.out.println( "Hello World from Sandbox!" );
        System.out.println(service.sayHelloTo("Git"));
        System.out.println("Today is " + service.getCurrentDateTime() + "." );
    }
}
