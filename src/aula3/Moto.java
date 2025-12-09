package aula3;

public class Moto {
    String marca;
    String modelo;
    int velocidade;

    public void acelerar() {
        velocidade += 20;
    }

    public void frear() {
        velocidade -= 50;
    }

    public void exibirInformacoes(){
        System.out.println("Marca da moto: " + marca);
        System.out.println("Modelo da moto: " + modelo);
        System.out.println("Velocidade da moto: " + velocidade);
    }

    public static void main(String[] args) {
        Moto minhaMoto = new Moto();
        minhaMoto.marca = "Harley-Davidson";
        minhaMoto.modelo = "Sport 2026";
        minhaMoto.velocidade = 150;

        minhaMoto.acelerar();
        System.out.println("Acelerando...");
        minhaMoto.acelerar();
        System.out.println("Acelerando...");
        minhaMoto.acelerar();
        System.out.println("Acelerando...");
        System.out.println("Olhando painel");
        minhaMoto.exibirInformacoes();
        minhaMoto.frear();
        System.out.println("Freando");
        minhaMoto.frear();
        System.out.println("Freando");
        minhaMoto.exibirInformacoes();
    }
}
