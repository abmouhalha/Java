package com.meteo;

import org.junit.Test;
import static org.junit.Assert.*;

public class JsonParserTest {
    @Test
    public void testParseWeatherData() {
        String mockJsonResponse = "{ \"main\": { \"temp\": 15.5, \"temp_min\": 13.0, \"temp_max\": 18.0, \"humidity\": 75 } }";
        WeatherResponse response = JsonParser.parseWeatherData(mockJsonResponse);
        assertEquals(15.5, response.getMain().getTemp(), 0.01);
        assertEquals(13.0, response.getMain().getTemp_min(), 0.01);
        assertEquals(18.0, response.getMain().getTemp_max(), 0.01);
        assertEquals(75, response.getMain().getHumidity());
    }
}

