package com.meteo;

public class MainApp {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Veuillez fournir un nom de ville en paramètre.");
            return;
        }

        String city = args[0];
        try {
            String jsonResponse = MeteoService.getWeatherData(city);
            WeatherResponse weatherResponse = JsonParser.parseWeatherData(jsonResponse);
            WeatherDisplay.displayWeather(weatherResponse);
        } catch (Exception e) {
            System.out.println("Erreur lors de la récupération des données météo: " + e.getMessage());
        }
    }
}
