package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdhyayanSarthiController {
	
	@RequestMapping("/adhyayan-sarthi")
	public String home() {
		return "adhyayan-sarthi";
	}

}
