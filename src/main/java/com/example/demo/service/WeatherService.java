package com.example.demo.service;

import com.example.demo.model.WeatherModel;

import java.util.List;

public interface WeatherService {

    List<WeatherModel> getAllWeatherData();


    WeatherModel addNewCity(WeatherModel newCityData);

    void updateCity(WeatherModel newCityData);
}
