package DesafioHoraDaPratica2;
//Crie uma classe ContaBancaria com os seguintes atributos: numeroConta (privado), saldo (privado) e titular (publico).
// Implemente métodos getters e setters para os atributos privados.
public class ContaBancaria {

    private int numeroConta = 123579;
    private double saldo = 8000;
    public String titular = "Isack";

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumeroConta () {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }
}
