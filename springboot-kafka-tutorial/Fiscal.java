import java.time.LocalDate;

public class Fiscal {
    private String id;
    private String nome;
    private LocalDate dataNascimento;
    private String email;
    private String numeroCC;
    private LocalEstacionamento rua;
    private Supervisor idSupervisor;
    private Alerta listaAlertas;

    public void registar() {
        // Code for the registar method
    }

    public void autenticar() {
        // Code for the autenticar method
    }

    public void verificarVeiculo() {
        // Code for the verificarVeiculo method
    }

    public void emitirCoima() {
        // Code for the emitirCoima method
    }

    public void verEstatisticas() {
        // Code for the verEstatisticas method
    }

    public void verAlertas() {
        // Code for the verAlertas method
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumeroCC() {
        return numeroCC;
    }

    public void setNumeroCC(String numeroCC) {
        this.numeroCC = numeroCC;
    }

    public LocalEstacionamento getRua() {
        return rua;
    }

    public void setRua(LocalEstacionamento rua) {
        this.rua = rua;
    }

    public Supervisor getIdSupervisor() {
        return idSupervisor;
    }

    public void setIdSupervisor(Supervisor idSupervisor) {
        this.idSupervisor = idSupervisor;
    }

    public Alerta getListaAlertas() {
        return listaAlertas;
    }

    public void setListaAlertas(Alerta listaAlertas) {
        this.listaAlertas = listaAlertas;
    }
}

