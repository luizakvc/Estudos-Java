import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        System.out.println(numeros.length); // Tamanho do array

        for (int i = 0; i < numeros.length; i++) {
            //System.out.println("A posição " + i + " com valor de " + numeros[i]);
        }

        int[] numeros2 = new int[50]; // 0...49
        numeros2[0] = 500;
        numeros2[1] = -200;
        // ....
        numeros2[49] = 1;

        double[] notas = new double[5];
        String[] nomes = {"José Almir", "Renato Pereira", "Victor Icoma"};
        String[] sobrenomes = new String[10];

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número");
        int quantidade = entrada.nextInt();
        boolean[] valores = new boolean[quantidade];

        /// EXEMPLO
        System.out.println("Digite o total de notas: ");
        int totalNotas = entrada.nextInt(); // 5

        double [] notasProva = new double[totalNotas];

        for ( int i = 0; i < totalNotas; i++) {
            System.out.println("Digite o valor da nota: ");
            notasProva[i] = entrada.nextDouble();
        }
        double soma = 0.0;
        for ( double nota : notasProva) { // Para cada valor dentro de notasProva é executado
            soma += nota;
        }

        double media = soma / notasProva.length;

        // *** Condição Ternária
        String mensagem = (media < 7) ? " Você está reprovado " : "Você está aprovado"; // Faz o papel do if
        System.out.println(mensagem);
    }
}