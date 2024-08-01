package br.com.orientacaoobjeto.desafio;

// Crie uma classe Animal com um método emitirSom(). Em seguida, crie duas subclasses: Cachorro e Gato, que herdam da classe Animal. 
// Adicione o método emitirSom() nas subclasses, utilizando a anotação @Override para indicar que estão sobrescrevendo o método. 
// Além disso, adicione métodos específicos para cada subclasse, como abanarRabo() para o Cachorro e arranharMoveis() para o Gato.
public class Desafio3Cachorro extends Desafio3Animal {
    @Override
    public String emitirSom() {
        return "AU AU";
    }

    public String abanarRabo() {
        return "Abanou o rabo.";
    }
}
