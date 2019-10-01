package model;

import java.time.LocalDate;

public class Consulta {
    private LocalDate data;
    private Medico medico;
    private  Paciente paciente;

    public Consulta() {
    }

    public Consulta(LocalDate data, Medico medico, Paciente paciente) {
        this.data = data;
        this.medico = medico;
        this.paciente = paciente;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
}
