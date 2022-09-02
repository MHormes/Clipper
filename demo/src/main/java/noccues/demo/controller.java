package noccues.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/demo")
public class controller {

    @Autowired
    private Environment env;

    @GetMapping("/test")
    public ResponseEntity getMySchool(){
        return ResponseEntity.ok().body(env.getProperty("clipper.school"));
    }
}


