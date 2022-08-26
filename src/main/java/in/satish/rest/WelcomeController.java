package in.satish.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@GetMapping("/")
	public String getWelcomeMsg() {
		
		return "Welcome to Secured API of Chandra It !.. ";
	}
}
