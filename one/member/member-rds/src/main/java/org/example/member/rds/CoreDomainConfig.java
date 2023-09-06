package org.example.member.rds;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@EntityScan("com.example.member")
@EnableJpaRepositories("com.example.member")
public class CoreDomainConfig {
}
