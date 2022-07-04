package org.app.practica.facturacion.controller;


import org.app.practica.facturacion.model.Factura;
import org.app.practica.facturacion.service.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/factura")
public class FacturaController {

    @Autowired
    private FacturaService facturaService;

    @GetMapping("/list")
    public Mono<ResponseEntity<Flux<Factura>>> listar() {
        return Mono.just(ResponseEntity
                .ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(facturaService.listFacturas()));

    }

    @PostMapping("/save")
    public Mono<ResponseEntity<Mono<Factura>>> saveFactura(@RequestBody Factura factura) {
        return Mono.just(ResponseEntity
                .ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(facturaService.saveFactura(factura))
        );
    }

    @GetMapping("/get/{id}")
    public Mono<ResponseEntity<Mono<Factura>>> getIdFactura(@PathVariable("id") String id) {
        return Mono.just(
                ResponseEntity
                        .ok()
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(facturaService.getByIdFactura(id))
        );
    }

    @DeleteMapping("/delete/{id}")
    public Mono<ResponseEntity<Mono<Void>>> deleteFactura(@PathVariable("id") String id) {
        return Mono.just(
                ResponseEntity
                        .ok()
                        .body(facturaService.delete(id))
        );

    }


}
