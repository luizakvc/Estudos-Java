package Aulas.POO;

//Sub/classe
public class Cachorro extends Pet { // referencia o construtor de Pet
    private String comidaFavorita;
    private String raca;

    public Cachorro (String nome, int idade, double peso, String comidaFavorita, String raca) {
        super(nome, idade, peso); // super = chama o construtor da SuperClasse. Sempre a 1° linha do construtor
        this.comidaFavorita = comidaFavorita;
        this.raca = raca;
    }

    @Override // anotação =Vamos sobrescrever a ação de fazer som
    // remete ao Cachorro e não ao Pet
    public void fazerSom() {
        System.out.println("Au au au");
    }

    @Override
    public void brincar() {
        this.fazerSom();
        super.brincar(); // Chama a função brincar da superclasse Pet
        this.dormir(); // chama do Pet porque não foi sobrescrito
    }

    @Override
    public void comer(String comida) {
        if (comida.equals(this.comidaFavorita)) {
            super.comer(comida);
            this.peso += 0.2;
            //this.setPeso(this.getPeso() + 0.2);
        } else {
            System.out.println("Quero " + comida + " não...");
        }

    }

    public void correrAtrasMoto() {
        this.fazerSom();
        System.out.println("~Correndo atrás de motos ~");
    }

    public static void main (String [] args) {
        // Testando herança

        Pet pet1= new Pet("Fred", 3, 12.5);
        pet1.dormir();
        pet1.comer("petisco");
        pet1.fazerSom();
        System.out.println("----------");

        Cachorro batata = new Cachorro ("Rex", 5,
                25,"Osso", "Caramelo");
        batata.dormir();
        batata.fazerSom();
        batata.comer("Feijão");
        batata.setPeso(20);
        batata.brincar();
        batata.comer("Osso");
        batata.correrAtrasMoto();
    }
}
