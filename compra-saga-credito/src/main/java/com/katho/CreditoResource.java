package com.katho;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;


@Path("credito")
public class CreditoResource {

    @Inject
    CreditoService creditoService;

    @GET
    @Path("newPedidoValor")
    @Produces(MediaType.TEXT_PLAIN)
    public void newPedidoValor(Long pedidoId, int valor) {

        creditoService.newPedidoValor(pedidoId, valor);
    }

    @GET
    @Path("cancelPedidoValor")
    @Produces(MediaType.TEXT_PLAIN)
    public void cancelPedidoValor(Long id) {

        creditoService.cancelPedidoValor(id);
    }

        @GET
    @Path("getCreditoTotal")
    @Produces(MediaType.TEXT_PLAIN)
    public int getCreditoTotal() {

        return creditoService.getCreditoTotal();
    }

}
