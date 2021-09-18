package com.jpabook.jpashop.domain;

import lombok.Data;
import org.springframework.data.jpa.domain.Specification;

import static com.jpabook.jpashop.domain.OrderSpec.memberNameLike;
import static com.jpabook.jpashop.domain.OrderSpec.orderStatusEq;
import static org.springframework.data.jpa.domain.Specification.where;

@Data
public class OrderSearch {

    private String memberName;      //회원 이름
    private OrderStatus orderStatus;//주문 상태

    public Specification<Order> toSpecification() {
        return where(memberNameLike(memberName))
                .and(orderStatusEq(orderStatus));
    }
}
