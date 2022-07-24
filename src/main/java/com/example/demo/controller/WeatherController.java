package com.example.demo.controller;


import com.example.demo.dao.WeatherRepository;
import com.example.demo.model.WeatherModel;
import com.example.demo.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class WeatherController {
    @Autowired
    private  WeatherService weatherService ;

    @GetMapping("/test")
    public String test() {
        return "testing is done" ;
    }

    @GetMapping("/all")
    public List<WeatherModel> getAllWeatherData() {
        return weatherService.getAllWeatherData() ;
    }

    @PostMapping("/add")
    public WeatherModel addNewCity(@Valid @RequestBody WeatherModel newCityData) {
        return weatherService.addNewCity(newCityData) ;

    }

    @PutMapping("/update")
    public String updateCity(@Valid  @RequestBody WeatherModel newCityData) {
        System.out.println(newCityData.toString()); ;
        weatherService.updateCity(newCityData) ;
        return "Updated Successfully" ;
    }



}
