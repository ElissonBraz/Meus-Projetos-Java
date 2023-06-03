package classes;

public class Bebida {

    private String Bebidas;
    private double valorBebidas;
    private int quantidadeBebidas;

    public Bebida(String bebidas, double valorBebidas, int quantidadeBebidas) {
        Bebidas = bebidas;
        this.valorBebidas = valorBebidas;
        this.quantidadeBebidas = quantidadeBebidas;
    }
    public String getBebidas() {
        return Bebidas;
    }
    public void setBebidas(String bebidas) {
        Bebidas = bebidas;
    }
    public double getValorBebidas() {
        return valorBebidas;
    }
    public void setValorBebidas(double valorBebidas) {
        this.valorBebidas = valorBebidas;
    }
    public int getQuantidadeBebidas() {
        return quantidadeBebidas;
    }
    public void setQuantidadeBebidas(int quantidadeBebidas) {
        this.quantidadeBebidas = quantidadeBebidas;
    }

    
}
