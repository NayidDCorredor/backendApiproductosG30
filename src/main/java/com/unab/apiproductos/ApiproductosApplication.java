package com.unab.apiproductos;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.modelmapper.spi.MatchingStrategy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ApiproductosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiproductosApplication.class, args);

		System.out.println(" Apiproductos ejecutandose-->");
	}

	@Bean
	public ModelMapper modelMapper(){

		ModelMapper modelMapper= new ModelMapper();

		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

		return modelMapper;

}
}
