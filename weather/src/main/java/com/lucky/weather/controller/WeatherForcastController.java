package com.lucky.weather.controller;

import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpResponse;

@RestController
public class WeatherForcastController {

    @Value("$(api.key)")
    private String key;

    private String city = "Delhi";
    private String url = "https://pro.openweathermap.org/data/2.5/forecast/hourly?q="+city+"&appid="+key+"&units="+units+"&cnt="+cnt;
    @RequestMapping("/weather")
    public String show(@RequestParam ("city") String city)
    //Method body
//In the method body you should make a request to the openweather server with an api key which you can get by registering in the website. You can achieve this with Unirest library (it's the easiest way)
    HttpResponse<JsonNode> response = Unirest.get("http://api.openweathermap.org/data/2.5/weather")/
                            .queryString("APPID","YOUR_APP_ID")
                            .queryString("city",city)
                            .header("content-type","application/json")
                            .asJson();
}
