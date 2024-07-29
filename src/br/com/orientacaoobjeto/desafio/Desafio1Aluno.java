package br.com.orientacaoobjeto.desafio;

// Crie uma classe Aluno com atributos nome, idade, e um método para exibir informações. 
// Crie uma instância da classe Aluno, atribua valores aos seus atributos e utilize o método para exibir as informações.
public class Desafio1Aluno {
    String nome;
    int idade;

    void exibeFichaTecnica() {
        System.out.println(String.format("""
            
        Nome aluno: %s
        Idade aluno: %d """, nome, idade));
    }
}
