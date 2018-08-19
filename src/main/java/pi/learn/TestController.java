package pi.learn;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: learn
 * @author: Mr.Pi
 * @create: 2018-08-19 19:32
 **/
@RestController
public class TestController {

    @GetMapping(value = "/hello")
    public String sys(){
        return  "hello spring boot";
    }
}
