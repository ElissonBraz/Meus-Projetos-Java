package classes;

public class Salgados {
    
    private String Salgados;
    private double valorSalgados;
    private int quantidadeSalgados;
    
    public Salgados(String salgados, double valorSalgados, int quantidadeSalgados) {
        Salgados = salgados;
        this.valorSalgados = valorSalgados;
        this.quantidadeSalgados = quantidadeSalgados;
    }

    public String getSalgados() {
        return Salgados;
    }

    public void setSalgados(String salgados) {
        Salgados = salgados;
    }

    public double getValorSalgados() {
        return valorSalgados;
    }

    public void setValorSalgados(double valorSalgados) {
        this.valorSalgados = valorSalgados;
    }

    public int getQuantidadeSalgados() {
        return quantidadeSalgados;
    }

    public void setQuantidadeSalgados(int quantidadeSalgados) {
        this.quantidadeSalgados = quantidadeSalgados;
    }

}
