package com.matiasiturbide.medicinecabinet.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PredictPost {
    private String symptoms;
    private int results;

    public PredictPost(String symptoms, int results) {
        this.symptoms = symptoms;
        this.results = results;
    }
//    ************added this to try to fix error************

    public PredictPost() {
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public int getResults() {
        return results;
    }

    public void setResults(int results) {
        this.results = results;
    }
}
