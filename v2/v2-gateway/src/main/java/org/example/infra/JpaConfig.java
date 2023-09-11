package org.example.infra;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@EntityScan("org.example")
@EnableJpaRepositories("org.example")
public class JpaConfig implements AppConfig {

}
