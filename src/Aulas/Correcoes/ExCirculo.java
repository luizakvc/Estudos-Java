package Aulas.Correcoes;

import java.util.Scanner;

public class ExCirculo {
    ////1) Crie uma classe Circulo que possui:
    //        //	* Atributos: raio, cor.
    //        //	* Construtores:
    //        //		- Cria circulos com base no parâmetro raio do construtor;
    //        //		- Cria círculos de raio 1;
    //        //	* Métodos:
    //        //		- calcularArea() => deve retornar double (PI * RAIO * RAIO)
    //        //		- calcularCircunferencia => deve retornar double (2 * PI * RAIO)
    //        //		- mudarRaio(double novoRaio) => deve alterar o valor do raio
    int raio;
    String cor;

    ExCirculo  (int raio, String cor) {
        this.raio = raio;
        this.cor = cor;
    }

    double calcularArea() {
        return 3.14 * this.raio * this.raio;
    }

    double calcularCircuferencia() {
        return 2 * 3.14 * this.raio;
    }

    void mudarRaio() {
        System.out.println("Digite um valor para o raio:");
        Scanner entrada = new Scanner(System.in);
        this.raio = entrada.nextInt();
        System.out.println(" Seu novo raio é " + this.raio);
    }



    public static void main (String[] args) {
        ExCirculo circulo = new ExCirculo(1, "rosa");
        System.out.println(circulo.raio);
        System.out.println(circulo.calcularArea());
        System.out.println(circulo.calcularCircuferencia());
        circulo.mudarRaio();

    }
}
