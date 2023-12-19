package com.katho;

import jakarta.enterprise.context.ApplicationScoped;
import java.util.HashMap;
import java.util.Map;

@ApplicationScoped
public class CreditoService {

    private int creditoTotal;
    private Map<Long, Integer> pedido_valor = new HashMap<>();

    public CreditoService() {
        this.creditoTotal = 100;
    }

    public void newPedidoValor(Long pedidoId, int valor) {
        if (valor > creditoTotal) {
            this.creditoTotal = 100; //Apenas parar que possamos testar vez após vez
            throw new IllegalStateException("Saldo Insuficiente");
        }

        creditoTotal = creditoTotal - valor;
        pedido_valor.put(pedidoId, valor);
    }

    public void cancelPedidoValor(Long id ) {
        //creditoTotal = creditoTotal + pedido_valor.get(id);
        //pedido_valor.remove(id);
        System.out.println("Pedido Valor falou. Iniciando cancelamento do pedido. Saldo insuficiente.");
    }

    public int getCreditoTotal() {
        return creditoTotal;
    }
}
