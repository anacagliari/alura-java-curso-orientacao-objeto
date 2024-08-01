package br.com.orientacaoobjeto.desafio;

// Crie uma classe ContaBancaria com métodos para realizar operações bancárias como depositar(), sacar() e consultarSaldo(). 
// Em seguida, crie uma subclasse ContaCorrente que herda da classe ContaBancaria. Adicione um método específico para a subclasse, 
// como cobrarTarifaMensal(), que desconta uma tarifa mensal da conta corrente.
public class Desafio3ContaCorrente extends Desafio3ContaBancaria {
    private double tarifa = 12.00;

    public void cobrarTarifaMensal() {
        this.saldo -= this.tarifa;
        System.out.println("Tarifa: " + this.tarifa + " - Saldo atualizado: " + this.saldo);
    }
}
