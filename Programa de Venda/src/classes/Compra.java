package classes;

import java.util.Scanner;

public class Compra {
    private int quantidade;
    private double preco;
    private String resposta;
    
    public Compra(int quantidade, double preco, String resposta) {
        this.quantidade = quantidade;
        this.preco = preco;
        this.resposta = resposta;
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



    public String getResposta() {
        return resposta;
    }



    public void setResposta(String resposta) {
        this.resposta = resposta;
    }



   public double lerPreco(Scanner sc, String mensagem) {
        while (true) {
            System.out.println(mensagem);
            try {
                return Double.parseDouble(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Número inválido");
            }
        }
    }
    
   public int lerQuantidade(Scanner sc, String mensagem) {
        while (true) {
            System.out.println(mensagem);
            try {
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Número inválido");
            }
        }
    }
    
   public String lerOpcao(Scanner sc, String mensagem) {
        while (true) {
            System.out.println(mensagem);
            String opcao = sc.nextLine().toLowerCase();
            if ("s".equals(opcao) || "n".equals(opcao))
                return opcao;
            else
                System.out.println("A opção deve ser S ou N");
        }
}


}

