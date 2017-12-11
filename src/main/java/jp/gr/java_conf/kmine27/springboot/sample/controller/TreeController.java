package jp.gr.java_conf.kmine27.springboot.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jp.gr.java_conf.kmine27.springboot.sample.util.AsciiArtUtil;

@Controller
public class TreeController {

    @Autowired
    private AsciiArtUtil aaUtil;

    @RequestMapping("/tree")
	@ResponseBody
	public String rest() {
		return aaUtil.createTree();
	}
}
