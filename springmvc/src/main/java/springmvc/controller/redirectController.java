package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class redirectController {
	
	@RequestMapping("/one")
	public String redirectURL() {
		return "redirect:/enjoy";
	}
	
	@RequestMapping("/two")
	public String redirectURL2() {
		return "contact";
	}

}
