package com.janith.shoppingcart.repository;

import com.janith.shoppingcart.model.CartShow;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartShowRepository extends JpaRepository<CartShow,Long> {
}
