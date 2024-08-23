public class celsiusAFahrenheit implements celsiusAFahrenheitComunDao <objCelsiusAFahrenhei>{

    @Override
    public double convertorCelsiusAFahrenheit(objCelsiusAFahrenhei e) {

        double celsius = e.getGradosCelsius();

        double resultado = (celsius * e.getConstanteUno()) + e.getConstanteDos();

        return resultado;
    }
}
