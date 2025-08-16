package com.alura.ForoHub.domain.topicos;

import com.alura.ForoHub.domain.cursos.Curso;
import com.alura.ForoHub.domain.perfiles.DatosPerfil;
import jakarta.validation.constraints.NotNull;

public record DatosActualizarTopico(
        @NotNull Long id,
        String titulo,
        String mensaje,
        Curso curso,
        DatosPerfil autor


) {


}
