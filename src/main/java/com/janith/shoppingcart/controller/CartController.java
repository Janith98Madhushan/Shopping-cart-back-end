package com.janith.shoppingcart.controller;

import com.janith.shoppingcart.model.Cart;
import com.janith.shoppingcart.model.CartShow;
import com.janith.shoppingcart.repository.CartShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("api/cart")
public class CartController {

    @Autowired
    private CartShowRepository cartShowRepository;
    private CartShow cartShow;





    @GetMapping("/products")
    public List<Cart> getAllProducts(){
        //return cartShowRepository.findAll();
        List<CartShow> list = cartShowRepository.findAll();
        List<Cart> cartList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            Cart cart = new Cart();
            cart.setId(list.get(i).getId());
            cart.setPName(list.get(i).getpName());
            cart.setUnits(list.get(i).countUnits(list.get(i).getUnits(),list.get(i).getpName()));
            cart.setCartons(list.get(i).countCartons(list.get(i).getUnits(),list.get(i).getpName()));
            cart.setCost(list.get(i).getCost(list.get(i).getUnits(),list.get(i).getpName()));
            cartList.add(i,cart);
        }
        return cartList;

    }

    @GetMapping("/costs")
    public double getAllCosts() {
        List<CartShow> list = cartShowRepository.findAll();

        List<Double> cost_list = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {

            cost_list.add(i, list.get(i).getCost(list.get(i).getUnits(),list.get(i).getpName()));
        }

        double price = 0;
        for(int j=0;j<cost_list.size();j++){
            price = price + cost_list.get(j).doubleValue();
        }
        return price;
    }



    @PostMapping
    public CartShow createCartShow(@RequestBody CartShow cartShow){

        return cartShowRepository.save(cartShow);
    }
}
