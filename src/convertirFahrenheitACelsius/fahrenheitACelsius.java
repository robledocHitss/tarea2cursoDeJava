public class fahrenheitACelsius implements fahrenheitACelsiusComunDao <objFahrenheitACelsius>{
    @Override
    public double FahrenheitAConvertorCelsius(objFahrenheitACelsius e) {
        double fahrenheit = e.getFahrenheit();

        double resultado = (fahrenheit - e.getConstanteUno()) * e.getConstanteDos();

        return resultado;
    }
}
