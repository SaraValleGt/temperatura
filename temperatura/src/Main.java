public class Main {
    public static void main(String[] args) {

        WeatherStation weatherStation = new WeatherStation();


        TemperatureDisplay temperatureDisplay = new TemperatureDisplay();
        WeatherWarning weatherWarning = new WeatherWarning();


        weatherStation.addObserver(temperatureDisplay);
        weatherStation.addObserver(weatherWarning);

        // Cambiar la temperatura de la estación dos veces
        weatherStation.setTemperature(25);
        weatherStation.setTemperature(35);
    }
}
