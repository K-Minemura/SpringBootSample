package jp.gr.java_conf.kmine27.springboot.sample.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@SessionAttributes("timestamp")
public class SessionController {

	@RequestMapping("/session")
	public String session(Model model) {
		setIpAddress(model);
		return "session";
	}

	@RequestMapping("/session/in")
	public String sessionIn(Model model) {
		setIpAddress(model);
		DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
		model.addAttribute("timestamp", LocalDateTime.now().format(formatter));
		return "session";
	}

	@RequestMapping("/session/clear")
	public String clear(Model model, SessionStatus session) {
		session.setComplete();
		return "redirect:/session";
	}

	private void setIpAddress(Model model) {
		String message = "failed.";
		try {
			message = InetAddress.getLocalHost().getHostAddress();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		model.addAttribute("message", message);
	}

}
