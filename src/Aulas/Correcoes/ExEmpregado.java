package Aulas.Correcoes;

import java.util.Scanner;

public class ExEmpregado {
    //2) Crie uma classe Empregado que possui:
    //	* Atributos: nome, sobrenome, salario
    //	* Construtores:
    //		- Cria empregados com base nos parâmetros nome, sobrenome e salario;
    //	* Métodos:
    //		- calcularSalarioAnual() => deve retornar double
    //		- aumentarSalario(double aumento) => aumenta o valor do salário
    //		- nomeCompleto() => deve retornar a concatenação do nome e sobrenome

    String nome;
    String sobrenome;
    double salario;

    ExEmpregado (String nome, String sobrenome, double salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
    }

    double salarioAnual() {
        return 12 * this.salario;
    }

    double aumentoSalarial() {
        System.out.println("Digite o aumento");
        Scanner entrada = new Scanner(System.in);
        double aumento = entrada.nextInt();
        return this.salario + aumento;
    }

    String nomeCompleto () {
        return this.nome + " " + this.sobrenome;
    }


    public static void main (String[] args){
        ExEmpregado empregado1 = new ExEmpregado( "Aline", "Soares",25000.0);
        System.out.println(empregado1.nome);
        System.out.println(empregado1.sobrenome);
        System.out.println(empregado1.salario);
        System.out.println(empregado1.salarioAnual());
        System.out.println(empregado1.aumentoSalarial());
        System.out.println(empregado1.nomeCompleto());
    }
}
