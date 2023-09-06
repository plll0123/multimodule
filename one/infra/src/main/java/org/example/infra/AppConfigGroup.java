package org.example.infra;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum AppConfigGroup {

    JPA(JpaConfig.class);

    private final Class<? extends AppConfig> configClass;
}
