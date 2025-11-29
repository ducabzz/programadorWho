package aula2;

public class ExercicioQuatro {
    public static void main(String[] args){
        int soma = 0;
        int i = 1;
        while (i <= 100) {
            soma += i;
            System.out.println("Somando " + i + " --- Total: " + soma);
            i++;
        }
        System.out.println("Resultado: " + soma);
    }
}
