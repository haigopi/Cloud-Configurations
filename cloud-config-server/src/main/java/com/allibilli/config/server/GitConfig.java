package com.allibilli.config.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.config.server.environment.JGitEnvironmentRepository;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class GitConfig {

    @Value("${spring.cloud.config.server.git.username}")
    private String username;

    @Value("${spring.cloud.config.server.git.password}")
    private String password;

    @Autowired
    private JGitEnvironmentRepository repository;

    @PostConstruct
    public void setup() {
    }

}