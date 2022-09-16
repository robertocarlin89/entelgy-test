package com.entelgy.clients.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.entelgy.clients.IClientReqRes;
import com.entelgy.clients.bean.ResponseAPI;
import com.entelgy.config.ApplicationProperties;
import com.entelgy.dto.DataResponseDTO;
import com.entelgy.util.ConsumerMapper;

@Service
public class ClientReqResImpl implements IClientReqRes {
	
	@Autowired
	private ApplicationProperties application;
	
	@Override
	public DataResponseDTO getDataFromApi() {
		// TODO Auto-generated method stub
		
		RestTemplate restTemplate = new RestTemplate();
		String fooResourceUrl
		  = application.getUrlExternal();
		ResponseEntity<ResponseAPI> response
		  = restTemplate.getForEntity(fooResourceUrl, ResponseAPI.class);
		
		System.out.println("respon : " + response.toString());
		return ConsumerMapper.convertoToDataResponseDTO(response.getBody());
		
	}

}
