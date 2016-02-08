package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TssController {
	@RequestMapping("/cf")
	String hello() {
		return "Hello cloud founders!";
	};

}
