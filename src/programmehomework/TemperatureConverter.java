package programmehomework;

/**
 * This class provides a method to convert temperature from Fahrenheit to Celsius.
 */
public class TemperatureConverter {

    /**
     * Convert temperature from Fahrenheit to Celsius.
     *
     * fahrenheit The temperature value in Fahrenheit.
     * The temperature value in Celsius.
     */
    public static double convertToFahrenheit(double fahrenheit){
        return (fahrenheit - 32) * 5 /9;
    }

    /**
     * MAin method to test the temperature conversion.
     */
    public static void main(String[] args){
        double fahrenheit = 98.6; //Example Fahrenheit temperture
        double celsius = convertToFahrenheit(fahrenheit);
        System.out.println(fahrenheit + "°F is equal to " + celsius + "°C");
    }
}
