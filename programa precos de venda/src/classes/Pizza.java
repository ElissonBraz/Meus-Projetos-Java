package classes;

public class Pizza {
    
    private String Pizzas;
    private double valorPizzas;
    private int quantidadePizzas;
    
    public Pizza(String pizzas, double valorPizzas, int quantidadePizzas) {
        Pizzas = pizzas;
        this.valorPizzas = valorPizzas;
        this.quantidadePizzas = quantidadePizzas;
    }

    public String getPizzas() {
        return Pizzas;
    }

    public void setPizzas(String pizzas) {
        Pizzas = pizzas;
    }

    public double getValorPizzas() {
        return valorPizzas;
    }

    public void setValorPizzas(double valorPizzas) {
        this.valorPizzas = valorPizzas;
    }

    public int getQuantidadePizzas() {
        return quantidadePizzas;
    }

    public void setQuantidadePizzas(int quantidadePizzas) {
        this.quantidadePizzas = quantidadePizzas;
    }

    


}
