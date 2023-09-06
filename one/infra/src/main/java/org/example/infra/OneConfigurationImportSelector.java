package org.example.infra;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;


public class OneConfigurationImportSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return Arrays.stream(appConfigArrays(importingClassMetadata))
                .map(e -> e.getConfigClass().getName())
                .toArray(String[]::new);
    }

    private static AppConfigGroup[] appConfigArrays(AnnotationMetadata importingClassMetadata) {
        Map<String, Object> annotationAttributes = importingClassMetadata.getAnnotationAttributes("um");
        return (AppConfigGroup[]) Optional.ofNullable(annotationAttributes)
                .map(e -> e.get("value"))
                .orElse(new AppConfigGroup[0]);
    }
}
