package classes;

public class Carros {

    private String carro;
    private int quantidade;
    private double preco;
    private int numero;
    private int dias; 

    public Carros(String carro, int quantidade, double preco, int numero, int dias) {
        this.carro = carro;
        this.quantidade = quantidade;
        this.preco = preco;
        this.numero = numero;
        this.dias = dias;
    }

    public String getCarro() {
        return carro;
    }
    public void setCarro(String carro) {
        this.carro = carro;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getDias() {
        return dias;
    }
    public void setDias(int dias) {
        this.dias = dias;
    }
    
    public void portifolio() {

            System.out.println("[1] Chevrolet Onix - $ 90 / dia.");
            System.out.println("[2] Chevrolet Spin - $ 150 / dia.");
            System.out.println("[3] Hyundai HB20 - $ 85 / dia.");
            System.out.println("[4] Hyundai Tucson - $ 120 / dia.");
            System.out.println("[5] Fiat Uno - $ 60 / dia.");
            System.out.println("[6] Fiat Mobi - $ 70 / dia.");
            System.out.println("[7] Fiat Pulse - $ 130 / dia.");
    }

    public void alugarCarro () {

            System.out.println("[0] Chevrolet Tracker - $ 120 / dia.");
            System.err.println("[1] Chevrolet Onix - $ 90 / dia.");
            System.out.println("[2] Chevrolet Spin - $ 150 / dia.");
            System.out.println("[3] Hyundai HB20 - $ 85 / dia.");
            System.out.println("[4] Hyundai Tucson - $ 120 / dia.");
            System.out.println("[5] Fiat Uno - $ 60 / dia.");
            System.out.println("[6] Fiat Mobi - $ 70 / dia.");
            System.out.println("[7] Fiat Pulse - $ 130 / dia.");
            System.out.println("====================");
            System.out.println("escolha o codigo do carro:");

            System.out.println("por quantos dias você deseja alugar?");
         

            switch (numero) {
                   case 0:
                System.out.println("você escolheu Chevrolet Tracker por " + dias + " dias");
                    break;
                   case 1:
                System.out.println("você escolheu Chevrolet Spin por " + dias + " dias");
                    break;
                    case 2:
                System.out.println("você escolheu Chevrolet Onix por " + dias + " dias");
                    break;
                    case 3:
                System.out.println("você escolheu  Hyundai HB20 por " + dias + " dias");
                    break;
                    case 4:
                System.out.println("você escolheu Hyundai Tucson por " + dias + " dias");
                    break;
                    case 5:
                System.out.println("você escolheu Fiat Uno por " + dias + " dias");
                    break;
                    case 6:
                System.out.println("você escolheu Fiat Mobi por " + dias + " dias");
                    break;
                    case 7:
                System.out.println("você escolheu Fiat Pulse por " + dias + " dias");
                    break;
                default:
                System.out.printf("Você digitou uma operação inválida.");
            }
    
        }
    }
