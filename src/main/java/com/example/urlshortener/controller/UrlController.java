package com.example.urlshortener.controller;

import com.example.urlshortener.model.UrlModel;
import com.example.urlshortener.service.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping()
public class UrlController {

    @Autowired
    private UrlService urlShortenerService;

    @GetMapping()
    public String getM() {
        return "Encurtador de Url! ....... método: /encurtar?url=https://www.exemplo.com";
    }

    //get query string
    @GetMapping("/encurtar")
    public ResponseEntity<String> shortenUrl(@RequestParam("url") String originalUrl) {
        try {
            String shortenedUrl = urlShortenerService.shortenUrl(originalUrl);
            return ResponseEntity.ok(shortenedUrl);
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Erro ao encurtar a URL: " + e.getMessage());
        }
    }
    //post json
    @PostMapping("/encurtar")
    public ResponseEntity<String> shortenUrlPost(@RequestBody UrlModel originalUrl) {
        try {
            String shortenedUrl = urlShortenerService.shortenUrlPost(originalUrl.getUrl());
            return ResponseEntity.ok(shortenedUrl);
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Erro ao encurtar a URL: " + e.getMessage());
        }
    }
    @GetMapping("/sobre")
    @ResponseBody
    public HashMap<String, String> sobre() {
        HashMap<String, String> sobre = new HashMap<>();
        sobre.put("Estudante", "Alexandre Destro Zanoni");
        sobre.put("Projeto", "Encurtador de Url top 2024");
        return sobre;
    }
}
