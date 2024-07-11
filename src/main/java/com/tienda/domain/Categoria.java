package com.tienda.domain;

import java.io.Serializable;
import lombok.Data;
import jakarta.persistence.*;

@Data
@Entity
@Table(name = "categoria")

public class Categoria implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria ")

    private Long idCategoria;
    private String descripcion;
    private String rutaImagen;
    private boolean activo;

    public Categoria() {
    }

    public Categoria(Long idCategoria, String descripcion, String rutaImagen, boolean activo) {
        this.descripcion = descripcion;
        this.activo = activo;
    }

}
