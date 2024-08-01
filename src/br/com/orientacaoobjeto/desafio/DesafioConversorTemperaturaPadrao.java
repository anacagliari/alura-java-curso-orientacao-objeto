package br.com.orientacaoobjeto.desafio;

// Crie uma interface ConversorTemperatura com os métodos celsiusParaFahrenheit() e fahrenheitParaCelsius(). Implemente uma classe 
// ConversorTemperaturaPadrao que implementa essa interface com as fórmulas de conversão e exibe os resultados.
public class DesafioConversorTemperaturaPadrao implements Desafio4ConversorTemperatura {
    @Override
    public double celsiusParaFahrenheit(double temperaturaCelsius) {
        return (temperaturaCelsius * 9 / 5) + 32;
    }

    @Override
    public double fahrenheitParaCelsius(double temperaturaFahrenheit) {
        return (temperaturaFahrenheit - 32) * 5 / 9;
    }
}
