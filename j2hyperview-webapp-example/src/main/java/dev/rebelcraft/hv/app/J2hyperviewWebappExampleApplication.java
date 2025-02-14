package dev.rebelcraft.hv.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class J2hyperviewWebappExampleApplication {

	public static void main( String[] args ) {
		SpringApplication.run( J2hyperviewWebappExampleApplication.class, args );
	}

	@Configuration
	public class WebConfig implements WebMvcConfigurer {
		@Override
		public void addCorsMappings( final CorsRegistry registry ) {
			registry.addMapping( "/**" )
					.allowedOrigins( "*" )
					.allowedMethods( "GET", "HEAD", "POST", "PUT", "DELETE", "OPTIONS" )
					.allowCredentials( false );
		}
	}

}
