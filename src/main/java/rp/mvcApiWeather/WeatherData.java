package rp.mvcApiWeather;

public class WeatherData {
    public Main main;
    public Weather[] weather;

    public static class Main {
        public float temp;
    }

    public static class Weather {
        public String description;
    }
}