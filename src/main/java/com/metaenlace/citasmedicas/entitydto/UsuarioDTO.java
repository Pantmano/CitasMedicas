package com.metaenlace.citasmedicas.entitydto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsuarioDTO {
    private Long id;
    private String usuario;
    private String nombre;
    private String apellidos;
    private String clave;
    public UsuarioDTO() {
    }
}