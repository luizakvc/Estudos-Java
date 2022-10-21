package Aulas.POO;

//Intuito de testar o uso da classe Pessoa


public class PessoaTeste  {
    public static void main(String[] args) {
        // new = constrói um novo objeto de Pessoa
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "José";
        pessoa1.sobrenome = "Almir";
        pessoa1.idade = 29;
        pessoa1.peso = 55.0;
        pessoa1.altura = 1.65;

        pessoa1.dizOla();

        Pessoa pessoa2 = new Pessoa();
        System.out.println(pessoa2.nome);

        Pessoa pessoa4 = new Pessoa( "Pedro",
                "Gomes", 35, 1.75, 70.5);
        System.out.println(pessoa4);

        // Chamada de métodos ~~~
        pessoa4.dizOla();
        pessoa4.mostrarImc();
        double imcPessoa4 = pessoa4.calculaImc();
        System.out.println(imcPessoa4);

        pessoa4.comer("batata");

        // Exemplo nova pessoa
        Pessoa pedro = new Pessoa ("Pedro", "José", 29,
                1.88,80);

        Pessoa joao = new Pessoa ("João", " Carlos", 30,
                1.75, 90);

        pedro.cumprimentar(joao);
        pedro.cumprimentar(joao);

    }
}
