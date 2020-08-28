package com.matiasiturbide.medicinecabinet.models;


public class Recommendations {

    private StrainRecommendationsList strainRecommendations;

    public StrainRecommendationsList getStrainRecommendations() {
        return strainRecommendations;
    }

    public void setStrainRecommendations(StrainRecommendationsList strainRecommendations) {
        this.strainRecommendations = strainRecommendations;
    }

    public Recommendations(StrainRecommendationsList strainRecommendations) {
        this.strainRecommendations = strainRecommendations;
    }

    public Recommendations() {
    }
}
