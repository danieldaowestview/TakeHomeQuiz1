import java.util.Stack;

public class WeatherData {
	Stack<Double> temperatures;
	
	public void cleanData(double lower, double upper) {
		Stack<Double> temporary = new Stack<Double>();
		while(temperatures.size() != 0) {
			double d = 	temperatures.pop();
			if(lower < d && d < upper) {
				temporary.push(d);
			}
		}
		while(temporary.size() != 0) {
			temperatures.push(temporary.pop());
		}

	}
	
	public int longestHeatWave(double threshold) {
		int longest = 0;
		int streak = 0;
		Stack<Double> temporary = new Stack<Double>();
		while(temperatures.size() != 0) {
			double temp = temperatures.pop();
			temporary.push(temp);
			if(temp > threshold) {
				streak++;
				if(streak > longest) {
					longest = streak;
				}
			} else {
				streak = 0;
			}
		}
		while(temporary.size() != 0) {
			temperatures.push(temporary.pop());
		}
		return longest;
	}
}
