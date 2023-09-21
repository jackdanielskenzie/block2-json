package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class SnackDTO {

    @JsonProperty("varieties")
    private Varieties varieties;
    @JsonProperty("ppu")
    private double ppu;
    @JsonProperty("name")
    private String name;
    @JsonProperty("type")
    private String type;
    @JsonProperty("id")
    private String id;

    public Varieties getVarieties() {
        return varieties;
    }

    public void setVarieties(Varieties varieties) {
        this.varieties = varieties;
    }

    public double getPpu() {
        return ppu;
    }

    public void setPpu(double ppu) {
        this.ppu = ppu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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
