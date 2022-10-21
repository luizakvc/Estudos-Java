package Aulas.POO;

public class Pet {
    private String nome;
    private int idade;
    // protected= permite acesso direto nas subclasses (sem set e get)
    protected double peso;

    public Pet (String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    public void fazerSom() {
        System.out.println("...");
    }

    public void comer(String comida) {
        System.out.println("Estou comendo " + comida);
    }

    public void dormir () {
        System.out.println("ZZZzzzzzz");
    }

    public void brincar () {
        System.out.println("Estou brincando!!");
    }

    public double getPeso() { // Apenas Leitura
        return this.peso;
    }

    public void setPeso ( double novoPeso) { // Pode alterar
        this.peso = novoPeso;
    }
}

