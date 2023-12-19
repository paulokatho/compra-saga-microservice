package com.katho;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;

import org.apache.camel.Header;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;


@ApplicationScoped
@RegisterRestClient(baseUri="http://compra-saga-credito-katho-mau-dev.apps.sandbox-m3.1530.p1.openshiftapps.com/credito")
public interface CreditoService {


    @GET
    @Path("newPedidoValor")
    public void newPedidoValor(@QueryParam("pedidoId") @Header("pedidoId") Long pedidoId, @Header("valor") int valor);

    @GET
    @Path("cancelPedidoValor")
    public void cancelPedidoValor(@QueryParam("id") @Header("id") Long id );

    @GET
    @Path("getCreditoTotal")
    public int getCreditoTotal();
}