package Aulas.Correcoes;

import java.util.Scanner;

public class Exercicios {
    public Exercicios() {
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // 1)
        System.out.println("Digite o primeiro número:");
        int num1 = entrada.nextInt();
        System.out.println("Digite o segundo número:");
        int num2 = entrada.nextInt();
        System.out.println("Qual operação você deseja fazer?");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        int operacao = entrada.nextInt();
        int div;
        int u;
        switch (operacao) {
            case 1:
                div = num1 + num2;
                System.out.println("O resultado da Adição é " + div);
                break;
            case 2:
                div = num1 - num2;
                u = num2 - num1;
                System.out.println("Os resultados das subtrações são " + div + " e " + u);
                break;
            case 3:
                div = num1 * num2;
                System.out.println("O resultado da multiplicação é " + div);
                break;
            case 4:
                div = num1 / num2;
                u = num2 / num1;
                System.out.println("Os resultados das divisões são " + div + " e " + u);
        }
        //2

        int contagem = 20;

        for (u = 0; u <= contagem; ++u) {
            System.out.println(u);
        }

        //3

        System.out.println("Digite o tamanho da sua lista: ");
        int tamanho = entrada.nextInt();
        int[] lista1 = new int[tamanho];
        int[] lista2 = new int[tamanho];
        System.out.println("Digite os valores da primeira lista: ");

        int encontros;
        for (encontros = 0; encontros < tamanho; ++encontros) {
            lista1[encontros] = entrada.nextInt();
        }

        System.out.println("Digite os valores da segunda lista: ");

        for (encontros = 0; encontros < tamanho; ++encontros) {
            lista2[encontros] = entrada.nextInt();
        }

        encontros = 0;


        //4

        int idade;
        for (idade = 0; idade < tamanho; ++idade) {
            if (lista1[idade] == lista2[idade]) {
                ++encontros;
            }
        }

        System.out.println("Foram " + encontros + " encontro(s)");
        System.out.println("Qual sua idade?");
        idade = entrada.nextInt();
        if (idade < 18) {
            System.out.println("Você ainda não tem mais de 18 anos.");
        } else {
            System.out.println("Você tem mais de 18 anos, já é legalmente adulto");
        }

    }
}
