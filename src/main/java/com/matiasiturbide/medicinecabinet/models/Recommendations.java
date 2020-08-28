package com.matiasiturbide.medicinecabinet.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Recommendations {

    private StrainRecommendationsList strain_recommendations;

    public StrainRecommendationsList getStrainRecommendations() {
        return strain_recommendations;
    }

    public void setStrainRecommendations(StrainRecommendationsList strain_recommendations) {
        this.strain_recommendations = strain_recommendations;
    }

    public Recommendations(StrainRecommendationsList strain_recommendations) {
        this.strain_recommendations = strain_recommendations;
    }

    public Recommendations() {
    }
}
