package com.entelgy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entelgy.clients.IClientReqRes;
import com.entelgy.dto.DataResponseDTO;

@Service
public class ConsumerService {
	
	@Autowired
	private IClientReqRes client;
	
	
	public DataResponseDTO getInformationApi() {
       return client.getDataFromApi();
	}

}
