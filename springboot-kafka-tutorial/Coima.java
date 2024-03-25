import java.time.LocalDate;
import java.time.LocalTime;

public class Coima {
    private String id;
    private float valorCoima;
    private LocalDate data;
    private LocalTime hora;
    private boolean pago;
    private LocalEstacionamento rua;
    private Fiscal idFiscal;
    private Condutor nome;
    private Condutor matricula;

    public void emitirAlertaCondutor() {
        // Code for emitting alert to the driver
    }

    public void atualizarPagamento() {
        // Code for updating payment status
    }

    public void verCoimas() {
        // Code for viewing fines
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getValorCoima() {
        return valorCoima;
    }

    public void setValorCoima(float valorCoima) {
        this.valorCoima = valorCoima;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    public LocalEstacionamento getRua() {
        return rua;
    }

    public void setRua(LocalEstacionamento rua) {
        this.rua = rua;
    }

    public Fiscal getIdFiscal() {
        return idFiscal;
    }

    public void setIdFiscal(Fiscal idFiscal) {
        this.idFiscal = idFiscal;
    }

    public Condutor getNome() {
        return nome;
    }

    public void setNome(Condutor nome) {
        this.nome = nome;
    }

    public Condutor getMatricula() {
        return matricula;
    }

    public void setMatricula(Condutor matricula) {
        this.matricula = matricula;
    }
}