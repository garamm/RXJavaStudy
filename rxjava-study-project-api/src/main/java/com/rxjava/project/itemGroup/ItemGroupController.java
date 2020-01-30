package com.rxjava.project.itemGroup;

import com.rxjava.project.util.ResultDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/group")
public class ItemGroupController {

    @Autowired
    ItemGroupService service;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public ResponseEntity findAll() {

        List<ItemGroup> groupList = service.findAll();
        ResultDto resultDto = new ResultDto();
        resultDto.setStatus(200);
        resultDto.setMessage("상품 그룹 조회 성공");
        resultDto.setData(groupList);
        return new ResponseEntity(resultDto, HttpStatus.OK);
    }


}
