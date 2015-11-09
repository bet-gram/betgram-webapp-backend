package models;

import com.avaje.ebean.Model;
import com.fasterxml.jackson.databind.JsonNode;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Climate extends Model {

	@Id
    public String city;
	
    public String weather;

    public String temp;

    public String feelslike;

    public String wind;

    public static Finder<String, Climate> find = new Finder<String, Climate>(
            String.class, Climate.class
    );

    public Climate() {
    }

    public static Climate create(String city, String weather, String temp, String feelslike, String wind) {
        Climate climateObject = new Climate();

        climateObject.city = city;
        climateObject.weather = weather;
        climateObject.temp = temp;
        climateObject.feelslike = feelslike;
        climateObject.wind = wind;

        return climateObject;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getWeather() {
        return weather;
    }

    public String getTemp() {
        return temp;
    }
    
    public String getFeelslike() {
        return feelslike;
    }

    public String getWind() {
        return this.wind;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public void setFeelslike(String feelslike) {
        this.feelslike = feelslike;
    }
    
    public void setWind(String wind) {
        this.wind = wind;
    }
}
