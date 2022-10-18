public class Variáveis {
    // Esse método é a execução do código JAVA
    public static void main(String[] args) {
        System.out.println("Hello, World!"); // Equivale ao console.log

        // Variáveis no JAVA; fortemente tipado e estaticamente tipado
        int idade = 20; //int de inteiro (vai até 2 bilhões)
        double salario = 4500.99; // dupla precisão (duas casas decimais)
        float nota = 7.5f; // sufixo para float
        long populacaoTerra = 7_900_000_000l; // n° acima de 2Bi, sufixo l no final
        boolean tarefaConcluida = false; // pra usar bolleano usar a variavel boolean
        int i = 1, j = 0, k = 1000; // Multiplas variáveis
        String nomeCompleto = "José Almir"; // Sempre aspas duplas

        int teste = 10;
        teste = 9; // Reatribuição de variáveis /////o sublinhado indica reatribuição de valor

        final int teste2 = 200; // Torna impossível mudar o valor

        // OPERADORES

        int a = 10;
        int b = 5;

        int soma = a+ b; // 15
        int subtracao = a - b; // 5
        int multiplicacao = a * b; // 50
        int divisao = a / b; // 2

        System.out.println("O resultado da soma é " + soma);

        //A divisão entre dois inteiros resulta em inteiro
        int sete = 7;
        int dois = 2;
        double dois2 = 2.0;
        System.out.println(sete / dois);
        System.out.println(sete / dois2);

        //  MATH
        double x = Math.sqrt(144); //12 - raiz
        double y = Math.pow(5, 2); //25 - potencia
        System.out.println(Math.PI);

        // CASTING
        int pi2 = (int) Math.PI; // converteu o valor quebrado em um inteiro
        System.out.println(pi2); // 3 - não vai reproduzir a parte decimal porque ta usando int
        double resultado3 = sete / (double) dois; // 7/2.0  - transformou o int em um double portanto 2.0

        // Operadores 2
        int valor = 5;
        valor++; // incremento +1
        valor--; // decremento -1
        valor += 10; // valor = valor + 10

        // Operadores lógicos
        boolean teste1 = 5 > 1; // true
        boolean teste3 = 5 < 1; // false
        boolean teste4 = 5 == 5; // true
        boolean teste5 = 5 != 1; // true
        boolean teste6 = 6 >= 6; // true
        boolean teste7 = 5 <= 9; // true
    }
}
