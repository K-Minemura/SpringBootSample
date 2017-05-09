package jp.gr.java_conf.kmine27.springboot.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("message", "Hello world !!");
		return "index";
	}
}
