package tuandev.com.initial_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/api/v1/user")
    public String hello(){
        return "Call API get an user!";
    }
}
