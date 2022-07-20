package com.example.demo.controller;


import com.example.demo.dao.WeatherRepository;
import com.example.demo.model.WeatherModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class WeatherController {
    @Autowired
    private WeatherRepository weatherRepository ;

    @GetMapping("/test")
    public String test() {
        return "testing is done" ;
    }

    @GetMapping("/all")
    public List<WeatherModel> getAllWeatherData() {
        System.out.println("Called from website");
        return (List<WeatherModel>)weatherRepository.findAll() ;
    }

    @PostMapping("/add")
    public WeatherModel addNewCity(@RequestBody WeatherModel newCityData) {
        System.out.println(newCityData);
        weatherRepository.save(newCityData) ;
        System.out.println("Added new city successfully") ;
        return newCityData ;
    }

    @PutMapping("/update")
    public String updateCity(@RequestBody WeatherModel newCityData) {
        System.out.println("Request to put api");
        weatherRepository.save(newCityData) ;
        return "Updated successfully"  ;
    }



}
