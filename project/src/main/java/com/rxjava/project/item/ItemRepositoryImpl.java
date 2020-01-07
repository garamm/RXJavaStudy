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
    public List<Item> findItem(String groupLevel, int groupKey) {

        QItem pr = QItem.item;
        JPQLQuery jpqlQuery = from(pr);

        switch (groupLevel) {
            case "big":
                break;
            case "middle":
                break;
            case "small":
                break;
            default:
                break;
        }
        return null;
    }
}
