package com.example.demo.dao;


import com.example.demo.model.WeatherModel;
import org.springframework.data.repository.CrudRepository;

public interface WeatherRepository extends CrudRepository<WeatherModel , String> {

}
