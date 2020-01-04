package com.rxjava.project.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseEntity login() {
        HashMap map = new HashMap();
        map.put("testKey", "testValue");
        return new ResponseEntity(map, HttpStatus.OK);
    }

}
