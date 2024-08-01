package br.com.consolidandoconhecimentos.modelo;

public class Audio {
    private String titulo;
    private int totalReproducao;
    private int totalCurtida;
    private int classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalReproducao() {
        return totalReproducao;
    }

    public int getTotalCurtida() {
        return totalCurtida;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void curte() {
        this.totalCurtida++;
    }

    public void reproduz() {
        this.totalReproducao++;
    }
}
