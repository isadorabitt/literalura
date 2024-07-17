package com.example.literalura.service;

import com.example.literalura.model.Livro;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GutendexService {

    private static final String API_URL = "https://gutendex.com/books?search=";

    public Livro buscarLivroPorTitulo(String titulo) {
        RestTemplate restTemplate = new RestTemplate();
        String url = API_URL + titulo;
        // Aqui você precisa mapear a resposta da API para a entidade Livro
        // Para simplificar, este exemplo não está completo
        // Mapear a resposta conforme necessário
        return restTemplate.getForObject(url, Livro.class);
    }
}
