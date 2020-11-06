package com.avinashk.learning;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigProperties {

	@Value("${app.name}")
	private String appName = "";

	public String getAppName() {
		return this.appName;
	}

	@Value("${app.description}")
	private String description = "";

	public String getDescription() {
		return this.description;
	}

}
