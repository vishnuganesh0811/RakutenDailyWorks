package come.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseStatus(HttpStatus.CREATED)
public class OrderController {
	@Autowired
	OrderService orderService;
	@PostMapping("/order")
	void createOrder(@RequestBody Order order) {
		orderService.saveOrder(order);
	}

	@GetMapping("/order")
	void getorders() {
		System.out.println("Get Method called!!!!");
	}

}