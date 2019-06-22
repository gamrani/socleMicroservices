package com.StatistiqueService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/statistique")
public class StatistiqueController {

	@GetMapping("/get")
	public String get() {
		return "statistique controller";
	}
}
