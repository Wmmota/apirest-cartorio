package br.com.wesley.mota.registrocartorio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;

@SpringBootApplication(scanBasePackages = "br.com.wesley.mota.registrocartorio")
@EntityScan(basePackages = "br.com.wesley.mota.registrocartorio.model")
public class RegistroCartorioApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegistroCartorioApplication.class, args);
	}

}
