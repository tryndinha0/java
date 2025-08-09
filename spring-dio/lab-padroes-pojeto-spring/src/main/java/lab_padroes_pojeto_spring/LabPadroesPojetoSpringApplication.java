package lab_padroes_pojeto_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class LabPadroesPojetoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabPadroesPojetoSpringApplication.class, args);
	}

}
