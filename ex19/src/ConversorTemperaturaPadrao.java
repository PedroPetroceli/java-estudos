public class ConversorTemperaturaPadrao implements ConversorTemperatura{

    @Override
    public void celsiusParaFahrenheit(double c) {
        double converter = c * (1.8+32);
        System.out.println(c + "Celsius ao converter se torna Fahrenheit: " + converter);
    }

    @Override
    public void fahrenheitParaCelsius(double f) {
        double converter = (f - 32)/1.8;
        System.out.println(f + "Fahrenheit ao converter se torna Celsius: " + converter);
    }
}
