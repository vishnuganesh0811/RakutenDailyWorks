package come.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
@RequestMapping(value="/order")
	void speedDelivery() {
		System.out.println("Speed delivery for this order");
		
	}
	void normalDelivery() {
		System.out.println("Normal delivery for this ordered");
		
	}
	@PostMapping("/newOrder")
	void createOrder( @RequestParam("orderId")long orderId, 
	@RequestParam("name") String name,
	@RequestParam("price")double price)
	
	{
		if (price>500.00)
		{
			speedDelivery();
		}
		
		else {
			normalDelivery();
		}
	}
	
	@GetMapping("/order")
	void getorders()
	{
		System.out.println("Get Method called!!!!");
	}

}