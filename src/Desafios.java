public class Desafios {
    public static void main(String[] args) {
        // desafios 1.
        // Crie uma classe Pessoa com um método que exibe "Olá, mundo!" no console.
        DesafioPessoa pessoa = new DesafioPessoa();
        pessoa.exibeOla();
        
        // Crie uma classe Calculadora com um método que recebe um número como parâmetro e retorna o dobro desse número.
        DesafioCalculadora calculo = new DesafioCalculadora();
        System.out.println(calculo.calculadora(6));
        
        // Crie uma classe Musica com atributos titulo, artista, anoLancamento, avaliacao e numAvaliacoes, 
        // e métodos para exibir a ficha técnica, avaliar a música e calcular a média de avaliações.
        DesafioMusica musica = new DesafioMusica();
        musica.titulo = "Halo";
        musica.artista = "Beyonce";
        musica.anoLancamento = 2017;
        musica.exibeFichaTecnica();
        musica.avaliaMusica(10);
        musica.avaliaMusica(9);
        musica.avaliaMusica(7);
        System.out.println(musica.calculaMediaNotasMusica());
        
        // Crie uma classe Carro com atributos modelo, ano, cor e métodos para exibir a ficha técnica e calcular a idade do carro.
        DesafioCarro carro = new DesafioCarro();
        carro.ano = 1967;
        carro.cor = "Vermelho";
        carro.modelo = "Fusca";
        carro.exibeFichaTecnica();
        System.out.println(carro.idadeCarro());

        // Crie uma classe Aluno com atributos nome, idade, e um método para exibir informações. 
        // Crie uma instância da classe Aluno, atribua valores aos seus atributos e utilize o método para exibir as informações.
        DesafioAluno aluno = new DesafioAluno();
        aluno.idade = 32;
        aluno.nome = "Ana Cagliari";
        aluno.exibeFichaTecnica();
    }
}
