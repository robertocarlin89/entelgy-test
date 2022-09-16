package com.entelgy.clients.impl;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.entelgy.config.ApplicationProperties;
import com.entelgy.dto.DataResponseDTO;

@ExtendWith(MockitoExtension.class)
class ClientReqResImplTest {
	
	@InjectMocks
	private ClientReqResImpl clientReqResImpl;
	
	@Mock
	private ApplicationProperties application;
	
	@BeforeEach
	void setUp() throws Exception {
		Mockito.mock(ClientReqResImpl.class);
		Mockito.mock(ApplicationProperties.class);
	}

	@Test	
	void testGetDataFromApi() {		
		
		when(application.getUrlExternal()).thenReturn("https://reqres.in/api/users");
		DataResponseDTO response = clientReqResImpl.getDataFromApi();
		assertThat(response.getData().size()).isEqualTo(6);
	}

}
