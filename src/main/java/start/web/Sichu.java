package start.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sichu {
	@GetMapping("/welcome")
	public String crime() {
		return "Hello world";
	}
}
