package br.com.alura.literalura.literalura.service;

import br.com.alura.literalura.literalura.model.RespostaApi;
import com.google.gson.Gson;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ConsumoApi{

    private final String BASE_URL = "https://gutendex.com/books/?search=";
    private final RestTemplate restTemplate = new RestTemplate();
    private final Gson gson = new Gson();

    public RespostaApi buscarLivrosPorTitulo(String titulo) {
        String url = BASE_URL + titulo.replace(" ", "+");
        String json = restTemplate.getForObject(url, String.class);
        return gson.fromJson(json, RespostaApi.class);
    }
}
