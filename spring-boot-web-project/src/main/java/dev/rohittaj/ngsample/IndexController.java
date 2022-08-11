package dev.rohittaj.ngsample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    
    @GetMapping(path = "/java_app")
    public String getJavaIndex(){
        return "java_app";
    }

    @GetMapping(path="/angular_app")
    public String getAngularIndex(){
        return "angular_app";
    }
}
