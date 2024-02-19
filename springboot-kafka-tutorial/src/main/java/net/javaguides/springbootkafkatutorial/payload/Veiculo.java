package net.javaguides.springbootkafkatutorial.payload;

public class Veiculo {
    private int nrVeiculos;

    public int getNrVeiculos() {
        return nrVeiculos;
    }

    public void setNrVeiculos(int nrVeiculos) {
        this.nrVeiculos = nrVeiculos;
    }

    @Override
    public String toString() {
        return String.valueOf(nrVeiculos);
    }
}

