package com.example.home.controller;



import com.example.home.entity.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstReq {
    @RequestMapping(value= {"/hello-world", "/hello"}, method= RequestMethod.GET)
    public String helloWord(){
        return "hello word";
    }

    @RequestMapping(value="/user", method = RequestMethod.GET)
    public ResponseEntity<?> getList(){
        User user = new User(1, "John Wick", "asdasdas", "asdasasd", "asdasasdas");
        return ResponseEntity.status(HttpStatus.OK).body(user);
    }

    @RequestMapping(value="/test", method = RequestMethod.GET)
    public String doGet() {
        return "test1";
    }
}
