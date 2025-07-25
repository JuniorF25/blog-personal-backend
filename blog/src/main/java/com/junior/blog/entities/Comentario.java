package com.junior.blog.entities;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Comentario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String contenido;
    private LocalDate fecha;

    @ManyToOne
    @JoinColumn(name = "publicacion_id")
    private Publicacion publicacion;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
    
}