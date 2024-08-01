import br.com.orientacaoobjeto.calculo.CalculadoraDeTempo;
import br.com.orientacaoobjeto.calculo.FiltroRecomendacao;
import br.com.orientacaoobjeto.modelo.Episodio;
import br.com.orientacaoobjeto.modelo.Filme;
import br.com.orientacaoobjeto.modelo.Serie;

public class Main {
    public static void main(String[] args) {
        Serie serie1 = new Serie();
        serie1.setNome("The Big Bang Theory");
        serie1.setAnoDeLancamento(2007);
        serie1.setAtiva(false);
        serie1.exibeFichaTecnica();
        serie1.setTemporadas(12);
        serie1.setEpisodiosPorTemporada(22);
        serie1.setMinutosPorEpisodio(25);
        System.out.println("Duração para maratonar " + serie1.getNome() + ": " + serie1.getDuracaoEmMinutos());

        Filme filme1 = new Filme();
        filme1.setNome("Harry Potter e a Pedra Filosofal [1]");
        filme1.setAnoDeLancamento(2001);
        filme1.setDuracaoEmMinutos(152);
        filme1.exibeFichaTecnica();
        filme1.avaliaFilme(9.5);
        filme1.avaliaFilme(7.3);
        System.out.println("Quantidade de avaliações: " + filme1.getTotalNotas());
        System.out.println("Nota: " + filme1.calculaMediaNotas());

        Filme filme2 = new Filme();
        filme2.setNome("Harry Potter e a Câmara Secreta [2]");
        filme2.setAnoDeLancamento(2002);
        filme2.setDuracaoEmMinutos(161);
        filme2.exibeFichaTecnica();
        filme2.avaliaFilme(7.6);
        filme2.avaliaFilme(5.6);
        System.out.println("Quantidade de avaliações: " + filme2.getTotalNotas());
        System.out.println("Nota: " + filme2.calculaMediaNotas());

        Filme filme3 = new Filme();
        filme3.setNome("Harry Potter e o Prisioneiro de Azkaban [3]");
        filme3.setAnoDeLancamento(2004);
        filme3.setDuracaoEmMinutos(141);
        filme3.exibeFichaTecnica();
        filme3.avaliaFilme(8.9);
        filme3.avaliaFilme(8.6);
        System.out.println("Quantidade de avaliações: " + filme3.getTotalNotas());
        System.out.println("Nota: " + filme3.calculaMediaNotas());

        Filme filme4 = new Filme();
        filme4.setNome("Harry Potter e o Cálice de Fogo [4]");
        filme4.setAnoDeLancamento(2005);
        filme4.setDuracaoEmMinutos(157);
        filme4.exibeFichaTecnica();
        filme4.avaliaFilme(10);
        filme4.avaliaFilme(8.6);
        System.out.println("Quantidade de avaliações: " + filme4.getTotalNotas());
        System.out.println("Nota: " + filme4.calculaMediaNotas());

        Filme filme5 = new Filme();
        filme5.setNome("Harry Potter e a Ordem da Fênix [5]");
        filme5.setAnoDeLancamento(2007);
        filme5.setDuracaoEmMinutos(138);
        filme5.exibeFichaTecnica();
        filme5.avaliaFilme(10);
        filme5.avaliaFilme(9);
        System.out.println("Quantidade de avaliações: " + filme5.getTotalNotas());
        System.out.println("Nota: " + filme5.calculaMediaNotas());

        Filme filme6 = new Filme();
        filme6.setNome("Harry Potter e o Enigma do Príncipe [6]");
        filme6.setAnoDeLancamento(2009);
        filme6.setDuracaoEmMinutos(153);
        filme6.exibeFichaTecnica();
        filme6.avaliaFilme(9);
        filme6.avaliaFilme(8.6);
        System.out.println("Quantidade de avaliações: " + filme6.getTotalNotas());
        System.out.println("Nota: " + filme6.calculaMediaNotas());

        Filme filme7 = new Filme();
        filme7.setNome("Harry Potter e as Relíquias da Morte: Parte 1 [7]");
        filme7.setAnoDeLancamento(2010);
        filme7.setDuracaoEmMinutos(146);
        filme7.exibeFichaTecnica();
        filme7.avaliaFilme(9);
        filme7.avaliaFilme(8.6);
        System.out.println("Quantidade de avaliações: " + filme7.getTotalNotas());
        System.out.println("Nota: " + filme7.calculaMediaNotas());

        Filme filme8 = new Filme();
        filme8.setNome("Harry Potter e as Relíquias da Morte: Parte 2 [8]");
        filme8.setAnoDeLancamento(2011);
        filme8.setDuracaoEmMinutos(130);
        filme8.exibeFichaTecnica();
        filme8.avaliaFilme(9);
        filme8.avaliaFilme(8.6);
        System.out.println("Quantidade de avaliações: " + filme8.getTotalNotas());
        System.out.println("Nota: " + filme8.calculaMediaNotas());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filme1);
        calculadora.inclui(filme2);
        calculadora.inclui(filme3);
        calculadora.inclui(filme4);
        calculadora.inclui(filme5);
        calculadora.inclui(filme6);
        calculadora.inclui(filme7);
        calculadora.inclui(filme8);

        CalculadoraDeTempo calculadoraSerie = new CalculadoraDeTempo();
        calculadoraSerie.inclui(serie1);

        System.out.println(String.format("""
            
            Tempo total para maratonar os filmes do Harry Potter: %s minutos.
            Tempo total para maratonar a série %s : %s minutos.
            """, calculadora.getTempoTotal(),serie1.getNome(), calculadoraSerie.getTempoTotal()));

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(filme2);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(serie1);
        episodio.setTotalVisualizacoes(350);
        filtro.filtra(episodio);
    }
}
