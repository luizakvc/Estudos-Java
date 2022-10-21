package Aulas;

import java.time.LocalDate;

public class Datas {
    public static void main(String[] args) {
        // ***** Dia- mês- ano. LocalDate armazena qualquer data
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        LocalDate natal = LocalDate.of(2022,12,25);
        System.out.println(natal);

        System.out.println(hoje.isAfter(natal)); // Verifica se a data é depois da especificada
        System.out.println(hoje.isBefore(natal)); // Verifica se a data é antes da especificada
        int ano = hoje.getYear();
        int mes = hoje.getMonthValue();
        int dia = hoje.getDayOfMonth();

        int diasParaNatal = natal.getDayOfYear() - hoje.getDayOfYear();

        System.out.println(ano);
    }
}
