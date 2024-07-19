public class DesafioMusica {
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
