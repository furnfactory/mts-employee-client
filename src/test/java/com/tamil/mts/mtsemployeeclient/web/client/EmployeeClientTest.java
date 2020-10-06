/*
 * Created on 06-Oct-2020
 * Created by murugan
 * Copyright � 2020 MTS [murugan425]. All Rights Reserved.
 */
package com.tamil.mts.mtsemployeeclient.web.client;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.tamil.mts.mtsemployeeclient.web.model.EmployeeDto;

/**
 * @author murugan
 *
 */
@SpringBootTest
public class EmployeeClientTest {

	@Autowired
	EmployeeClient employeeClient;
	
	@Test
	void getEmployeeById() {
		EmployeeDto employeeDto = employeeClient.getEmployeeById(UUID.randomUUID());
		assertNotNull(employeeDto);
	}
}
