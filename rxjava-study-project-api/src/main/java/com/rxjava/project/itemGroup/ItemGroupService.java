package com.rxjava.project.itemGroup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemGroupService {

    @Autowired
    ItemGroupRepository repository;

    List<ItemGroup> findAll() {
        return repository.findAll();
    }
}
