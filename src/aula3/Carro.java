package aula3;

public class Carro { // classe
    String marca;
    String modelo;
    int ano;

    public static void main(String[] args){
        Carro meuCarro = new Carro(); // objeto
        meuCarro.marca = "Mitsubishi";
        meuCarro.modelo = "L200 Triton";
        meuCarro.ano = 2025;

        // Imprimindo no console
        System.out.println("Marca: " + meuCarro.marca);
        System.out.println("Modelo: " + meuCarro.modelo);
        System.out.println("Ano: " + meuCarro.ano);
    }
}