package models;

import com.avaje.ebean.Model;
import com.fasterxml.jackson.databind.JsonNode;

import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

public class Climate extends Model {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long id;
	
    public String weather;

    public String temp;

    public String feelslike;

    public String wind;

    public Climate() {
    }

    public static Climate create(String weather, String temp, String feelslike, String wind) {
        Climate climateObject = new Climate();
        climateObject.weather = weather;
        climateObject.temp = temp;
        climateObject.feelslike = feelslike;
        climateObject.wind = wind;
        return climateObject;
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

    public String getWind {
        return wind;
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
