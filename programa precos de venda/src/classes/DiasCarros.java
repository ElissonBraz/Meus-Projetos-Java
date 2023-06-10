package classes;

public class DiasCarros {
    private int dias;

    public DiasCarros(int dias) {
        this.dias = dias;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    @Override
    public String toString() {
        return "" + dias + "";
    }

    
}
