package com.mks.spring_github;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringDockerGithubCicdApplication {

    @GetMapping("/{name}")
    public ResponseEntity<String> getResponse(@PathVariable String name ) {
        return ResponseEntity.ok(name +" deployed spring app with github cicd action!!");
    }

	public static void main(String[] args) {
		SpringApplication.run(SpringDockerGithubCicdApplication.class, args);
	}

}
