package org.example.member.rds;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@EntityScan("org.example.member")
@EnableJpaRepositories("org.example.member")
public class MemberDomainConfig {
}
