package classes;

public class CalculoVenda {

    private double custo;
    private double valorVenda;
    private int imposto;

    public CalculoVenda(double custo, double valorVenda, int imposto) {
        this.custo = custo;
        this.valorVenda = valorVenda;
        this.imposto = imposto;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public int getImposto() {
        return imposto;
    }

    public void setImposto(int imposto) {
        this.imposto = imposto;
    }

    public double taxa() {
        return (custo * imposto) / 100;
    }

    public double custoFinal() {
        return taxa() + custo;
    }

    public double lucro() {
        return valorVenda - custoFinal();
    }

    public double margemLucro() {
        return (lucro() / valorVenda) * 100;
    }

    public String toString() {
        return "Custo Final: R$ " + String.format("%.2f", custoFinal())
                + ", Margem de Lucro: " + String.format("%.0f", margemLucro())
                + "%, Lucro da Venda: R$ " + String.format("%.2f", lucro());
    }

}