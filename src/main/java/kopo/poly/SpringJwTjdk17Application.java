package kopo.poly;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class SpringJwTjdk17Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringJwTjdk17Application.class, args);
    }

}
