package com.matiasiturbide.medicinecabinet.models;


public class Recommendations {

    private StrainRecommendations strainRecommendations;

    public StrainRecommendations getStrainRecommendations() {
        return strainRecommendations;
    }

    public void setStrainRecommendations(StrainRecommendations strainRecommendations) {
        this.strainRecommendations = strainRecommendations;
    }

    public Recommendations(StrainRecommendations strainRecommendations) {
        this.strainRecommendations = strainRecommendations;
    }

    public Recommendations() {
    }
}
