package org.example;

import org.example.board.config.BoardDomainConfig;
import org.example.member.rds.MemberDomainConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@Import({MemberDomainConfig.class, BoardDomainConfig.class})
@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}