package Aulas.POO;

public class Carro {
    String modelo;
    String marca;
    int ano;
    boolean ehflex;
    int qtPortas;
    double combustivelAtual;
    double consumo;
    boolean estarLigado;

    Carro(String modelo, String marca, int ano, boolean ehFlex, int qtPortas, double consumo) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.ehflex = ehFlex;
        this.qtPortas = qtPortas;
        this.combustivelAtual = 30.0;
        this.consumo = consumo;
        this.estarLigado = false;
    }

    // Abastecer
    void abastecer(double total) {
        this.combustivelAtual += total;
    }

    // Ligar
    void ligar() {
        this.estarLigado = true;
    }

    // Desligar
    void desligar() {
        this.estarLigado = false;
    }

    // Viajar
    boolean viajar (String local, double distancia) { // Tentar viajar, se conseguir true se não false
        if (this.estarLigado) {
            this.ligar();
        }
        double totalLitros = distancia / this.consumo; // qtd de litros necessaria pra viajar

        if(this.combustivelAtual - totalLitros > 0) {
            this.combustivelAtual  -= totalLitros;
            System.out.println("A viagem p/ " + local + " aconteceu. Sobrou " + this.combustivelAtual + " litros.");
            return true; // a viagem aconteceu
        } else {
            System.out.println("A viagem não foi possível");
            return false;
        }
    }
    // A main serve pra testar a classe
    public static void main(String[] args) {
        Carro carro1 = new Carro ("XY", "Ferrari", 2019, true, 4,40);
        Carro carro2 = new Carro ("Z", "Ford", 2000, false, 2, 50);

        System.out.println(carro1.combustivelAtual);
        carro1.abastecer(5);
        System.out.println(carro1.combustivelAtual);

        System.out.println(carro1.estarLigado);
        carro1.ligar();
        System.out.println(carro1.estarLigado);

        System.out.println(carro1.ano);
        carro1.ano = 2022;
        System.out.println(carro1.ano);

        boolean viajou = carro1.viajar("Fortaleza", 300);
        System.out.println(viajou);


    }
}
