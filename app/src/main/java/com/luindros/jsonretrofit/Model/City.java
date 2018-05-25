package com.luindros.jsonretrofit.Model;

public class City {

    private int id;
    private String name;
    private String country;
    private int temperature;

    public City() {
    }

    public City(int id, String name, String country, int temperature) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
