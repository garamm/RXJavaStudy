package com.rxjava.project.board;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int commentCode;
    int itemCode;
    int userCode;
    String writeDate;
    String writePwd;
    String content;
    int parentCode;

}
