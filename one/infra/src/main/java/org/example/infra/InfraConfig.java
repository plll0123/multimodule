package org.example.infra;

import org.springframework.context.annotation.Configuration;

@Configuration
@EnableInfraConfig({
        AppConfigGroup.JPA
})
public class InfraConfig {
}
