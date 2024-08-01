package br.com.orientacaoobjeto.desafio;

// Crie uma classe Carro com métodos para representar um modelo específico ao longo de três anos. 
// Implemente métodos para definir o nome do modelo, os preços médios para cada ano, e calcular e exibir o menor e o maior preço. 
// Adicione uma subclasse ModeloCarro para criar instâncias específicas, utilizando-a na classe principal para definir preços e mostrar informações.
public class Desafio3Carro {
    private String modelo;
    private double precoMedioAno1;
    private double precoMedioAno2;
    private double precoMedioAno3;

    public void definirModelo(String modelo) {
        this.modelo = modelo;
    }

    public void definirPrecos(double precoMedioAno1, double precoMedioAno2, double precoMedioAno3) {
        this.precoMedioAno1 = precoMedioAno1;
        this.precoMedioAno2 = precoMedioAno2;
        this.precoMedioAno3 = precoMedioAno3;
    }

    public void exibirFichaCarros() {
        System.out.println(String.format("""

            Modelo: %s
            Preços: Ano 1 - R$ %s, Ano 2 - R$ %s, Ano 3 - R$ %s
            Menor preço: R$ %s
            Maior preço: R$ %s""", modelo, precoMedioAno1, precoMedioAno2, precoMedioAno3, calcularMenorPreco(), calcularMaiorPreco()));
    }

    private double calcularMenorPreco() {
        double menorPreco = precoMedioAno1;
        if (precoMedioAno2 < menorPreco) {
            menorPreco = precoMedioAno2;
        }
        if (precoMedioAno3 < menorPreco) {
            menorPreco = precoMedioAno3;
        }
        return menorPreco;
    }

    private double calcularMaiorPreco() {
        double maiorPreco = precoMedioAno1;
        if (precoMedioAno2 > maiorPreco) {
            maiorPreco = precoMedioAno2;
        }
        if (precoMedioAno3 > maiorPreco) {
            maiorPreco = precoMedioAno3;
        }
        return maiorPreco;
    }
}
