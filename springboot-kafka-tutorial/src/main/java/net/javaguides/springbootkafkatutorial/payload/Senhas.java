package net.javaguides.springbootkafkatutorial.payload;

public class Senhas {
    private int parquimetro;
    private int viaVerde;
    private int iParque;

    public int getParquimetro() {
        return parquimetro;
    }

    public void setParquimetro(int parquimetro) {
        this.parquimetro = parquimetro;
    }

    public int getViaVerde() {
        return viaVerde;
    }

    public void setViaVerde(int viaVerde) {
        this.viaVerde = viaVerde;
    }

    public int getiParque() {
        return iParque;
    }

    public void setiParque(int iParque) {
        this.iParque = iParque;
    }

    @Override
    public String toString() {
        return "Senhas{" +
                "parquimetro=" + parquimetro +
                ", viaVerde=" + viaVerde +
                ", iParque=" + iParque +
                '}';
    }
}


