package com.alura.ForoHub.domain.perfiles;

import jakarta.validation.constraints.NotBlank;

public record DatosPerfil(
        Long id,

        String nombre
) {
}
