package com.entelgy.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.entelgy.clients.IClientReqRes;
import com.entelgy.dto.DataResponseDTO;
import com.entelgy.dto.EmployeeDTO;

@ExtendWith(MockitoExtension.class)
class ConsumerServiceTest {
	
	@InjectMocks
	private ConsumerService consumerService;
	
	@Mock
	private IClientReqRes client;
	
	@BeforeEach
	void setUp() throws Exception {
		Mockito.mock(ConsumerService.class);
		Mockito.mock(IClientReqRes.class);
	}

	@Test
	void testGetInformationApi() {
		DataResponseDTO response = new DataResponseDTO();
		List<EmployeeDTO> data = new ArrayList<>();
		EmployeeDTO obj1 = new EmployeeDTO();
		obj1.setId(1);
		obj1.setEmail("roberto@gmail.com");
		obj1.setLastName("Carlin");
		data.add(obj1 );
		response.setData(data );
		when(client.getDataFromApi()).thenReturn(response);
		DataResponseDTO responseService = consumerService.getInformationApi();
		assertThat(responseService.getData().size()).isEqualTo(1);
	}

}
