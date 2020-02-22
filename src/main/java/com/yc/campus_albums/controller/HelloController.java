package com.yc.campus_albums.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author 杨超
 * @Date 2020/2/22
 * @Time 15:42
 */
@Controller
public class HelloController {

	@GetMapping("/hello")
	public String hello(@RequestParam(name="name") String name, Model model){
		model.addAttribute("name",name);
		return "hello";
	}
}
