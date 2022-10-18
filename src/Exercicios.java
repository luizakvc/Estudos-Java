import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       // 1) Escreva um programa que exiba as seguintes opções e realize os que se pede em cada uma delas: (Switch-cade)
       // 1- Adição; 2- Subtração; 3- Multiplicação; 4- Divisão
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

        switch (operacao) {
            case 1 -> {
                int soma = num1 + num2;
                System.out.println("O resultado da Adição é " + soma);
            }
            case 2 -> {
                int sub = num1 - num2;
                int sub2 = num2 - num1;
                System.out.println("Os resultados das subtrações são " + sub + " e " + sub2);
            }
            case 3 -> {
                int multi = num1 * num2;
                System.out.println("O resultado da multiplicação é " + multi);
            }
            case 4 -> {
                int div = num1 / num2;
                int div2 = num2 / num1;
                System.out.println("Os resultados das divisões são " + div + " e " + div2);
            }
        }


        // 2) Faça um programa que exiba os números de 1 até 2000

        int contagem = 20;
        int u = 0;
        while ( u <= contagem ) {
            System.out.println(u);
            u++;
        }

        // 3) Leia 2 vetores de inteiros V1 e V2 de N componentes cada (no máximo 50). Determine e imprima quantas vezes que
        // V1 e V2 possuem valores idênticos nas mesmas posições.

        System.out.println("Digite o tamanho da sua lista: ");
        int tamanho = entrada.nextInt();

        int[] lista1 = new int[tamanho];
        int[] lista2 = new int[tamanho];

        System.out.println("Digite os valores da primeira lista: ");
        for(int i = 0; i < tamanho; i++) {
            lista1[i] = entrada.nextInt();
        }

        System.out.println("Digite os valores da segunda lista: ");
        for(int i = 0; i < tamanho; i++) {
            lista2[i] = entrada.nextInt();
        }

        int encontros = 0;
        for(int i = 0; i < tamanho; i++) {
            if(lista1[i] == lista2[i]) {
                encontros++;
            }
        }
        System.out.println("Foram " + encontros + " encontro(s)");

        //4) Criar um programa que lê a idade de uma pessoa e diz se ela é maior de idade ou não.

        System.out.println("Qual sua idade?");
        int idade = entrada.nextInt();

        if ( idade < 18 ) {
            System.out.println("Você ainda não tem mais de 18 anos.");
        } else {
            System.out.println( "Você tem mais de 18 anos, já é legalmente adulto");
        }

        // 5) Criar um programa Java que lê n e depois n valores armazenado no array, sem seguida,
        // retorna a soma total e a média dos valores



    }
}
