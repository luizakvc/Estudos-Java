package Aulas;

import java.util.ArrayList;

public class Lista {
    public static void main (String[] args){
        // Cria um novo ArrayList vazio que guarda Integer
        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<String> nomes = new ArrayList<>();

        // **** Adicionando elementos no array
        numeros.add(10); // Equivale ao .push do JS
        numeros.add(20);
        numeros.add(1000);

        System.out.println(numeros);
        System.out.println(numeros.get(2)); // equivale numeros[2] para pegar posição especifica

        numeros.set(0, 500); // Posição e novo valor
        System.out.println(numeros);

        numeros.remove(0);
        System.out.println(numeros);

        numeros.add(1,250); // Adicionei na posição especifica
        System.out.println(numeros);

        System.out.println(numeros.size()); // array.length

        for ( int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));
        }
         for ( int numero: numeros) { // Para cada valor dentro do array ele execura o código

         }
    }
}
