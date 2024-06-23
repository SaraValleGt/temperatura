public class WeatherWarning implements Observer {
    private static final int TEMPERATURE_THRESHOLD = 30;

    @Override
    public void update(int temperature) {
        if (temperature > TEMPERATURE_THRESHOLD) {
            System.out.println("Warning: High temperature! (" + temperature + "°C)");
        }
    }
}
