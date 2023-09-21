package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Flavor {
    @JsonProperty("type")
    private String type;
    @JsonProperty("id")
    private String id;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
