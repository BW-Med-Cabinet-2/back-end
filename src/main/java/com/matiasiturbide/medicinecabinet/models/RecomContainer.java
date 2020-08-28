package com.matiasiturbide.medicinecabinet.models;

public class RecomContainer {
    private Recommendations recommendations;

    public RecomContainer(Recommendations recommendations) {
        this.recommendations = recommendations;
    }

    public RecomContainer() {
    }

    public Recommendations getRecommendations() {
        return recommendations;
    }

    public void setRecommendations(Recommendations recommendations) {
        this.recommendations = recommendations;
    }
}
