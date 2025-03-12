package com.meteo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class MeteoService {
    private static final String API_KEY = "7ee0dd93945ae31985996d2cf2d1d95d";
    private static final String API_URL = "https://api.openweathermap.org/data/2.5/weather?q=%s&appid=%s&units=metric";

    public static String getWeatherData(String city) throws Exception {
        String urlString = String.format(API_URL, city, API_KEY);
        URL url = new URL(urlString);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String inputLine;
        StringBuilder content = new StringBuilder();
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }
        in.close();
        connection.disconnect();
        return content.toString();
    }
}
