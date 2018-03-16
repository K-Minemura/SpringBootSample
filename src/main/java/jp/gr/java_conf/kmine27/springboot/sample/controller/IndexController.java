package jp.gr.java_conf.kmine27.springboot.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import jp.gr.java_conf.kmine27.springboot.sample.controller.form.MessageForm;
import jp.gr.java_conf.kmine27.springboot.sample.service.MessageService;
import jp.gr.java_conf.kmine27.springboot.sample.util.AsciiArtUtil;

@Controller
public class IndexController {

	@Autowired
	private MessageService service;

	@Autowired
	private AsciiArtUtil aaUtil;

	@ModelAttribute
	public MessageForm setUpForm() {
	    return new MessageForm();
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(Model model) {
		model.addAttribute("message", "Hello world !!");
		model.addAttribute("messageList", service.findAll());
		return "index";
	}
	
    @RequestMapping(value = "/index", method = RequestMethod.POST)
    public String post(@Validated MessageForm messageForm, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return index(model);
        }
        service.create(messageForm.getMsg());
        return "redirect:/index";
    }

	@RequestMapping("/")
	@ResponseBody
	public String rest() {
	    return aaUtil.createTree();
	}
}
