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

    @GET
    @Path("newPedido")
    @Produces(MediaType.TEXT_PLAIN)
    public void newPedido(@QueryParam("id") Long id) {
        pedidoService.newPedido(id);
    }

    @GET
    @Path("cancelPedido")
    @Produces(MediaType.TEXT_PLAIN)
    public void cancelPedido(@QueryParam("id") Long id) {
        pedidoService.cancelPedido(id);
    }

}
