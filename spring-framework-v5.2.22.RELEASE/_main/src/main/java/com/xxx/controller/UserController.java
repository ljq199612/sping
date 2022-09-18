package com.xxx.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
	@GetMapping(value = "/hello")
	public String hello(){
		return "hello world";
	}
}
