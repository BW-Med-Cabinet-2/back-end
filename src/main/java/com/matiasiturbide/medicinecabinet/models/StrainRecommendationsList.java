package com.matiasiturbide.medicinecabinet.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)

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
