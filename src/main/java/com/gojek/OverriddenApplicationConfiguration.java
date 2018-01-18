package com.gojek;

import java.util.Properties;

public class OverriddenApplicationConfiguration extends ApplicationConfiguration {

    private final ApplicationConfiguration config;
    private final Properties overrides;

    public OverriddenApplicationConfiguration(ApplicationConfiguration config, Properties overrides) {
        this.config = config;
        this.overrides = overrides;
    }

    @Override
    public Object getValue(String name) {
        String override = overrides.getProperty(name);
        if (override == null) {
            return config.getValue(name);
        }
        return override;
    }
}

