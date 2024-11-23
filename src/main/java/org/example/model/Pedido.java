package org.example.model;


import java.util.Date;

public class Pedido {
    private String nomeCliente;
    private String tipoServico;
    private Date dataEntrega;
    private String status;

    public Pedido(String nomeCliente, String tipoServico, Date dataEntrega) {
        this.nomeCliente = nomeCliente;
        this.tipoServico = tipoServico;
        this.dataEntrega = dataEntrega;
        this.status = "Em andamento";  // Status inicial
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(String tipoServico) {
        this.tipoServico = tipoServico;
    }

    public Date getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean validarDataEntrega() {
        return !dataEntrega.before(new Date());
    }
}
