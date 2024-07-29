package br.com.orientacaoobjeto.desafio;

// Crie uma classe idadePessoa com os atributos privados nome e idade. Utilize métodos getters e setters para acessar e modificar esses atributos. 
// Adicione um método verificarIdade que imprime se a pessoa é maior de idade ou não.
public class Desafio2IdadePessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void verificarIdade() {
        if (idade >= 18) {
            System.out.println("É maior de idade.");
        } else {
            System.out.println("É menor de idade.");
        }
    }

}
