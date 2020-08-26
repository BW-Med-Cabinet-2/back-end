package com.matiasiturbide.medicinecabinet.services;


import com.matiasiturbide.medicinecabinet.models.Recommendations;

public interface StrainReccomendationService {

    Recommendations getRecom(String symptom, int amount);
}
