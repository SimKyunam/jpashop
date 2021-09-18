package com.jpabook.jpashop.repository;

import com.jpabook.jpashop.domain.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static com.jpabook.jpashop.domain.OrderSpec.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.data.jpa.domain.Specification.where;

@SpringBootTest
class OrderRepositoryTest {

    @Autowired
    OrderRepository orderRepository;

    @Test
    void test1() {
        String name = "aaa";
        List<Order> result = orderRepository.findAll(
            where(memberName(name)).and(isOrderStatus())
        );

        System.out.println(result);
    }
}