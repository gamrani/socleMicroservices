package com.StatistiqueService.config;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient("account-service")
public interface AccountClient {
	@PostMapping("/home/get/{account}")
	String getAccount(@PathVariable("account") String account);

}
