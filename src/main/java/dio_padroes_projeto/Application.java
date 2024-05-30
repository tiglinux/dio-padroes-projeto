package dio_padroes_projeto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * Projeto SpringBoot gerado via SpringInitializer
 * Os seguintes módulos foram selecionados:
 * - SpringData JPA
 * - Spring Web
 * - H2 DataBase
 * - OpenFeign
 *
 * @author tiago
 */
@EnableFeignClients
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
