package br.com.alura.literalura.literalura.model;

import java.util.List;

public class Livro {
    private String title;
    private List<Autor> authors;
    private List<String> languages;

    public String getTitle() {
        return title;
    }

    public List<Autor> getAuthors() {
        return authors;
    }

    public List<String> getLanguages() {
        return languages;
    }

    @Override
    public  String toString() {
        return "\n Título: " + title +
                "\n Autor(es): " + authors +
                "\n Idioma(s): " + languages;
    }
}
