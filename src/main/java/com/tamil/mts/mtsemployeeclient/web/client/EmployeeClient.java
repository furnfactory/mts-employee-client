/*
 * Created on 06-Oct-2020
 * Created by murugan
 * Copyright � 2020 MTS [murugan425]. All Rights Reserved.
 */
package com.tamil.mts.mtsemployeeclient.web.client;

import java.util.UUID;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.tamil.mts.mtsemployeeclient.web.model.EmployeeDto;

import lombok.extern.slf4j.Slf4j;

/**
 * @author murugan
 *
 */
@Slf4j
@Component
@ConfigurationProperties(prefix = "mts.employee", ignoreUnknownFields = false)
public class EmployeeClient {

	private String apihost;

	private final String EMPLOYEE_API_PATH = "api/v1/employee/";

	private final RestTemplate restTemplate;

	/**
	 * @param restTemplate
	 */
	public EmployeeClient(RestTemplateBuilder restTemplateBuilder) {
		this.restTemplate = restTemplateBuilder.build();
	}

	/**
	 * @return the apihost
	 */
	public String getApihost() {
		return apihost;
	}

	/**
	 * @param apihost the apihost to set
	 */
	public void setApihost(String apihost) {
		this.apihost = apihost;
	}

	/**
	 * @param empId the empId to get the EmployeeDto
	 */
	public EmployeeDto getEmployeeById(UUID empId) {
		log.info("Host URL of Employee Service : " + apihost);
		return restTemplate.getForObject(apihost + EMPLOYEE_API_PATH + empId.toString(), EmployeeDto.class);
	}
}
