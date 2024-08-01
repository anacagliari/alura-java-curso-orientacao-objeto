package br.com.orientacaoobjeto.modelo;

import br.com.orientacaoobjeto.calculo.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() { //toda vez que implementa uma interface, o método/atributo deve ser implementado na classe.
        return (int) calculaMediaNotas() / 2;
    }

}
