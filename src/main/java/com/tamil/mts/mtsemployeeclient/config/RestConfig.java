/*
 * Created on 06-Oct-2020
 * Created by murugan
 * Copyright � 2020 MTS [murugan425]. All Rights Reserved.
 */
package com.tamil.mts.mtsemployeeclient.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.Setter;

/**
 * @author murugan
 *
 */
@Getter
@Setter
@Configuration
@ConfigurationProperties(prefix = "mts.resttemplate", ignoreUnknownFields = false)
public class RestConfig {

	private Integer maxTotalConnection;
	
	private Integer maxConnectionPerRoute;
	
	private Integer requestTimeOut;
	
	private Integer socketTimeOut;
}
