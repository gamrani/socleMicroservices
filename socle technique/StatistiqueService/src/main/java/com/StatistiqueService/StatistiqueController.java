package com.StatistiqueService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.StatistiqueService.config.AccountClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("/home")
public class StatistiqueController {

	@Autowired
	AccountClient accountClient;
	
	@GetMapping("/get")
	public String get() {
		return "statistique controller";
	}
	
	@PostMapping("/account")
	@HystrixCommand(fallbackMethod = "defaultCall")
	public String getStatistiquesOfAnAccount(@RequestBody Request request) {
		System.out.println("in the statistique controller");
		String compte = accountClient.getAccount(request.getAccount());
		
        return compte+" 100% SUCCESS";
	}
	
	public String defaultCall(@RequestBody Request request) {
		return "Default operations";
	}
	
	
}

class Request{
	String account;

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}
	
	
}
