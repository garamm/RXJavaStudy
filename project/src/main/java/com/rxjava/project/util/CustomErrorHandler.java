package com.rxjava.project.util;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomErrorHandler {

    // @Valid 오류 발생시 이벤트 핸들링
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Object processValidationError(MethodArgumentNotValidException ex) {
        ResultDto resultDto = new ResultDto();
        resultDto.setStatus(400);
        resultDto.setMessage(ex.getBindingResult().getAllErrors().get(0).getDefaultMessage());
        return new ResponseEntity(resultDto, HttpStatus.BAD_REQUEST);
    }

    // BadRequest
    @ExceptionHandler(MissingServletRequestParameterException.class)
    public Object badRequestException(MissingServletRequestParameterException ex) {
        ResultDto resultDto = new ResultDto();
        resultDto.setStatus(400);
        resultDto.setMessage("입력값을 정확히 입력해주시기 바랍니다.");
        return new ResponseEntity(resultDto, HttpStatus.BAD_REQUEST);
    }

    // Number Format Exception
    @ExceptionHandler(NumberFormatException.class)
    public Object numberFormatException(NumberFormatException ex) {
        ResultDto resultDto = new ResultDto();
        resultDto.setStatus(400);
        resultDto.setMessage("입력값의 자료형을 확인해주세요.");
        return new ResponseEntity(resultDto, HttpStatus.BAD_REQUEST);
    }

    // Null pointer Exception
    @ExceptionHandler(NullPointerException.class)
    public Object nullPointerException(NullPointerException e) {
        ResultDto resultDto = new ResultDto();
        resultDto.setStatus(400);
        resultDto.setMessage("Null Pointer Exception");
        return new ResponseEntity(resultDto, HttpStatus.BAD_REQUEST);
    }

}
