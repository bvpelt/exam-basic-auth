package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    
    private static final String template01 = "Hello from Greeter, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", required=false, defaultValue="World") String name) {
    	Person person = new Person(name, "Greeting");
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name), person);
    }
    
    @RequestMapping("/gs")
    public Greeting gs(@RequestParam(value="name", required=false, defaultValue="You") String name,
    		@RequestParam(value="lastname", required=false, defaultValue="de Vries") String last_name) {
    	Person person = new Person(name, last_name);
        return new Greeting(counter.incrementAndGet(),
                            String.format(template01, name), person);
    }
}