package be.stijnhooft.portal.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class PortalEureka {

	public static void main(String[] args) {
		SpringApplication.run(PortalEureka.class, args);
	}

}
