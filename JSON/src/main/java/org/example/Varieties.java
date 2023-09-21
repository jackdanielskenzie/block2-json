package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Varieties {
    @JsonProperty("flavor")
    private List<Flavor> flavor;

    public List<Flavor> getFlavor() {
        return flavor;
    }

    public void setFlavor(List<Flavor> flavor) {
        this.flavor = flavor;
    }
}
