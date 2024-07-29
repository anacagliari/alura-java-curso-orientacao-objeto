package br.com.orientacaoobjeto.desafio;

// Crie uma classe ContaBancaria com os seguintes atributos: numeroConta (privado), saldo (privado) e titular (publico). 
// Implemente métodos getters e setters para os atributos privados.
public class Desafio2ContaBancaria {
    private int numeroConta;
    private double saldo;
    public String titular;

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    void exibeFichaTecnica() {
        System.out.println(String.format("""
            
            Conta
            Número: %s
            Saldo: %s
            Títular: %s """, this.getNumeroConta(), this.getSaldo(), this.titular));
    }

}
