package com.rxjava.project.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;

@Getter
@Setter
public class ResultDto {

    int status;
    String message;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    Object data;
}
