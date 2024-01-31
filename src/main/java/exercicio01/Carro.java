package exercicio01;

public class Carro implements Veiculo{

    @Override
    public void ligar() {
        System.out.println("Ligando o carro");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando o carro");

    }

    @Override
    public void acelerar(int velocidade) {
        System.out.println("Acelerando o carro com a velocidade " + velocidade);

    }

    @Override
    public void frear() {

    }
}
