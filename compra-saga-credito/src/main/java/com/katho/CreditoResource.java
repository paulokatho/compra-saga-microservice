package com.katho;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;


@Path("credito")
public class CreditoResource {

    @Inject
    CreditoService creditoService;

    @GET
    @Path("newPedidoValor")
    @Produces(MediaType.TEXT_PLAIN)
    public Response newPedidoValor(Long pedidoId, int valor) {
        try {
            creditoService.newPedidoValor(pedidoId, valor);
            return Response.ok().build();
        } catch (IllegalStateException e) {
            return Response.status(Status.NOT_ACCEPTABLE).entity(e.getMessage()).build();
        }
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
