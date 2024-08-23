import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Seleccione la accion a realizar");

        int accion;

        do {

            System.out.println("Convertir grados Celsius a Fahrenheit seleccione 1");
            System.out.println("Convertir grados Fahrenheit a Celsius seleccione 2");
            accion = in.nextInt();

            switch (accion) {
                case 1:
                    celsiusAFahrenheit objC1 = new celsiusAFahrenheit();
                    objCelsiusAFahrenhei objC2 = new objCelsiusAFahrenhei();
                    System.out.println("Ingrese los grados Celsius a convertir a Fahrenheit");
                    double celsius = in.nextDouble();

                    // Se asigna el valor a la variable celsius de la clase objCelsiusAFahrenhei
                    objC2.setGradosCelsius(celsius);

                    // Se manda a llamar el metodo objCelsiusAFahrenhei de la clase objCelsiusAFahrenhei
                    double resultadoConversionFahrenheit = objC1.convertorCelsiusAFahrenheit(objC2);

                    // Imprime el resultado
                    System.out.println("El resultado de la conversion es: " + resultadoConversionFahrenheit);

                    break;
                case 2:
                    fahrenheitACelsius objF1 = new fahrenheitACelsius();
                    objFahrenheitACelsius objF2 = new objFahrenheitACelsius();
                    System.out.println("Ingrese los grados Fahrenheit a convertir a Celsius");
                    double fahrenheit = in.nextDouble();

                    // Se asigna el valor a la variable fahrenheit de la clase Fahrenheit
                    objF2.setFahrenheit(fahrenheit);

                    // Se manda a llamar al metodo FahrenheitAConvertorCelsius de la clase fahrenheitACelsius
                    double resultadoConversionCelsius = objF1.FahrenheitAConvertorCelsius(objF2);

                    // Imprime el resultado
                    System.out.println("El resultado de la cpnversion es: " + resultadoConversionCelsius);
                    break;
            }

        } while (accion != 1 & accion != 2);

    }
}

