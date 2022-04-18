package come.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
@PostMapping("/order")
	void createOrder() {
	System.out.println("test");
		
	}

}
