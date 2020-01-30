package com.rxjava.project.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository repository;

    User doLogin(String id, String pwd) {
        return repository.doLogin(id, pwd);
    }
}
