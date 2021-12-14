package app.smty.practica3.Models;

import java.util.Arrays;

public class Channel {
    int id;
    String name;
    String country;
    String city;
    String[] genres;

    public Channel() {
    }

    public Channel(int id, String name, String country, String city, String[] genres) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.city = city;
        this.genres = genres;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String[] getGenres() {
        return genres;
    }

    public void setGenres(String[] genres) {
        this.genres = genres;
    }

    @Override
    public String toString() {
        return "Channel \n" +
                " id=" + id + "\n" +
                " name='" + name + "\n" +
                " country='" + country + "\n" +
                " city='" + city + "\n" +
                " genres=" + Arrays.toString(genres);
    }
}
