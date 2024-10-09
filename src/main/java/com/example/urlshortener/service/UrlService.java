package com.example.urlshortener.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UrlService {

    private static final String SHORTENER_API_URL = "https://ulvis.net/api.php?url=";

    public String shortenUrl(String originalUrl) {
        RestTemplate restTemplate = new RestTemplate();

        String apiUrl = SHORTENER_API_URL + originalUrl;

        ResponseEntity<String> response = restTemplate.exchange(apiUrl, HttpMethod.GET, null, String.class);

        if (response.getStatusCode().is2xxSuccessful()) {
            return ("Sua Url encurtada: " + response.getBody() +"<br> Sua Url original: " + originalUrl);
        } else {
            throw new RuntimeException("Erro ao encurtar a URL: " + response.getStatusCode());
        }
    }
    public String shortenUrlPost(String originalUrl) {
        RestTemplate restTemplate = new RestTemplate();

        String apiUrl = SHORTENER_API_URL + originalUrl;

        ResponseEntity<String> response = restTemplate.exchange(apiUrl, HttpMethod.GET, null, String.class);

        if (response.getStatusCode().is2xxSuccessful()) {
            return (response.getBody());
        } else {
            throw new RuntimeException("Erro ao encurtar a URL: " + response.getStatusCode());
        }
    }
}
