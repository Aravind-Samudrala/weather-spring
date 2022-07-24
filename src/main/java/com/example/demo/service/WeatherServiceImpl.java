package com.example.demo.service;


import com.example.demo.dao.WeatherRepository;
import com.example.demo.model.WeatherModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeatherServiceImpl implements WeatherService {
    @Autowired
    private WeatherRepository weatherRepository ;
    @Override
    public List<WeatherModel> getAllWeatherData() {
          return  (List<WeatherModel>)weatherRepository.findAll() ;
    }

    @Override
    public WeatherModel addNewCity(WeatherModel newCityData) {
        weatherRepository.save(newCityData) ;

        return newCityData ;
    }

    @Override
    public void updateCity(WeatherModel newCityData) {
        weatherRepository.save((WeatherModel)newCityData);
    }


}
