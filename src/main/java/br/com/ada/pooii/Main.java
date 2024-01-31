package br.com.ada.pooii;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello World!");
    }
}


abstract class Conta {
    private String titular;
    protected double saldo;

    abstract void depositar (double valor);
    abstract void sacar (double valor);

}

class ContaCorrente extends Conta {

    @Override
    void depositar(double valor) {
        this.saldo += valor *
    }
}