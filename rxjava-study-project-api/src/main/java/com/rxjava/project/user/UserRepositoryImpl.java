package com.rxjava.project.user;

import com.querydsl.jpa.JPQLQuery;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl extends QuerydslRepositorySupport implements UserRepositoryCustom {

    private final JPAQueryFactory queryFactory;

    public UserRepositoryImpl(JPAQueryFactory queryFactory) {
        super(User.class);
        this.queryFactory = queryFactory;
    }

    @Override
    public User doLogin(String id, String pwd) {
        QUser pr = QUser.user;
        JPQLQuery jpqlQuery = from(pr);
        jpqlQuery.where(
                pr.userId.eq(id)
                        .and(pr.userPwd.eq(pwd)));
        List<User> userList = jpqlQuery.fetch();
        if (userList.size() == 0) {
            return null;
        } else {
            return userList.get(0);
        }
    }
}
