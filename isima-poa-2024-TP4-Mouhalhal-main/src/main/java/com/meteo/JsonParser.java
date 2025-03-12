package com.meteo;

import com.google.gson.Gson;

public class JsonParser {
    public static WeatherResponse parseWeatherData(String jsonResponse) {
        Gson gson = new Gson();
        return gson.fromJson(jsonResponse, WeatherResponse.class);
    }
}
