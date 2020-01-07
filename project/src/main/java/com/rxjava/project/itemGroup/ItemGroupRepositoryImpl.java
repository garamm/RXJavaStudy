package com.rxjava.project.itemGroup;

import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

public class ItemGroupRepositoryImpl extends QuerydslRepositorySupport implements ItemGroupRepositoryCustom {

    private final JPAQueryFactory queryFactory;

    public ItemGroupRepositoryImpl(JPAQueryFactory queryFactory) {
        super(ItemGroup.class);
        this.queryFactory = queryFactory;
    }

}
