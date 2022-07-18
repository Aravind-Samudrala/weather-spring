package com.example.demo.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "weather")
public class WeatherModel {
    @Id
    private String city ;
    private String humidity  , temparature  , weatherCondition , windSpeed , windDirection ;
    public String getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(String windDirection) {
        this.windDirection = windDirection;
    }

    public String getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(String windSpeed) {
        this.windSpeed = windSpeed;
    }

    public String getCity() {
        return city;
    }

    public String getTemparature() {
        return temparature;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public void setTemparature(String temparature) {
        this.temparature = temparature;
    }

    public String getWeatherCondition() {
        return weatherCondition;
    }

    public void setWeatherCondition(String condition) {
        this.weatherCondition = condition;
    }

    public void setCity(String city) {
        this.city = city;
    }




}
