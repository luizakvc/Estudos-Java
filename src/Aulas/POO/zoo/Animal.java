package Aulas.POO.zoo;

//  *** Interface= define um conjunto de métodos
// a classe que "herda" deve implementar estes métodos

public interface Animal {
    void dormir();
    void fazerSom();
    void comer(String comida);
}
class Gato  implements Animal{
    @Override
    public void dormir() {
        System.out.println(" ZZzzzZZzzzZZ");
    }

    @Override
    public void fazerSom() {
        System.out.println("miau miau");
    }

    @Override
    public void comer(String comida) {
        if (comida.equals("Peixe")) {
            System.out.println("Miau, gosto de peixe!");
        } else {
            System.out.println("Eca, isso não é peixe");
        }
    }
}

class Galinha implements Animal {
    @Override
    public void dormir() {
        System.out.println(" ZZZzzz");
    }

    @Override
    public void fazerSom() {
        System.out.println("Pó pó pó?");
    }

    @Override
    public void comer (String comida) {
        System.out.println(" Pó pô " + comida);
    }

    public static void main (String[] args) {
        Galinha galinha = new Galinha();
        Gato gato = new Gato();

        galinha.fazerSom();
        galinha.comer("Sujeira");
        galinha.fazerSom();

        gato.fazerSom();
        gato.dormir();
        gato.comer("Peixe");

        Animal animalGalinha = new Galinha();
        Animal animalGato = new Gato();

        System.out.println(" ~~~~~~~~~~~~~~");

        animalGalinha.fazerSom();
        animalGato.fazerSom();
    }
}
