package com.meteo;

public class WeatherDisplay {
    public static void displayWeather(WeatherResponse weather) {
        System.out.println("Température actuelle: " + weather.getMain().getTemp() + "°C");
        System.out.println("Température maximale: " + weather.getMain().getTemp_max() + "°C");
        System.out.println("Température minimale: " + weather.getMain().getTemp_min() + "°C");
        System.out.println("Humidité: " + weather.getMain().getHumidity() + "%");
    }
}
