import java.time.LocalDate;

public class Supervisor {
    private String idSupervisor;
    private String nome;
    private LocalDate dataNascimento;
    private String email;
    private String numeroCC;
    private Fiscal listaFiscais;

    public void autenticar() {
        // Code for authentication
    }

    public void editarPerfil() {
        // Code for editing profile
    }

    public void verPerfil() {
        // Code for viewing profile
    }

    public void verAlertas() {
        // Code for viewing alerts
    }

    public void configurarAlertas() {
        // Code for configuring alerts
    }

    public void adicionarFiscais() {
        // Code for adding fiscal
    }

    public void removerFiscais() {
        // Code for removing fiscal
    }

    public void listarFiscais() {
        // Code for listing fiscal
    }

    public void verEstatisticas() {
        // Code for viewing statistics
    }

    public void verRelatorio() {
        // Code for viewing report
    }


    // Getters and Setters
    public String getIdSupervisor() {
        return idSupervisor;
    }

    public void setIdSupervisor(String idSupervisor) {
        this.idSupervisor = idSupervisor;
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

    public Fiscal getListaFiscais() {
        return listaFiscais;
    }

    public void setListaFiscais(Fiscal listaFiscais) {
        this.listaFiscais = listaFiscais;
    }
}
