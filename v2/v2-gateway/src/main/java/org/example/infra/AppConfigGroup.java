package org.example.infra;

public enum AppConfigGroup {

    JPA(JpaConfig.class);

    private final Class<? extends AppConfig> configClass;

    public Class<? extends AppConfig> configClass() {
        return configClass;
    }

    AppConfigGroup(Class<? extends AppConfig> configClass) {
        this.configClass = configClass;
    }
}
