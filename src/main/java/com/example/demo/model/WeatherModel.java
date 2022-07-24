package com.example.demo.model;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Data
@Table(name = "weather")
@ToString
public class WeatherModel {
    @Id
    private String city ;
    @NotBlank(message =  "Input fields should not be empty")
    private String humidity  , temparature  , weatherCondition , windSpeed , windDirection ;
}
