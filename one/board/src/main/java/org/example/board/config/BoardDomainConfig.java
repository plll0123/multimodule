package org.example.board.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@EntityScan("org.example.board")
@EnableJpaRepositories("org.example.board")
public class BoardDomainConfig {
}
