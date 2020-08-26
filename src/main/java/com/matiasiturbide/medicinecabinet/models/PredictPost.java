package com.matiasiturbide.medicinecabinet.models;

public class PredictPost {
    private String symptoms;
    private int results;

    public PredictPost(String symptoms, int results) {
        this.symptoms = symptoms;
        this.results = results;
    }
}
