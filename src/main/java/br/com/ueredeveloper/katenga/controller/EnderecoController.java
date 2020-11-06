package br.com.ueredeveloper.katenga.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnderecoController {
	
	 @GetMapping("/api/hello")
	 public String hello() {
		 return "Hello World Spring and React";
	 }

}
