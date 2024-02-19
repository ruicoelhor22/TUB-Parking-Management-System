package net.javaguides.springbootkafkatutorial.payload;

public class Alerta {
    private String alerta;

    public String getAlerta() {
        return alerta;
    }

    public void setAlerta(String alerta) {
        this.alerta = alerta;
    }

    @Override
    public String toString() {
        return String.valueOf(alerta);
    }
}


