package org.example.service;



import org.example.model.Pedido;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PedidoService {
    private List<Pedido> pedidos = new ArrayList<>();

    public String cadastrarPedido(String nomeCliente, String tipoServico, Date dataEntrega) {
        Pedido pedido = new Pedido(nomeCliente, tipoServico, dataEntrega);

        if (!pedido.validarDataEntrega()) {
            return "Erro: A data de entrega não pode ser no passado.";
        }

        pedidos.add(pedido);
        return "Pedido cadastrado com sucesso!";
    }

    public String alterarStatusPedido(String nomeCliente, String novoStatus) {
        for (Pedido pedido : pedidos) {
            if (pedido.getNomeCliente().equals(nomeCliente)) {
                pedido.setStatus(novoStatus);
                return "Status do pedido alterado com sucesso!";
            }
        }
        return "Pedido não encontrado!";
    }

    public List<Pedido> consultarPedidosPorStatus(String status) {
        List<Pedido> pedidosComStatus = new ArrayList<>();
        for (Pedido pedido : pedidos) {
            if (pedido.getStatus().equals(status)) {
                pedidosComStatus.add(pedido);
            }
        }
        return pedidosComStatus;
    }

    public List<Pedido> listarPedidos() {
        return pedidos;
    }
}

