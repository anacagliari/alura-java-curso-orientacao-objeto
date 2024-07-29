package br.com.orientacaoobjeto.desafio;

// Desenvolva uma classe Livro com os atributos privados titulo e autor. Utilize métodos getters e setters para acessar e modificar esses atributos. 
// Adicione um método exibirDetalhes que imprime o título e o autor do livro.
public class Desafio2Livro {
    private String titulo;
    private String autor;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void exibirDetalhes() {
        System.out.println(String.format("""
            Título do livro: %s
            Nome do autor: %s""", this.titulo, this.autor));
    }
}
