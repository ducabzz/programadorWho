package aula2;

public class ExercicioSete {
    public static void main(String[] args){
        int[] numeros = {2, 7, 4, 9, 12, 15}; // array

        int par = 0;
        int impar = 0;

        for (int i = 0; i < numeros.length; i++) { // usando o for pq é o mais adequadome
            if (numeros[i] % 2 == 0) {
                par++; // esse if pega na ordem de index do array e confere se o resto da divisao do numero por 2 é = a 0
            } else {
                impar++; // se nao for par, incrementa no impar
            }
        }
        System.out.println("Pares: " + par);
        System.out.println("Impares: " + impar);
    }
}
