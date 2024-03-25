import java.time.LocalDate;

public class Camara {
    private int idCamara;
    private String marca;
    private String modelo;
    private LocalDate dataInstalacao;
    private LocalDate ultimaModificacao;
    //private Estado estado;
    private LocalEstacionamento rua;

    public void capturarImagem() {
        // Code to capture image
    }

    public void contarVeiculos() {
        // Code to count vehicles
    }

    public void enviarDados() {
        // Code to send data
    }

    // Getters and Setters
    public int getIdCamara() {
        return idCamara;
    }

    public void setIdCamara(int idCamara) {
        this.idCamara = idCamara;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public LocalDate getDataInstalacao() {
        return dataInstalacao;
    }

    public void setDataInstalacao(LocalDate dataInstalacao) {
        this.dataInstalacao = dataInstalacao;
    }

    public LocalDate getUltimaModificacao() {
        return ultimaModificacao;
    }

    public void setUltimaModificacao(LocalDate ultimaModificacao) {
        this.ultimaModificacao = ultimaModificacao;
    }

    // public Estado getEstado() {
    //     return estado;
    // }

    // public void setEstado(Estado estado) {
    //     this.estado = estado;
    // }

    public LocalEstacionamento getRua() {
        return rua;
    }

    public void setRua(LocalEstacionamento rua) {
        this.rua = rua;
    }
}
