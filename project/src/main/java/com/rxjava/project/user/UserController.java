package com.rxjava.project.user;

import com.rxjava.project.util.ErrorHandler;
import com.rxjava.project.util.ResultDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/user")
public class UserController extends ErrorHandler {

    @Autowired
    UserService service;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseEntity login(@RequestParam("id") String id,
                                @RequestParam("pwd") String pwd) {

        System.out.println(id);
        System.out.println(pwd);
        User findUser = service.doLogin(id, pwd);

        ResultDto resultDto = new ResultDto();
        if (findUser == null) {
            resultDto.setStatus(400);
            resultDto.setMessage("아이디 혹은 비밀번호를 다시 확인해주시기 바랍니다.");
        } else {
            resultDto.setStatus(200);
            resultDto.setMessage("로그인 성공");
            resultDto.setData(findUser);
        }
        return new ResponseEntity(resultDto, HttpStatus.OK);
    }


}
