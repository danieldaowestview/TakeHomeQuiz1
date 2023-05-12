import static org.junit.jupiter.api.Assertions.*;

import java.util.Stack;

import org.junit.jupiter.api.Test;

class WeatherDataTest {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	@Test
	void cleanDataTest() {
        WeatherData weatherData = new WeatherData();
        
        // Test cleanData method
        weatherData.temperatures = new Stack<>();
        weatherData.temperatures.push(10.0);
        weatherData.temperatures.push(20.0);
        weatherData.temperatures.push(30.0);
        weatherData.cleanData(15.0, 25.0);
        System.out.println(weatherData.temperatures);  // Output: [20.0]
	}
	@Test
	void longestHeatWaveTest() {
        WeatherData weatherData = new WeatherData();
        
        // Test longestHeatWave method
        weatherData.temperatures = new Stack<>();
        weatherData.temperatures.push(30.0);
        weatherData.temperatures.push(25.0);
        weatherData.temperatures.push(40.0);
        weatherData.temperatures.push(28.0);
        int longestStreak = weatherData.longestHeatWave(20.0);
        System.out.println(longestStreak);  // Output: 4
	}
}
