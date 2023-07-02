package entities;

import java.util.Locale;
import java.util.Scanner;

import controler.ContMarkup;

public class CalculoVenda implements ContMarkup {

    private Double despesaVariavel;
    private Double despesaFixa;
    private Double margemLucro;
    private Double custoUni;
    private Boolean logica;

    public CalculoVenda() {
    }

    public CalculoVenda(Boolean logica) {
        this.logica = true;
    }

    public Double getDespesaVariavel() {
        return despesaVariavel;
    }

    public void setDespesaVariavel(Double despesaVariavel) {
        this.despesaVariavel = despesaVariavel;
    }

    public Double getDespesaFixa() {
        return despesaFixa;
    }

    public void setDespesaFixa(Double despesaFixa) {
        this.despesaFixa = despesaFixa;
    }

    public Double getMargemLucro() {
        return margemLucro;
    }

    public void setMargemLucro(Double margemLucro) {
        this.margemLucro = margemLucro;
    }

    public Double getCustoUni() {
        return custoUni;
    }

    public void setCustoUni(Double custoUni) {
        this.custoUni = custoUni;
    }

    public Boolean getLogica() {
        return logica;
    }

    public void setLogica(Boolean logica) {
        this.logica = logica;
    }

    @Override
    public void inicioSistema() {
        Scanner ent = new Scanner(System.in);

        System.out.println("********************");
        System.out.println("Bem Vindo ao Sistema de Precificação");
        System.out.println("********************");
        this.setLogica(true);

        while (this.getLogica().equals(true)) {
            System.out.println();
            System.out.println("Digite");
            System.out.println("1 - Calculo | 2 - Sair");
            int opcao = ent.nextInt();

            if (opcao == 1) {
                this.formulaMarkup();
                this.setLogica(false);
                System.out.println("Obrigado por usar o Sistema!");
            } else if (opcao == 2) {
                this.setLogica(false);
                System.out.println("Obrigado por usar o Sistema!");
            } else {
                System.out.println("Digite uma opção valida!");
                this.inicioSistema();
            }

            ent.close();
        }

    }

    @Override
    public void formulaMarkup() {
        Locale.setDefault(Locale.US);
        Scanner ent = new Scanner(System.in);

        System.out.println();
        System.out.print("Digite a % Despesa Variável: ");
        double dv = ent.nextDouble();
        this.setDespesaVariavel(dv);
        System.out.print("Digite a % Despesa Fixa: ");
        double df = ent.nextDouble();
        this.setDespesaFixa(df);
        System.out.print("Digite a Margem de Lucro desejada: ");
        double ml = ent.nextDouble();
        this.setMargemLucro(ml);
        System.out.print("Agora Digite o Custo Unitário do Produto: ");
        double cu = ent.nextDouble();
        this.setCustoUni(cu);

        double cem = 100;
        double formula = cem / (cem - (this.getDespesaVariavel() + this.getDespesaFixa() + this.getMargemLucro()));
        double precoVenda = this.getCustoUni() * formula;

        System.out.println();
        System.out.println(String.format("Valor do Markup: %.3f", formula));
        System.out.println();
        System.out.println(String.format("Valor de Venda Proposto: %.2f", precoVenda));
        System.out.println();

        while (this.getLogica().equals(true)) {

            System.out.println("Deseja fazer um novo calculo?");
            System.out.println("Digite 1 - Sim | Digite 2 - Não");
            int numero = ent.nextInt();

            if (numero == 1) {
                this.formulaMarkup();
            } else if (numero == 2) {
                this.setLogica(false);
            } else {
                System.out.println("Digite uma opção valida!");
                System.out.println();
                this.setLogica(true);
            }
        }

        ent.close();
    }

}
