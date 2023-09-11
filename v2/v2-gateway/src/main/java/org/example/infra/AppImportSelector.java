package org.example.infra;

import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Arrays;
import java.util.Map;

public class AppImportSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        Map<String, Object> attributes = importingClassMetadata.getAnnotationAttributes(EnableInfraConfig.class.getName());
        if (attributes == null) {
            return new String[0];
        }
        AppConfigGroup[] group = (AppConfigGroup[])attributes.get("value");
        return Arrays.stream(group)
                .map(e -> e.configClass().getName())
                .toArray(String[]::new);
    }
}
