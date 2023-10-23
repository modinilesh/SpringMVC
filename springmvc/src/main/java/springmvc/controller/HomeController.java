package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
import java.util.*;

@Controller
@RequestMapping("/first")
public class HomeController {
	
	@RequestMapping(path = "/home", method = RequestMethod.GET)
	public String firstPage() {
		System.out.println("This is Home URL.");
		return "redirect:/index";
	}
	
	@RequestMapping(path = "/index", method = RequestMethod.GET)
	public String home() {
		System.out.println("This is Home URL.");
		return "index";
	}
	
	@RequestMapping("/about")
	public String about(Model model) {
		System.out.println("This is about URL.");
		
		//Using model to send data to view page
		model.addAttribute("name", "Sumit Modi");
		model.addAttribute("Id", 12345);
		
		List<String> list = new ArrayList<>();
		list.add("Sumit");
		list.add("Kapil");
		list.add("Shubham");
		list.add("Avinash");
		model.addAttribute("friends", list);
		
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		//using ModelAndView
		ModelAndView modelandview = new ModelAndView();
		Random rand = new Random(); //creating for roll number
		List<String> list = new ArrayList<>();
		list.add("Sumit");
		list.add("Kapil");
		list.add("Shubham");
		list.add("Avinash");
		
		//adding and setting the values
		modelandview.addObject("name", "Nilesh");
		modelandview.addObject("rollnum", rand.nextInt());
		
		LocalDateTime now = LocalDateTime.now();
		modelandview.addObject("time", now);
		
		modelandview.addObject("friends", list);
		
		//setting view name
		modelandview.setViewName("help");
		
		return modelandview;
	}
}
