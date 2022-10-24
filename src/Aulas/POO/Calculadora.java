package Aulas.POO;

public class Calculadora {
    //Atributo estático
    // Final = impede que mude o valor depois
    public static final double PI = 3.14;

    //Método estático--- não pertence ao objeto e sim a classe
    public static double soma(double a, double b) {
        return a + b;
    }

    public static double subtracao (double a, double b) {
        return a - b;
    }

    public static double multiplicacao (double a, double b) {
        return a * b;
    }

    public static double divisao (double a, double b) {
        return a / b;
    }

    public static void main (String[] args) {
        double resultadoSoma = Calculadora.soma(1,2);
        double resultadoSub = Calculadora.subtracao(1,2);
        double resultadoMulti = Calculadora.multiplicacao(1,2);
        double resultadoDiv = Calculadora.divisao(1,2);

        System.out.println(Calculadora.PI);
        System.out.println(Math.pow(2, 3));
        System.out.println(Math.PI);
        System.out.println(Math.sqrt(144));
    }
}
