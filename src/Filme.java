public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaNotas;
    int totalNotas;
    int duracaoEmMinutos;

    void exibeFichaTecnica() {
        System.out.println(String.format("""

                Nome do filme: %s
                Ano de lançamento: %d
                """, nome, anoDeLancamento));
    }

    void avaliaFilme(double nota) {
        somaNotas += nota;
        totalNotas++;
    }

    double calculaMediaNotas() {
        return somaNotas / totalNotas;
    }

}
