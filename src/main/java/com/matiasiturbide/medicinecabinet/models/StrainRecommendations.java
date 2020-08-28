package com.matiasiturbide.medicinecabinet.models;

import java.util.List;

public class StrainRecommendations {

    private String name;
    private String type;
    private String flavors;
    private String positive_effects;
    private String negative_effects;
    private String ailment;
    private String search;

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

    public String getFlavors() {
        return flavors;
    }

    public void setFlavors(String flavors) {
        this.flavors = flavors;
    }

    public String getPositive_effects() {
        return positive_effects;
    }

    public void setPositive_effects(String positive_effects) {
        this.positive_effects = positive_effects;
    }

    public String getNegative_effects() {
        return negative_effects;
    }

    public void setNegative_effects(String negative_effects) {
        this.negative_effects = negative_effects;
    }

    public String getAilment() {
        return ailment;
    }

    public void setAilment(String ailment) {
        this.ailment = ailment;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public StrainRecommendations(String name, String type, String flavors, String positive_effects, String negative_effects, String ailment, String search) {
        this.name = name;
        this.type = type;
        this.flavors = flavors;
        this.positive_effects = positive_effects;
        this.negative_effects = negative_effects;
        this.ailment = ailment;
        this.search = search;
    }
}
