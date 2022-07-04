package org.app.practica.facturacion.service;

import org.app.practica.facturacion.model.Factura;
import org.app.practica.facturacion.repository.FacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class FacturaService implements IfacturaService {

    @Autowired
    private FacturaRepository facturaRepository;

    @Override
    public Flux<Factura> listFacturas() {
        return facturaRepository.findAll().filter(factura -> factura.getValorTotal() >= 0);
    }

    @Override
    public Mono<Factura> saveFactura(Factura factura) {
        return  facturaRepository.save(factura);
    }

    @Override
    public Mono<Factura> getByIdFactura(String id) {
        return facturaRepository.findById(id);
    }

    @Override
    public Mono<Void> delete(String id) {
        return facturaRepository.deleteById(id);
    }
}
