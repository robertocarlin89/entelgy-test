package com.entelgy.util;

import com.entelgy.clients.bean.ResponseAPI;

import java.util.stream.Collectors;

import com.entelgy.clients.bean.DataApi;
import com.entelgy.dto.DataResponseDTO;
import com.entelgy.dto.EmployeeDTO;

public class ConsumerMapper {
	
	public static DataResponseDTO convertoToDataResponseDTO(ResponseAPI responseApi) {
		DataResponseDTO respDTO = new DataResponseDTO();
		respDTO.setData(responseApi.getData().stream().map(t -> convertToObject(t)).collect(Collectors.toList())); 
		return respDTO;
		
	}
	
	private static EmployeeDTO convertToObject(DataApi dataApi) {
		EmployeeDTO e = new EmployeeDTO();
		e.setId(dataApi.getId());
		e.setEmail(dataApi.getEmail());
		e.setLastName(dataApi.getLast_name());
		return e;
	}
}
