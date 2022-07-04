package org.app.practica.facturacion.service;

import org.app.practica.facturacion.model.Factura;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IfacturaService {

    Flux<Factura> listFacturas();
    Mono<Factura>  saveFactura(Factura factura);
    Mono<Factura> getByIdFactura(String id);
    Mono<Void> delete(String id);


}
