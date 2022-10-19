package com.janith.shoppingcart;

import com.janith.shoppingcart.model.CartShow;
import com.janith.shoppingcart.repository.CartShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShoppingCartApplication  implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingCartApplication.class, args);
	}

	@Autowired
	private CartShowRepository cartShowRepository;
	@Override
	public void run(String... args) throws Exception {
		/*CartShow cartShow1 = new CartShow();
		cartShow1.setpName("Penguin-ears");
		cartShow1.setUnits(35);
		cartShowRepository.save(cartShow1);
		CartShow cartShow2 = new CartShow();
		cartShow2.setpName("Horseshoe");
		cartShow2.setUnits(65);
		cartShowRepository.save(cartShow2);
		String name = cartShow.getpName();
		int units = cartShow.getUnits();
		int cartons = cartShow.getCartons();
		double price = cartShow.getCost();
		System.out.println(name);
		System.out.println(units);
		System.out.println(cartons);
		System.out.println(price);
*/

	}
}
