package com.rxjava.project.util;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;

@Getter
@Setter
public class ResultDto {

    int status;
    String message;
    Object data;
}
