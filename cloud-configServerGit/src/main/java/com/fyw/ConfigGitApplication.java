package com.fyw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by fyw on 2019/8/3.
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigGitApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigGitApplication.class, args);
    }
}
