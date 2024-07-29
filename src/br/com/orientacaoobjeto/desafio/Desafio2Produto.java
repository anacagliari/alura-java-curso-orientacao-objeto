package br.com.orientacaoobjeto.desafio;

// Desenvolva uma classe Produto com os atributos privados nome e preco. Utilize métodos getters e setters para acessar e modificar esses atributos. 
// Adicione um método aplicarDesconto que recebe um valor percentual e reduz o preço do produto.
public class Desafio2Produto {
    private String nome;
    private double preco;

    public Desafio2Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double aplicarDesconto(double percentualDesconto) {
        return (this.getPreco() - (this.getPreco() * (percentualDesconto / 100)));
    }

}
