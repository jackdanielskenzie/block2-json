package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Ratings {
    @JsonProperty("value")
    private String value;
    @JsonProperty("source")
    private String source;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
}
