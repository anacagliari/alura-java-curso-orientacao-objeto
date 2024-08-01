package br.com.orientacaoobjeto.modelo;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private int duracaoEmMinutos;
    private double somaNotas;
    private int totalNotas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public double getSomaNotas() {
        return somaNotas;
    }

    public int getTotalNotas() {
        return totalNotas;
    }

    public void exibeFichaTecnica() {
        System.out.print(String.format("""

                Nome do título: %s
                Ano de lançamento: %d
                """, nome, anoDeLancamento));
    }

    public void avaliaFilme(double nota) {
        somaNotas += nota;
        totalNotas++;
    }

    public double calculaMediaNotas() { // pegamedia()
        return somaNotas / totalNotas;
    }
}
