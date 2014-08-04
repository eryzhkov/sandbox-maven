package sandbox.service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by eRyzhkov on 30.07.2014.
 */
public class Service implements IService {
    @Override
    public String sayHelloTo(String name) {
        return "Hello, " + name + "!";
    }

    @Override
    public String getCurrentDateTime() {
        SimpleDateFormat formatter = new SimpleDateFormat("EEE, MMM d, ''yy");
        String formattedDateTime = formatter.format(new Date());
        return formattedDateTime;
    }
}
