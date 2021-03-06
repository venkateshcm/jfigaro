package com.gojek;


import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ApplicationConfigurationTest {

    private ApplicationConfiguration exampleConfiguration;

    @Test
    public void shouldGetValueAsStringViaCast() {
        exampleConfiguration = new ApplicationConfiguration() {
            public Object getValue(String name) {
                return "1.0";
            }
        };
        assertEquals("1.0", exampleConfiguration.getValueAsString("test"));
    }

    @Test
    public void shouldDefaultGetValueAsStringAsABlankString() {
        exampleConfiguration = new ApplicationConfiguration() {
            public Object getValue(String name) {
                return null;
            }
        };
        assertEquals("", exampleConfiguration.getValueAsString("test"));
    }

    @Test
    public void shouldGetOptionalValueAsString() {
        exampleConfiguration = new ApplicationConfiguration() {
            public Object getValue(String name) {
                return null;
            }
        };
        assertEquals("2.0", exampleConfiguration.getValueAsString("test", "2.0"));
    }

    @Test
    public void shouldGetValueAsInt() {
        exampleConfiguration = new ApplicationConfiguration() {
            public Object getValue(String name) {
                return "1";
            }
        };
        assertEquals(Integer.valueOf("1"), exampleConfiguration.getValueAsInt("test"));
    }

    @Test
    public void shouldDefaultGetValueAsIntAsZero() {
        exampleConfiguration = new ApplicationConfiguration() {
            public Object getValue(String name) {
                return null;
            }
        };
        assertEquals(Integer.valueOf(0), exampleConfiguration.getValueAsInt("test"));
    }

    @Test
    public void shouldGetOptionalValueAsInt() {
        exampleConfiguration = new ApplicationConfiguration() {
            public Object getValue(String name) {
                return null;
            }
        };
        assertEquals(Integer.valueOf(2), exampleConfiguration.getValueAsInt("test", 2));
    }

    @Test
    public void shouldGetValueAsDouble() {
        exampleConfiguration = new ApplicationConfiguration() {
            public Object getValue(String name) {
                return "1.0";
            }
        };
        assertEquals(Double.valueOf("1.0"), exampleConfiguration.getValueAsDouble("test"));
    }

    @Test
    public void shouldDefaultGetValueAsDoubleAsZero() {
        exampleConfiguration = new ApplicationConfiguration() {
            public Object getValue(String name) {
                return null;
            }
        };
        assertEquals(Double.valueOf(0), exampleConfiguration.getValueAsDouble("test"));
    }

    @Test
    public void shouldGetOptionalValueAsDouble() {
        exampleConfiguration = new ApplicationConfiguration() {
            public Object getValue(String name) {
                return null;
            }
        };
        assertEquals(Double.valueOf(2.1), exampleConfiguration.getValueAsDouble("test", 2.1));
    }

    @Test
    public void shouldGetValueAsLong() {
        exampleConfiguration = new ApplicationConfiguration() {
            public Object getValue(String name) {
                return "1";
            }
        };
        assertEquals(Long.valueOf(1), exampleConfiguration.getValueAsLong("test"));
    }

    @Test
    public void shouldDefaultGetValueAsLongAsZero() {
        exampleConfiguration = new ApplicationConfiguration() {
            public Object getValue(String name) {
                return null;
            }
        };
        assertEquals(Long.valueOf(0), exampleConfiguration.getValueAsLong("test"));
    }

    @Test
    public void shouldGetOptionalValueAsLong() {
        exampleConfiguration = new ApplicationConfiguration() {
            public Object getValue(String name) {
                return null;
            }
        };
        assertEquals(Long.valueOf(213), exampleConfiguration.getValueAsLong("test", 213));
    }

    @Test
    public void shouldGetValueAsFloat() {
        exampleConfiguration = new ApplicationConfiguration() {
            public Object getValue(String name) {
                return "1";
            }
        };
        assertEquals(Float.valueOf(1), exampleConfiguration.getValueAsFloat("test"));
    }

    @Test
    public void shouldDefaultGetValueAsFloatAsZero() {
        exampleConfiguration = new ApplicationConfiguration() {
            public Object getValue(String name) {
                return null;
            }
        };
        assertEquals(Float.valueOf(0), exampleConfiguration.getValueAsFloat("test"));
    }

    @Test
    public void shouldGetOptionalValueAsFloat() {
        exampleConfiguration = new ApplicationConfiguration() {
            public Object getValue(String name) {
                return null;
            }
        };
        assertEquals(Float.valueOf(2.1f), exampleConfiguration.getValueAsFloat("test", 2.1f));
    }

    @Test
    public void shouldGetValueAsBoolean() {
        exampleConfiguration = new ApplicationConfiguration() {
            public Object getValue(String name) {
                return true;
            }
        };
        assertTrue(exampleConfiguration.getValueAsBoolean("test"));
    }

    @Test
    public void shouldDefaultGetValueAsBooleanAsFalse() {
        exampleConfiguration = new ApplicationConfiguration() {
            public Object getValue(String name) {
                return null;
            }
        };
        assertFalse(exampleConfiguration.getValueAsBoolean("test"));
    }

    @Test
    public void shouldGetOptionalValueAsBoolean() {
        exampleConfiguration = new ApplicationConfiguration() {
            public Object getValue(String name) {
                return null;
            }
        };
        assertTrue(exampleConfiguration.getValueAsBoolean("test", true));
    }
}
