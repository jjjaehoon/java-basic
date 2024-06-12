package com.helloshop.order;

import com.helloshop.product.Product;
import com.helloshop.user.User;

public class OrderService {

    public void order() {
        //패키지 구조 공부를 위한 예시 클래스
        User user = new User();
        Product product = new Product();
        Order order = new Order(user, product);
    }
}
