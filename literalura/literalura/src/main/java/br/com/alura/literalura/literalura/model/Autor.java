package br.com.alura.literalura.literalura.model;

public class Autor {
    private String name;
    private int birth_year;
    private int death_year;

    public String getName() {
        return name;
    }

    public int getBirth_year() {
        return birth_year;
    }

    public int getDeath_year() {
        return death_year;
    }

    @Override
    public String toString() {
        return name + " (" + birth_year + " _ " + death_year + ")";
    }
}
