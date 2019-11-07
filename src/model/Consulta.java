package model;

import java.time.LocalDate;

public class Consulta {
    private LocalDate data;
    private Medico medico;
    private Cliente cliente;

    public Consulta() {
    }

    public Consulta(LocalDate data, Medico medico, Cliente cliente) {
        this.data = data;
        this.medico = medico;
        this.cliente = cliente;
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void realizarConsulta () {

    }


}
