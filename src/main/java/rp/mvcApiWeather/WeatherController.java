package rp.mvcApiWeather;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Controller
public class WeatherController {

    private static final Logger logger = LoggerFactory.getLogger(WeatherController.class);

    private final RestTemplate restTemplate;

    @Value("${weather.api.url}")
    private String apiUrl;

    @Value("${weather.api.key}")
    private String apiKey;

    public WeatherController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/weather")
    public String getWeather(@RequestParam(defaultValue = "Sofia") String city, Model model) {
        String url = UriComponentsBuilder.fromHttpUrl(apiUrl)
                .queryParam("q", city)
                .queryParam("appid", apiKey)
                .queryParam("units", "metric")
                .toUriString();

        logger.info("Fetching weather data for city: {}", city);
        logger.info("URL for weather request: {}", url);

        WeatherData weatherData = restTemplate.getForObject(url, WeatherData.class);
        model.addAttribute("weather", weatherData);
        model.addAttribute("city", city);

        return "weather"; // Увери се, че имаш файл weather.html в src/main/resources/templates
    }
}