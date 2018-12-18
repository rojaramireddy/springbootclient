package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
        return callAPI();
        //return "Greetings from Spring Boot";
    }
    public String callAPI() {
        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject("http://localhost:9000/greeting/roja", String.class);
        System.out.println(response);
        return(response);
    }
    
}
