package com.matiasiturbide.medicinecabinet.models;

import java.util.List;

public class StrainRecommendationsList {
    private List<StrainRecommendations> RecomList;

    public List<StrainRecommendations> getRecomList() {
        return RecomList;
    }

    public void setRecomList(List<StrainRecommendations> recomList) {
        RecomList = recomList;
    }

    public StrainRecommendationsList(List<StrainRecommendations> recomList) {
        RecomList = recomList;
    }
}
