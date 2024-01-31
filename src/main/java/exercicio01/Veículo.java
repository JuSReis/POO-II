package exercicio01;

public interface Veiculo {
    void ligar();
    void desligar();
    void acelerar(int velocidade);
    void frear();

    Integer getVelocidadeMaximaPermitida ();
}




