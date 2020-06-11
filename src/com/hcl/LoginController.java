package com.hcl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes("status")
public class LoginController {

	@RequestMapping("/loginpage")
	public String loginPage() {
		return "loginform";
	}

	@RequestMapping("/login")
	public String login(@RequestParam("uname") String uname, @RequestParam("upwd") String upwd, ModelMap map)
			throws Exception {
		String status = "";
		if (uname.equals("durga") && upwd.equals("durga")) {
			map.addAttribute("status", "Login Success");
		} else {
			map.addAttribute("status", "Login Failure");
		}
		return "status";
	}

	@RequestMapping("/login1")
	public ModelAndView login1(@RequestParam("uname") String uname, @RequestParam("upwd") String upwd)
			throws Exception {
		
		ModelAndView modelAndView = new ModelAndView("status1");
		if (uname.equals("durga") && upwd.equals("durga")) {
			modelAndView.addObject("msg", "Login Successful");
		} else {
			modelAndView.addObject("msg", "Login Failuredddd");
		}
		return modelAndView;
	}
}
