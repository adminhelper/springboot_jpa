package me.sungmun.springdata.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableJpaRepositories(repositoryImplementationPostfix = "test")
@EnableJpaRepositories(repositoryBaseClass = SimpleMyRepository.class)
public class DemoApplication {

    public static void main (String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
