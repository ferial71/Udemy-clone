package com.ustudy.ustudy.repository;

import com.ustudy.ustudy.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {
}
