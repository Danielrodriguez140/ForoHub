package com.alura.ForoHub.domain.topicos;

import com.alura.ForoHub.domain.cursos.Curso;
import com.alura.ForoHub.domain.perfiles.DatosPerfil;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosTopicos(
        @NotNull
        Long id,
        @NotBlank
        String titulo,
        @NotBlank
        String mensaje,
        @Valid
        DatosPerfil autor,
        @NotNull
        Curso curso

) {
}
