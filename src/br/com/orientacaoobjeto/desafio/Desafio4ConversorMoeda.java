package br.com.orientacaoobjeto.desafio;

// Crie uma classe ConversorMoeda que implementa uma interface ConversaoFinanceira com o método converterDolarParaReal() para converter 
// um valor em dólar para reais. A classe deve receber o valor em dólar como parâmetro.
public class Desafio4ConversorMoeda implements Desafio4ConversaoFinanceira {
    @Override
    public void converterDolarParaReal(double valorEmDolar) {
        double cotacaoDolar = 5.654; // Cotação dia 01/08/2024
        double valorEmReal = valorEmDolar * cotacaoDolar;
        System.out.println(String.format("""

            O valor US$ %.2f convertido para reais é de R$ %.2f.
            """, valorEmDolar, valorEmReal));
    }

}
