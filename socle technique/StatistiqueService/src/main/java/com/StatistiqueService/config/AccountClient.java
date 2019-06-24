package com.StatistiqueService.config;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("account-service")
public interface AccountClient {
	@GetMapping("/account/get")
	String getAccount();

}
