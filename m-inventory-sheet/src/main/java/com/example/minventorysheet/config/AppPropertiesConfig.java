package com.example.minventorysheet.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("app-config")
@Getter
@Setter
public class AppPropertiesConfig {
    private int defaultPage;
    private int defaultSize;
}
