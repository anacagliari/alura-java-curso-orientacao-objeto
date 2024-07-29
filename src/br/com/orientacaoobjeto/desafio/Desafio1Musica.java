package br.com.orientacaoobjeto.desafio;

// Crie uma classe Musica com atributos titulo, artista, anoLancamento, avaliacao e numAvaliacoes, 
// e métodos para exibir a ficha técnica, avaliar a música e calcular a média de avaliações.
public class Desafio1Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    double numAvaliacao;

    void exibeFichaTecnica() {
        System.out.println(String.format("""
            
            Nome música: %s
            Nome artista: %s
            Ano de lançamento: %d """, titulo, artista, anoLancamento));
    }

    void avaliaMusica(double nota) {
        avaliacao += nota;
        numAvaliacao++;
    }

    double calculaMediaNotasMusica() {
        return avaliacao / numAvaliacao;
    }
}
