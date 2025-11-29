package aula2;

public class ExercicioUm {
    public static void main(String[] args){
        int idade = 18;
        if (idade < 12){
            System.out.println("Criança");
        } else if (idade >= 12 && idade <= 17){
            System.out.println("Adolescente");
        } else if (idade >= 18 && idade <= 59){
            System.out.println("Adulto");
        } else {
            System.out.println("Idoso");
        }
    }
}

// em java é preciso fazer duas comparações separadas