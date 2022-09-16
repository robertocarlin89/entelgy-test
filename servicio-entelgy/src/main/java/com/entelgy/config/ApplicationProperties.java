package com.entelgy.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@PropertySource("classpath:application.properties")
@Component
public class ApplicationProperties {
	
	@Value("${api.url.external}")
    private String urlExternal;

	public String getUrlExternal() {
		return urlExternal;
	}

	public void setUrlExternal(String urlExternal) {
		this.urlExternal = urlExternal;
	}
	
	

}
