package com.rxjava.project.user;

import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositoryCustom {

    User doLogin(String id, String pwd);
}
