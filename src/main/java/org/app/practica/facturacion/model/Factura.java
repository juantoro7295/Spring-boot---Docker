package org.app.practica.facturacion.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "informacion")
public class Factura {

    @Id
    private String id;
    @NotEmpty
    private String cliente;
    @NotEmpty
    private String descripcion;
    @NotEmpty
    private Double valorTotal;

}
