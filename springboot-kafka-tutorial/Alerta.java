import java.time.LocalDate;
import java.time.LocalTime;

public class Alerta {
    private String id;
    private LocalEstacionamento rua;
    private LocalDate data;
    private LocalTime hora;

    public void selecionarFiscal() {
        // Code for selecting a fiscal
    }

    public void enviarAlerta() {
        // Code for sending the alert
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalEstacionamento getRua() {
        return rua;
    }

    public void setRua(LocalEstacionamento rua) {
        this.rua = rua;
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
}
