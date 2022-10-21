package Aulas.POO;

import java.util.ArrayList;

public class Pessoa {
    // Propriedades/atributos de uma Pessoa
    String nome;
    String sobrenome;
    int idade;
    double altura;
    double peso;

    ArrayList <Pessoa> conhecidos = new ArrayList<>();

    Pessoa() { // Construtor da classe. Com valores definidos não é viável
        this.nome = "José";
        this.sobrenome = "Almir";
        this.idade = 29;
        this.peso = 55.0;
        this.altura = 1.65;
    }
    // Jeito mais usual
    Pessoa(String nome, String sobrenome, int idade, double altura, double peso) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    //Ações de uma Pessoa
    //void = só executa ação
    void dizOla() {
        System.out.println("Olá, tudo bem? Meu nome é " +
                this.nome);
    }

    void mostrarImc() {
        double imc = this.peso / (this.altura * this.altura);
        System.out.println("O meu IMC é " + imc);
    }

    double calculaImc() {
        double imc = this.peso / (this.altura * this.altura);
        return imc;
    }

    void comer (String comida) {
        System.out.println("Estou comendo " + comida);
        this.peso += 0.5;
    }

    void cumprimentar(Pessoa pessoa) {
        this.dizOla();
        pessoa.dizOla();

        if (!this.conhecePessoa(pessoa)) { // ! nega o boolean
            this.addPessoaNova(pessoa);
            pessoa.addPessoaNova(this);
        }
    }

    // é como se fosse "int pessoa" Classe e parâmetro
    //Privou esse método para não ser burlado
    private void addPessoaNova(Pessoa pessoa) {
        System.out.println(this.nome + " conheceu " + pessoa.nome + "!");
        this.conhecidos.add(pessoa);
    }

    boolean conhecePessoa(Pessoa pessoa) {
        // Se true, a pessoa (this) conhece a outra pessoa
        return this.conhecidos.contains(pessoa);
    }
}

