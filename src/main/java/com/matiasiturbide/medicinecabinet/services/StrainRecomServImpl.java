package com.matiasiturbide.medicinecabinet.services;

import com.matiasiturbide.medicinecabinet.models.PredictPost;
import com.matiasiturbide.medicinecabinet.models.RecomContainer;
import com.matiasiturbide.medicinecabinet.models.Recommendations;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.Collections;

@Service(value = "StrainReccomendationService")
public class StrainRecomServImpl implements StrainReccomendationService {

    @Override
    public RecomContainer getRecom(String symptom, int amount) {
        String apiUrl = "http://hold-your-turnips.herokuapp.com/predict";

        PredictPost predictPost = new PredictPost(symptom, amount);

        RecomContainer newRec = new RecomContainer();
        RestTemplate restTemplate = new RestTemplate();
        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
        converter.setSupportedMediaTypes(Collections.singletonList(MediaType.ALL));
        restTemplate.getMessageConverters().add(converter);

        ParameterizedTypeReference<Recommendations> responseType =
                new ParameterizedTypeReference<>() {
        };

        RecomContainer responseEntity = restTemplate.postForObject(apiUrl, predictPost,
                RecomContainer.class);
        newRec.setRecommendations(responseEntity.getRecommendations());

        return newRec;
    }
}
