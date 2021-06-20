package com.example.demo.index;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Index {
	@RequestMapping("/")
	public String message(){
		return "Simplilearn --> Step three -- > project Two --> Salem";
	}

}
