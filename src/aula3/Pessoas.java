package aula3;

public class Pessoas {
    String nome;
    int idade;

    // Construtor com o mesmo nome da classe
    public Pessoas(String nome, int idade) { // parametros em ()
        this.nome = nome;       // pegue o valor que foi passado no parametro nome e coloque no atributo nome do objeto
        this.idade = idade; // same
    }

    public static void main(String[] args) {
        // Criando objeto aqui no main
        Pessoas p1 = new Pessoas("Ana", 22);

        System.out.println("Nome: " + p1.nome);
        System.out.println("Idade: " + p1.idade);
    }
}