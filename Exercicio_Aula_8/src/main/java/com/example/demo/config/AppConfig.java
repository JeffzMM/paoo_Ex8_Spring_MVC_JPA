package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.example.demo.model.utils.CalculadoraDeVeiculos;

@Configuration
public class AppConfig {
	
	@Bean
	public CalculadoraDeVeiculos getCalculadoraDeVeiculos () {
		return new CalculadoraDeVeiculos();
	}

}
