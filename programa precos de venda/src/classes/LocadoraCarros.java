package classes;

import java.util.ArrayList;
import java.util.List;

import interfacejava.Carros;

public class LocadoraCarros implements Carros{
    
    private Integer dia;
    private Boolean sistemaOn;
    
    public LocadoraCarros() {
        this.sistemaOn = true;
    }

    public Integer getDia() {
        return dia;
    }

    public void setDia(Integer dia) {
        this.dia = dia;
    }

    public Boolean getSistemaOn() {
        return sistemaOn;
    }

    public void setSistemaOn(Boolean sistemaOn) {
        this.sistemaOn = sistemaOn;
    }

    @Override
    public void inicioPrograma() {

        while (this.getSistemaOn().equals(true)) {

        System.out.println("========");
        System.out.println("bem vindo a locadora fuctura");
        System.out.println("========");
        System.out.println("o que você deseja fazer?");
        System.out.println("0 - mostrar portifólio | 1 - alugar um carro | 2 - devolver um carro");

        }

    }

    @Override
    public void portifolio() {

        this.listaCarros();

    }

    @Override
    public void listaCarros() {
        
        
        List <String> carroList = new ArrayList<>();
        carroList.add("Chevrolet Tracker");
        carroList.add("Chevrolet Onix");
        carroList.add("Chevrolet Spin");
        carroList.add("Hyundai HB20");
        carroList.add("Hyundai Tucson");
        carroList.add("Fiat Uno");
        carroList.add("Fiat Mobi");
        carroList.add("Fiat Pulse");

        List <Double> valorList = new ArrayList<>();
        valorList.add(120.00);
        valorList.add(90.00);
        valorList.add(150.00);
        valorList.add(85.00);
        valorList.add(120.00);
        valorList.add(60.00);
        valorList.add(70.00);
        valorList.add(130.00);


        for (int i = 0; i < carroList.size(); i++) {
            System.out.println("[" + i + "] "+ carroList.get(i) + String.format(" R$ %.2f", valorList.get(i))+ " / dia.");
        }
    }
    
}
