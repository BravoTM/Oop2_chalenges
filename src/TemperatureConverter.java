//showing the use of the daouble data type
class TemperatureConverter {
    void showConversion() {
        double celsius;
        double fahrenheit;

        celsius = 25.0;
        fahrenheit = (celsius * 9/5) + 32;
        System.out.println("Temperature 1: " + celsius + "°C = " + fahrenheit + "°F");

        celsius = 30.0;
        fahrenheit = (celsius * 9/5) + 32;
        System.out.println("Temperature 2: " + celsius + "°C = " + fahrenheit + "°F");
    }

    public static void main(String[] args) {
        (new TemperatureConverter()).showConversion();
    }
}
