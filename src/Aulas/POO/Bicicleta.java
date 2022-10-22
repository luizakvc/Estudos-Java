package Aulas.POO;

public class Bicicleta {
    private int marcha;
    private int velocidade;

    public Bicicleta (int marcha, int velocidade) {
        this.marcha = marcha;
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        return "batata";
    }

    public static void main (String[] args) {
        Bicicleta bicicleta = new Bicicleta (21, 0);
        Bicicleta bicicleta2 = new Bicicleta (15,10);
        System.out.println(bicicleta);
        System.out.println(bicicleta2);
    }
}
