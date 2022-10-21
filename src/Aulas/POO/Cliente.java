package Aulas.POO;

import java.time.LocalDate;

public class Cliente {
    private int id;
    private String nome;
    private String sobrenome;
    private LocalDate dataNascimento;
    private double altura;
    private double peso;

    Cliente(int id, String nome, String sobrenome,
            LocalDate dataNascimento, double altura, double peso) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
        this.peso = peso;
}
public void crescer() {
    this.altura += 0.2;
    }

    // **** Getter = possibilita a leitura dos atributos
    public String getNome() {
        return this.nome;
    }

    public String getSobrenome(){
        return this.sobrenome;
    }

    public String getNomeCompleto() {
        return this.nome + " " + this.sobrenome;
    }

    // Setter = possibilita a alteração de valores
    public void setAltura (double altura) {
        if (altura < 2.51 ) {
            this.altura = altura;
        } else {
            System.out.println("Altura inválida. Atriuto não modificado");
        }
    }

    public void setPeso (double novoPeso) {
        this.peso = novoPeso;
    }
}
// Atributos privados mas métodos públicos
