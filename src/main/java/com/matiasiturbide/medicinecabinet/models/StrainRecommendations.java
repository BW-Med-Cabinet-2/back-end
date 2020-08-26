package com.matiasiturbide.medicinecabinet.models;

import java.util.List;

public class StrainRecommendations {
    private List<StrainRecommendationsList> RecomList;

    public List<StrainRecommendationsList> getRecomList() {
        return RecomList;
    }

    public void setRecomList(List<StrainRecommendationsList> recomList) {
        RecomList = recomList;
    }

    public StrainRecommendations(List<StrainRecommendationsList> recomList) {
        RecomList = recomList;
    }
}
