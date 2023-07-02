package classes;


public class Carros {

    private int numero;


    public Carros(int numero) {

        this.numero = numero;

    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public void inicioPrograma(){
        System.out.println("========");
        System.out.println("bem vindo a locadora fuctura");
        System.out.println("========");
        System.out.println("o que você deseja fazer?");
        System.out.println("0 - mostrar portifólio | 1 - alugar um carro | 2 - devolver um carro");
    }

    public void portifolio() {

            System.out.println("[0] Chevrolet Tracker - $ 120 / dia.");
            System.out.println("[1] Chevrolet Onix - $ 90 / dia.");
            System.out.println("[2] Chevrolet Spin - $ 150 / dia.");
            System.out.println("[3] Hyundai HB20 - $ 85 / dia.");
            System.out.println("[4] Hyundai Tucson - $ 120 / dia.");
            System.out.println("[5] Fiat Uno - $ 60 / dia.");
            System.out.println("[6] Fiat Mobi - $ 70 / dia.");
            System.out.println("[7] Fiat Pulse - $ 130 / dia.");
    }
    
    }
