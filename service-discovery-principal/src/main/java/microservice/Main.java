package microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class Main {

	@Bean
	@LoadBalanced
	public RestTemplate getresttemplate() {
		return new RestTemplate();
	}
	public static void main(String[] args) {
		
		SpringApplication.run(Main.class, args);
		System.out.println("I am in");
	}

}
