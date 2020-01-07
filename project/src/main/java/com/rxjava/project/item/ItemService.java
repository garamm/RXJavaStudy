package com.rxjava.project.item;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service
@RequestMapping(value = "/item")
public class ItemService {

    @Autowired
    ItemRepository repository;

    List<Item> findItem(String groupLevel, int groupKey) {
        return repository.findItem(groupLevel, groupKey);
    }

}
