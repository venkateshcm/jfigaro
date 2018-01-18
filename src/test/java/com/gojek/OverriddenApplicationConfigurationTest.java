package com.gojek;

import org.junit.Test;

import java.util.Collections;
import java.util.Properties;

import static org.junit.Assert.*;

public class OverriddenApplicationConfigurationTest {

    @Test
    public void shouldReturnOverridenValue() {
        Properties overrides = new Properties();
        String expectedValue = "overriden_value";
        overrides.setProperty("some_name", expectedValue);
        ApplicationConfiguration configure = new ApplicationConfiguration() {
            public Object getValue(String name) {
                return "1.0";
            }
        };

        OverriddenApplicationConfiguration overriddenApplicationConfiguration = new OverriddenApplicationConfiguration(configure, overrides);
        String actualValue = overriddenApplicationConfiguration.getValueAsString("some_name");
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void shouldReturnNonOverridenValue() {
        Properties overrides = new Properties();
        String overridenValue = "overriden_value";
        overrides.setProperty("some_name", overridenValue);
        final String expectedValue = "1.0";
        ApplicationConfiguration configure = new ApplicationConfiguration() {
            public Object getValue(String name) {
                return expectedValue;
            }
        };

        OverriddenApplicationConfiguration overriddenApplicationConfiguration = new OverriddenApplicationConfiguration(configure, overrides);
        String actualValue = overriddenApplicationConfiguration.getValueAsString("existing_key");
        assertEquals(expectedValue, actualValue);
    }
}
