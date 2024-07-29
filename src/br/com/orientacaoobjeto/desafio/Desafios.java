package br.com.orientacaoobjeto.desafio;
public class Desafios {
    public static void main(String[] args) {
        // desafios 1.
        // Crie uma classe Pessoa com um método que exibe "Olá, mundo!" no console.
        Desafio1Pessoa pessoa = new Desafio1Pessoa();
        pessoa.exibeOla();
        
        // Crie uma classe Calculadora com um método que recebe um número como parâmetro e retorna o dobro desse número.
        Desafio1Calculadora calculo = new Desafio1Calculadora();
        System.out.println(calculo.calculadora(6));
        
        // Crie uma classe Musica com atributos titulo, artista, anoLancamento, avaliacao e numAvaliacoes, 
        // e métodos para exibir a ficha técnica, avaliar a música e calcular a média de avaliações.
        Desafio1Musica musica = new Desafio1Musica();
        musica.titulo = "Halo";
        musica.artista = "Beyonce";
        musica.anoLancamento = 2017;
        musica.exibeFichaTecnica();
        musica.avaliaMusica(10);
        musica.avaliaMusica(9);
        musica.avaliaMusica(7);
        System.out.println(musica.calculaMediaNotasMusica());
        
        // Crie uma classe Carro com atributos modelo, ano, cor e métodos para exibir a ficha técnica e calcular a idade do carro.
        Desafio1Carro carro = new Desafio1Carro();
        carro.ano = 1967;
        carro.cor = "Vermelho";
        carro.modelo = "Fusca";
        carro.exibeFichaTecnica();
        System.out.println(carro.idadeCarro());

        // Crie uma classe Aluno com atributos nome, idade, e um método para exibir informações. 
        // Crie uma instância da classe Aluno, atribua valores aos seus atributos e utilize o método para exibir as informações.
        Desafio1Aluno aluno = new Desafio1Aluno();
        aluno.idade = 32;
        aluno.nome = "Ana Cagliari";
        aluno.exibeFichaTecnica();

        //desafio 2.
        // Crie uma classe ContaBancaria com os seguintes atributos: numeroConta (privado), saldo (privado) e titular (publico). 
        // Implemente métodos getters e setters para os atributos privados.
        Desafio2ContaBancaria conta = new Desafio2ContaBancaria();
        conta.setNumeroConta(123456);
        conta.setSaldo(10000);
        conta.titular = "Maria Bonita";

        conta.exibeFichaTecnica();

        conta.setSaldo(1500);
        System.out.println("Novo Saldo: " + conta.getSaldo());

        // Crie uma classe idadePessoa com os atributos privados nome e idade. Utilize métodos getters e setters para acessar e modificar esses atributos. 
        // Adicione um método verificarIdade que imprime se a pessoa é maior de idade ou não.
        Desafio2IdadePessoa pessoa1 = new Desafio2IdadePessoa();
        pessoa1.setNome("Ana");
        pessoa1.setIdade(17);

        Desafio2IdadePessoa pessoa2 = new Desafio2IdadePessoa();
        pessoa2.setNome("Caroline");
        pessoa2.setIdade(32);

        System.out.println(String.format("""
            
            %s tem %d anos.""", pessoa1.getNome(), pessoa1.getIdade()));
        pessoa1.verificarIdade();
        System.out.println(String.format("""
            %s tem %d anos.""", pessoa2.getNome(), pessoa2.getIdade()));
        pessoa2.verificarIdade();

        // Desenvolva uma classe Produto com os atributos privados nome e preco. Utilize métodos getters e setters para acessar e modificar esses atributos. 
        // Adicione um método aplicarDesconto que recebe um valor percentual e reduz o preço do produto.
        Desafio2Produto produto = new Desafio2Produto("Blusa", 50.0);
        System.out.println("");
        System.out.println("Nome do Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getPreco());

        System.out.println("Preço após Desconto: " + produto.aplicarDesconto(10));

        // Desenvolva uma classe Aluno com os atributos privados nome e notas. Utilize métodos getters e setters para acessar e modificar esses atributos. 
        // Adicione um método calcularMedia que retorna a média das notas do aluno.
        Desafio2Aluno aluno1 = new Desafio2Aluno("Júlia Maria", 10, 8.7, 8.9);
        Desafio2Aluno aluno2 = new Desafio2Aluno("Daniele Franciele", 8.3, 6.5, 9.1);

        System.out.println(String.format("""

            Nome: %s
            Nota 1: %s , Nota 2: %s , Nota 3: %s 
            Média: %.2f""", aluno1.getNome(), aluno1.getNota1(), aluno1.getNota2(), aluno1.getNota3(), aluno1.calcularMedia()));
            System.out.println(String.format("""
            Nome: %s
            Nota 1: %s , Nota 2: %s , Nota 3: %s 
            Média: %.2f""", aluno2.getNome(), aluno2.getNota1(), aluno2.getNota2(), aluno2.getNota3(), aluno2.calcularMedia()));

        // Desenvolva uma classe Livro com os atributos privados titulo e autor. Utilize métodos getters e setters para acessar e modificar esses atributos. 
        // Adicione um método exibirDetalhes que imprime o título e o autor do livro.
        Desafio2Livro livro1 = new Desafio2Livro();
        livro1.setTitulo("E não sobrou nenhum");
        livro1.setAutor("Agatha Christie");

        Desafio2Livro livro2 = new Desafio2Livro();
        livro2.setTitulo("A revolução os bichos");
        livro2.setAutor("George Orwell");

        System.out.println("");
        livro1.exibirDetalhes();
        livro2.exibirDetalhes();
    }
}
