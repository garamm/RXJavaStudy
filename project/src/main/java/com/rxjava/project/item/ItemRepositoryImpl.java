package com.rxjava.project.item;

import com.querydsl.jpa.JPQLQuery;
import com.querydsl.jpa.impl.JPAQueryFactory;
import com.rxjava.project.user.QUser;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

import java.util.List;

public class ItemRepositoryImpl extends QuerydslRepositorySupport implements ItemRepositoryCustom {

    private final JPAQueryFactory queryFactory;

    public ItemRepositoryImpl(JPAQueryFactory queryFactory) {
        super(Item.class);
        this.queryFactory = queryFactory;
    }

    @Override
    public List<Item> findItem(int groupKey) {

        QItem pr = QItem.item;
        JPQLQuery jpqlQuery = from(pr);
        jpqlQuery.where(
                pr.groupCode.eq(groupKey)
        );

        return jpqlQuery.fetch();
    }
}
