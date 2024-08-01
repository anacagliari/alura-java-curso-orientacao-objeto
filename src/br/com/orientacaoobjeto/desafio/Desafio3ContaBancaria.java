package br.com.orientacaoobjeto.desafio;

// Crie uma classe ContaBancaria com métodos para realizar operações bancárias como depositar(), sacar() e consultarSaldo(). 
// Em seguida, crie uma subclasse ContaCorrente que herda da classe ContaBancaria. Adicione um método específico para a subclasse, 
// como cobrarTarifaMensal(), que desconta uma tarifa mensal da conta corrente.
public class Desafio3ContaBancaria {
    protected double saldo;

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual: " + this.saldo);
    }
}
