package br.com.mlassakoski.config;

import java.io.IOException;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.resource.PathResourceResolver;

@Configuration
public class ApplicationWebConfig extends WebMvcConfigurerAdapter{

	
	@Override
	public void addResourceHandlers(final ResourceHandlerRegistry registry) {
		
		// I mappad the location where is my html and js files
		registry.addResourceHandler("/**").addResourceLocations("classpath:/static/index.html")
		.resourceChain(true).addResolver(new PathResourceResolver() {
			@Override
			protected Resource getResource(final String resourcePath, final Resource location)
					throws IOException {
				return location.exists() && location.isReadable() ? location : null;
			}
		});
	}

}
