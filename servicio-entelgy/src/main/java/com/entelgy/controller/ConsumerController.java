package com.entelgy.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entelgy.dto.DataResponseDTO;
import com.entelgy.service.ConsumerService;

@RestController
public class ConsumerController {
	
	@Autowired
	private ConsumerService consumerService;
	
	@PostMapping("/consumer/reqres")
	public DataResponseDTO getInformationApi() {
		return consumerService.getInformationApi();
	}

}
