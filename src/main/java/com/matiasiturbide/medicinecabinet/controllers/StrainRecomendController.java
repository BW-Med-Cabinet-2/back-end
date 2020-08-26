package com.matiasiturbide.medicinecabinet.controllers;

import com.matiasiturbide.medicinecabinet.models.Recommendations;
import com.matiasiturbide.medicinecabinet.services.StrainReccomendationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StrainRecomendController {

    @Autowired
    StrainReccomendationService strainService;

    @GetMapping(value = "/predict/{symptoms}/{results}", produces = "application/json")

    public ResponseEntity<?> getPredict(
            @PathVariable String symptoms,
            @PathVariable int results
    ){
        Recommendations recom =  strainService.getRecom(symptoms, results);
    return new ResponseEntity<>(recom, HttpStatus.OK);
    }





}
