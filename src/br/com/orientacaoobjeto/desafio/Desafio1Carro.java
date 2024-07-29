package br.com.orientacaoobjeto.desafio;

// Crie uma classe Carro com atributos modelo, ano, cor e métodos para exibir a ficha técnica e calcular a idade do carro.
public class Desafio1Carro {
    String modelo;
    int ano;
    String cor;

    void exibeFichaTecnica() {
        System.out.println(String.format("""
            
            Modelo do carro: %s
            Ano de lançamento: %d
            Cor do carro: %s """, modelo, ano, cor));
    }

    int idadeCarro() {
        return 2024 - ano;
    }
}
