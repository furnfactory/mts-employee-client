/*
 * Created on 06-Oct-2020
 * Created by murugan
 * Copyright � 2020 MTS [murugan425]. All Rights Reserved.
 */
package com.tamil.mts.mtsemployeeclient.web.client;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.net.URI;
import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.tamil.mts.mtsemployeeclient.web.model.EmployeeDto;

import lombok.extern.slf4j.Slf4j;

/**
 * @author murugan
 *
 */
@Slf4j
@SpringBootTest
public class EmployeeClientTest {

	@Autowired
	EmployeeClient employeeClient;

	@Test
	void getEmployeeById() {
		EmployeeDto employeeDto = employeeClient.getEmployeeById(UUID.randomUUID());
		assertNotNull(employeeDto);
	}

	@Test
	void createEmployee() {
		EmployeeDto employeeDto = EmployeeDto.builder().id(UUID.randomUUID()).name("Test New Employee").build();
		URI saveEmployeeUri = employeeClient.createEmployee(employeeDto);
		log.info("URI of saved Employee: " + saveEmployeeUri);
		assertNotNull(saveEmployeeUri);
	}

	@Test
	void updateEmployee() {
		EmployeeDto employeeDto = EmployeeDto.builder().id(UUID.randomUUID()).name("Test Update Employee").build();
		employeeClient.updateEmployee(employeeDto.getId(), employeeDto);
	}
	
	@Test
	void deleteEmployee() {
		employeeClient.deleteEmployee(UUID.randomUUID());
	}
}
