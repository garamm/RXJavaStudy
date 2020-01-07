package com.rxjava.project.item;

import com.rxjava.project.util.ResultDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/item")
public class ItemController {

    @Autowired
    ItemService service;


    @RequestMapping(value = "/select", method = RequestMethod.GET)
    public ResponseEntity findAll(@RequestParam("groupLevel") String groupLevel,
                                  @RequestParam("groupKey") int groupKey) {

        List<Item> itemList = service.findItem(groupLevel, groupKey);
        ResultDto resultDto = new ResultDto();
        resultDto.setStatus(200);
        resultDto.setMessage("상품 목록 조회 성공");
        resultDto.setData(itemList);
        return new ResponseEntity(resultDto, HttpStatus.OK);
    }
}
