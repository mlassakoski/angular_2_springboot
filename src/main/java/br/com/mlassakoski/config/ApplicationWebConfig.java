package br.com.mlassakoski.config;

import java.io.IOException;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ResourceProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.resource.PathResourceResolver;

@Configuration
public class ApplicationWebConfig extends WebMvcConfigurerAdapter{

	@Autowired
	private final ResourceProperties resourceProperties = new ResourceProperties();
	
	static final String[] RESOURCES = new String[] { "/**/*.html", "/**/*.css", "/**/*.js"};


	@Override
	public void addResourceHandlers(final ResourceHandlerRegistry location) {
		final Integer cachePeriod = resourceProperties.getCachePeriod();
		
		location.addResourceHandler(RESOURCES).addResourceLocations(resourceProperties.getStaticLocations())
		.setCachePeriod(cachePeriod);

		final String[] indexLocations = getIndexLocations();
		
		location.addResourceHandler("/**").addResourceLocations(indexLocations).setCachePeriod(cachePeriod)
		.resourceChain(true).addResolver(new PathResourceResolver() {
			@Override
			protected Resource getResource(final String resourcePath, final Resource location)
					throws IOException {
				return location.exists() && location.isReadable() ? location : null;
			}
		});
	}

	private String[] getIndexLocations() {
		return Arrays.stream(resourceProperties.getStaticLocations()).map((location) -> location + "index.html")
				.toArray(String[]::new);
	}

}
