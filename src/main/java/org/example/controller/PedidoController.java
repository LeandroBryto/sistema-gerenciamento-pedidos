package org.example.controller;



import org.example.service.PedidoService;

import java.util.Date;

public class PedidoController {
    private PedidoService pedidoService = new PedidoService();

    public String cadastrarPedido(String nomeCliente, String tipoServico, Date dataEntrega) {
        return pedidoService.cadastrarPedido(nomeCliente, tipoServico, dataEntrega);
    }

    public String alterarStatusPedido(String nomeCliente, String novoStatus) {
        return pedidoService.alterarStatusPedido(nomeCliente, novoStatus);
    }

    public String consultarPedidosPorStatus(String status) {
        return pedidoService.consultarPedidosPorStatus(status).toString();
    }
}
