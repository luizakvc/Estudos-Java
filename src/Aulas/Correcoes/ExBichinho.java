package Aulas.Correcoes;

import java.util.ArrayList;
import java.util.Scanner;

public class ExBichinho {
    Scanner entrada = new Scanner(System.in);
    //2)Crie uma classe Bichinho:
    //	* Atributos: nome, idade, peso, bucho (lista de Comida), estaDormindo(boolean)
    //	* Construtores: Cria bichinhos com base nos atributos nome, idade, peso. Bucho deve começar com lista vazia. estaDormindo deve iniciar false.
    //	* Métodos:
    //		- comer(Comida comida) => a comida deve alterar o peso do bichinho, o bichinho não come a mesma comida duas vezes. Ele não come se estiver dormindo!
    //	  - dormir(int horas) => altera o boolean estaDormindo p/ true, para cada hora dormida o bichinho perde 10% de seu peso atual;
    //		- acordar() => altera o boolean estaDormindo p/ false
    //
    // Crie uma classe Comida:
    //	* Atributos: nome, peso;
    //	* Construtores: Cria a comida com base nos parâmetros nome e peso;
    //	* Métodos:
    //		- getNome()
    //		- getPeso()

   String nome;
   int idade;
   double peso;
   ArrayList<Comida> bucho;
   boolean dormindo;

   ExBichinho (String nome, int idade, double peso) {
       this.nome = nome;
       this.idade = idade;
       this.peso = peso;
       this.bucho = new ArrayList();
       this.dormindo = false;
       }

       void comer(Comida comida) {
           if (this.dormindo) {
               System.out.println("Shiu!! Bichinho está dormindo");
           } else if (this.bucho.contains(comida)) {
               System.out.println("Não pode dar " + comida.getNome() + " de novo.");
           } else {
               this.bucho.add(comida);
               this.peso = this.peso + comida.getPeso();
           }
       }

       void dormir ( int horas) {
           boolean setDormindo = true;
           System.out.println("Bichinho está dormindo? " + setDormindo);
           double perdaPeso = this.peso * ( 0.1 * horas);
           System.out.println("O bichinho está perdendo " + perdaPeso + "g.");
           System.out.println("O bichinho agora pesa " + (this.peso - perdaPeso));
       }

       void acordar () {
       boolean setDormingo = false;
       System.out.println("Bichinho está dormindo? " + setDormingo);
       }

       public static void main(String[] args) {
       ExBichinho bichinho = new ExBichinho("Honda", 1, 2);
       Comida peixe = new Comida("peixe", 0.8);
       bichinho.comer(peixe);
       bichinho.comer(peixe);
       bichinho.dormir(3);
       bichinho.acordar();
   }









}
