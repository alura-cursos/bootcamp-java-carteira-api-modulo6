package br.com.alura.carteira;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class CarteiraApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarteiraApiApplication.class, args);
	}

}
