package com.matiasiturbide.medicinecabinet.services;


import com.matiasiturbide.medicinecabinet.models.RecomContainer;


public interface StrainReccomendationService {

    RecomContainer getRecom(String symptom, int amount);
}
