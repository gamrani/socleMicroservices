package com.StatistiqueService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.StatistiqueService.config.AccountClient;

@RestController
@RequestMapping("/statistique")
public class StatistiqueController {

	@Autowired
	AccountClient accountClient;
	
	@GetMapping("/get")
	public String get() {
		return "statistique controller";
	}
	
	@GetMapping("/account")
	public String getStatistiquesOfAnAccount() {
		System.out.println("in the statistique controller");
       return accountClient.getAccount();
	}
}
