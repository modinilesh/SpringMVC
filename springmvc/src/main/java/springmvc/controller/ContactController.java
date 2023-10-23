package springmvc.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;
import springmvc.ObjectHandler.ContactObject;
import springmvc.dao.ContactDao;
import springmvc.service.UserContactService;

@Controller
public class ContactController {
	
	@Autowired
	private UserContactService userContactService;
	
	
	//This data I want to sent on every view Page
	@ModelAttribute
	public void commonDataForViewPage(Model m) {
		LocalDateTime now = LocalDateTime.now();
		m.addAttribute("time", now);
		m.addAttribute("pageBy", "@NileshModi");
	}

	//to show the Contact Form to user
	@RequestMapping("/contact")
	public String showForm() {
		return "contact";
	}
	
	
	//to handle the data input from user
	//Method;1 --> Traditional servlet approach
	/*
	 * @RequestMapping(path = "/processform", method = RequestMethod.POST) public
	 * String handleForm(HttpServletRequest request) { String email =
	 * request.getParameter("email"); System.out.println("User Email is : "+ email);
	 * return ""; }
	 */

	
/*	
	//Method;2 ---> Using @RequestParam      (provided by springmvc)
	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(
			@RequestParam("email") String userEmail,
			@RequestParam("username") String userName,
			@RequestParam("password") String userPassword,
			Model model) {
		
//		System.out.println("User email is : "+ userEmail);
//		System.out.println("User Name is : "+ userName);
//		System.out.println("User password is : "+ userPassword);
		ContactObject obj = new ContactObject();
		obj.setEmail(userEmail);
		obj.setUsername(userName);
		obj.setPassword(userPassword);
		System.out.println(obj);
		
//		model.addAttribute("email", userEmail);
//		model.addAttribute("name", userName);
//		model.addAttribute("password", userPassword);
		model.addAttribute("data",obj );
		return "success";
	}
	
	
*/
	
	//Method 3----> Using @ModelAttribute
	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute ContactObject contactObject, Model model) {
		System.out.println(contactObject);
		
		//Let's create and inject the object in DB
		int userId = (Integer) this.userContactService.createUser(contactObject);

		//using userId at success page
		model.addAttribute("msg", "User created with ID : "+userId);
		
		return "success";
	}
	
}
