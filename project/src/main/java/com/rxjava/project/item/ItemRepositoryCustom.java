package com.rxjava.project.item;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepositoryCustom {

    List<Item> findItem(String groupLevel, int groupKey);

}
