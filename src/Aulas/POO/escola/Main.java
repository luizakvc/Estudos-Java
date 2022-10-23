package Aulas.POO.escola;

import java.util.ArrayList;

public class Main {
    public static void main (String [] args) {
        Aluno aluno = new Aluno("Carlos Augusto", "Carlos.Augusto@gmail.com",
                "000.000.000-00", 7.9);
        aluno.seApresentar();

        Professor prof = new Professor("Dudu", "dudu.escola@gmail.com",
                "000.111.000-11", "TI");
        prof.seApresentar();

        Pessoa p1 = new Pessoa ("Regina", "regina@gmail.com",
                "000.111.111-11");
        p1.seApresentar();

        Pessoa p2 = new Aluno ("Carlos Augusto", "Carlos.Augusto@gmail.com",
                "000.000.000-00", 7.9);
        Pessoa p3 = new Professor("Dudu", "dudu.escola@gmail.com",
                "000.111.000-11", "TI");
        System.out.println("~~~~~~~~~~~~~~");
        p2.seApresentar();
        p3.seApresentar();

    //// ****** POLIMORFISMO ******
    // usa o método da subclasse usando a referência da superclasse

        ArrayList<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(aluno);
        pessoas.add(prof);
        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);

        for ( Pessoa pessoa : pessoas) {
    // o método seApresentar se comporta diferente dependendo da classe original
            pessoa.seApresentar();
        }
    }
}
