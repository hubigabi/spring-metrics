package pl.edu.pbs.springmetrics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringMetricsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMetricsApplication.class, args);
	}

}
