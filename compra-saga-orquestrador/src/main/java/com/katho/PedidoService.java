package com.katho;

import jakarta.enterprise.context.ApplicationScoped;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

import org.apache.camel.Header;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@ApplicationScoped
@RegisterRestClient(baseUri = "http://compra-saga-pedido-katho-mau-dev.apps.sandbox-m3.1530.p1.openshiftapps.com/pedido")
public interface PedidoService {

    @GET
    @Path("newPedido")
    @Produces(MediaType.TEXT_PLAIN)
    public void newPedido(@QueryParam("id") @Header("id") Long id);

    public void cancelPedido(@QueryParam("id") @Header("id") Long id);
}
