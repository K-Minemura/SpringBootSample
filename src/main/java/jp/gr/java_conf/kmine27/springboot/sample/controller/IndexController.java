package jp.gr.java_conf.kmine27.springboot.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import jp.gr.java_conf.kmine27.springboot.sample.service.MessageService;

@Controller
public class IndexController {

	@Autowired
	private MessageService service;

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(Model model) {
		model.addAttribute("message", "Hello world !!");
		model.addAttribute("messageList", service.findAll());
		return "index";
	}
	
	@RequestMapping(value = "/index", method = RequestMethod.POST)
	public String post(Model model, @RequestParam("msg") String message) {
		service.create(message);
		return "redirect:/index";
	}
	
	@RequestMapping("/")
	@ResponseBody
	public String rest() {
		return "Happy Merry X'mas !! \r\n" +
				"　 ＋　　・　 ＋\r\n" + 
				"　　　 ﾟ｡：｡ﾟ　　＋\r\n" + 
				"＊ 　・‥☆‥・\r\n" + 
				"　　＋ ｡ﾟｗﾟ｡　 ＊\r\n" + 
				"　　　　从从　＋\r\n" + 
				"　 ＊　从ﾟ*★　　 ＊\r\n" + 
				"　　　ﾟ*★彡从\r\n" + 
				"十　 ▲彡从ﾟ*★\r\n" + 
				"　　彡从ﾟ*▲彡从　十\r\n" + 
				"　 从ﾟ*★彡从ﾟ*▲\r\n" + 
				"　ﾟ*◆彡从ﾟ*★彡从\r\n" + 
				"`★彡从ﾟ*●彡从ﾟ*★\r\n" + 
				"彡从ﾟ*★彡从ﾟ*▲彡从\r\n" + 
				"　　　　||||\r\n" + 
				"　　[巫巫巫巫巫]\r\n" + 
				"";
	}
}
