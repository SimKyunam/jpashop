package com.jpabook.jpashop.repository;

import com.jpabook.jpashop.domain.Order;
import com.jpabook.jpashop.domain.OrderSearch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>,
        JpaSpecificationExecutor<Order> {

    Order findOne(Long orderId);
    List<Order> findAll(OrderSearch orderSearch);
}
