package org.app.practica.facturacion.repository;

import org.app.practica.facturacion.model.Factura;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacturaRepository extends ReactiveMongoRepository<Factura, String> {

}
