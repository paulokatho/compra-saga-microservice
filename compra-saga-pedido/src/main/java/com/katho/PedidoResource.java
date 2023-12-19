package com.katho;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("pedido")
public class PedidoResource {

    @Inject
    PedidoService pedidoService;

    @Path("newPedido")
    @Produces(MediaType.TEXT_PLAIN)
    @GET
    public void newPedido(@QueryParam("id") Long id) {
        pedidoService.newPedido(id);
    }

    @Path("cancelPedido")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public void cancelPedido(@QueryParam("id") Long id) {
        pedidoService.cancelPedido(id);
    }

}
