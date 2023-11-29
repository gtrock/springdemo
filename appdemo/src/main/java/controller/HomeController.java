package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping(value = "/mvc")
	public String home() {
		System.out.println("HomeController: Passing through...");
		return "home";
	}
}