package com.dev;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebApplnController {

	
	  @GetMapping("/hello") 
	  public Collection<String> sayHello() 
	  { 
		  return  IntStream.range(0, 10) .mapToObj(i -> "Hello number " + i)
			  .collect(Collectors.toList()); 
	  }
	 
	
	@PostMapping("/authenticate")
	public String authenticate() {
		return "User authenticated successfully !";
	}
	
	@PostMapping("/inter/payments")
	public String payments() {
		return "Payment page retrieved !";
	}
	
	@PostMapping("/inter/payments/select")
	public String paymentSelect() {
		return "Payment Type is selected !";
	}
}
