package rt.aplikacja;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;



/**
 * http://localhost:8080/customer
 * {
  "id" : "1",
   "name" : "dupa",
   "age" : "21"
}
 * @author rafal
 *
 */

@SpringBootApplication
@ImportResource({"classpath:spring-integration.xml"})
public class MicroserviceBootSpringIntegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceBootSpringIntegrationApplication.class, args);
	}
}
