package br.com.erudio;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.mangofactory.swagger.configuration.SpringSwaggerConfig;
import com.mangofactory.swagger.models.dto.ApiInfo;
import com.mangofactory.swagger.plugin.EnableSwagger;
import com.mangofactory.swagger.plugin.SwaggerSpringMvcPlugin;

//@Configuration
//@EnableAutoConfiguration
//@EnableSwagger
//@ComponentScan(basePackages = {"br.com.erudio"})
@SpringBootApplication
public class SimpleRestExampleSwaggerApplication {

	/* @Autowired
	    private SpringSwaggerConfig swaggerConfig;
*/	 
	public static void main(String[] args) {
		SpringApplication.run(SimpleRestExampleSwaggerApplication.class, args);
	}

	
	
	/*@Bean
    public SwaggerSpringMvcPlugin groupOnePlugin() {
       return new SwaggerSpringMvcPlugin(swaggerConfig)
           .apiInfo(apiInfo())
           .includePatterns("/person.*?", "/greeting.*?")
           .swaggerGroup("admin");
    }
*/    
    /*private ApiInfo apiInfo() {
       ApiInfo apiInfo = new ApiInfo(
             "Swagger With Spring Boot",
             "This is a simple application to demonstrate how to work with Swagger in Spring Boot project!",
             "Free to use and mess around",
             "erudio@gmail.com",
             "Open Licence",
             "myemail@gmail.com"
       );
       return apiInfo;
    }*/
    
    
    
}
