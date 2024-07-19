public class Main {
    public static void main(String[] args) {
        Filme filme = new Filme();
        filme.nome = "Harry Potter";
        filme.anoDeLancamento = 2002;

        filme.exibeFichaTecnica();
        filme.avaliaFilme(10);
        filme.avaliaFilme(9);
        filme.avaliaFilme(8.6);
        filme.avaliaFilme(9.5);
        filme.avaliaFilme(6.3);

        System.out.println(filme.calculaMediaNotas());

    }
}
