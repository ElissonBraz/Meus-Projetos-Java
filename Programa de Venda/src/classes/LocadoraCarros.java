package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import interfacejava.Carros;

public class LocadoraCarros implements Carros{
    
    private Integer numero;
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

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    @Override
    public void inicioPrograma() {
        Locale.setDefault(Locale.US);
        Scanner ent = new Scanner(System.in);

        while (this.getSistemaOn().equals(true)) {

        System.out.println("========");
        System.out.println("Bem vindo a Locadora Fuctura");
        System.out.println("========");
        System.out.println("O que você deseja fazer?");
        System.out.println("0 - mostrar portifólio | 1 - alugar um carro | 2 - devolver um carro | 3 - sair ");
        this.setNumero(ent.nextInt());
        if (this.getNumero() == 0) {
            this.portifolio();
             System.out.println("========");
             System.out.println("O que você deseja fazer?");
             System.out.println("0 - mostrar portifólio | 1 - alugar um carro | 2 - devolver um carro | 3 - sair ");
            this.setNumero(ent.nextInt());
            
        }
        if (this.getNumero() == 1) {
            this.alugarCarro();
        }
        if (this.getNumero() == 2) {
            this.devolverCarro();
        }
        if (this.getNumero() == 3) {
            System.out.println("Obrigado por vir Volte Sempre!");
        }

        this.setSistemaOn(false);
        }

        System.out.println("===============");
        System.out.println("Fim do Programa");

        ent.close();

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
            System.out.println("[" + i + "] "+ carroList.get(i) + 
            String.format(" R$ %.2f", valorList.get(i))+ " / dia.");
        }
    }

    @Override
    public void alugarCarro() {

    Locale.setDefault(Locale.US);
    Scanner ent = new Scanner(System.in);

      this.portifolio();

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

      System.out.println("==============");
      System.out.print("Escolha o código do carro: ");
      int posicao = ent.nextInt();
      String marca = carroList.get(posicao);
      System.out.print("Por quantos dias você deseja alugar? ");
      this.setDia(ent.nextInt());
      Double valor = valorList.get(posicao);

      Double diasCarro = valor * this.getDia();

      System.out.println();
      System.out.println("Você escolheu " + marca + " por " + this.getDia() + " dias!");
      System.out.println("O aluguel Totalizará" + String.format(" R$ %.2f",diasCarro) + " reais");
      System.out.println("==============");
      System.out.println("Deseja Alugar?");
      System.out.println("0 - Sim| 1 - Não");
      this.setNumero(ent.nextInt());
      if (this.getNumero() == 0) {
        System.out.println();
        System.out.println("Parabêns você alugou o " + carroList.get(posicao) + " por " 
        + this.getDia() + " dias" );
        System.out.println("============");
        System.out.println("Deseja continuar?");
        System.out.println("0 - Sim | 1 - Sair");
        int numero = ent.nextInt();
        if (numero == 0) {
            this.inicioPrograma();
        } else if (numero == 1){
            System.out.println("Obrigado por vir Volte Sempre!");
        }
      } else if (this.getNumero() == 1) {
        System.out.println("Deseja continuar?");
        System.out.println("0 - Sim | 1 - Sair");
        int numero = ent.nextInt();
        if (numero == 0) {
            this.inicioPrograma();
        } else if (numero == 1){
            System.out.println("Obrigado por vir Volte Sempre!");
        }
      }
      ent.close();
    }

    @Override
    public void devolverCarro() {
        
    }


    
}
