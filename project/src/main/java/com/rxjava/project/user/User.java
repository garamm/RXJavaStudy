package com.rxjava.project.user;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name="UserInfo")
public class User {

    @Id
    @GeneratedValue
    int userCode;
    String userId;
    String userPwd;
    String userName;

}
