package com.org.example;




import org.example.service.PedidoService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class PedidoServiceTest {

    private PedidoService pedidoService;

    @BeforeEach
    void setUp() {
        pedidoService = new PedidoService();
    }

    @Test
    void testCadastrarPedidoComDataValida() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dataEntrega = sdf.parse("25/12/2024");

        String resultado = pedidoService.cadastrarPedido("João", "Lavagem", dataEntrega);
        assertEquals("Pedido cadastrado com sucesso!", resultado);
    }

    @Test
    void testCadastrarPedidoComDataPassada() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dataEntrega = sdf.parse("01/01/2020");

        String resultado = pedidoService.cadastrarPedido("Maria", "Secagem", dataEntrega);
        assertEquals("Erro: A data de entrega não pode ser no passado.", resultado);
    }

    @Test
    void testAlterarStatusPedido() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dataEntrega = sdf.parse("30/12/2024");

        pedidoService.cadastrarPedido("Carlos", "Lavagem", dataEntrega);
        String resultado = pedidoService.alterarStatusPedido("Carlos", "Finalizado");
        assertEquals("Status do pedido alterado com sucesso!", resultado);
    }

    @Test
    void testConsultarPedidosPorStatus() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dataEntrega1 = sdf.parse("25/12/2024");
        Date dataEntrega2 = sdf.parse("01/01/2025");

        pedidoService.cadastrarPedido("João", "Lavagem", dataEntrega1);
        pedidoService.cadastrarPedido("Maria", "Secagem", dataEntrega2);

        pedidoService.alterarStatusPedido("João", "Finalizado");

        assertEquals(1, pedidoService.consultarPedidosPorStatus("Finalizado").size());
        assertEquals(1, pedidoService.consultarPedidosPorStatus("Em andamento").size());
    }
}

