
package com.metaenlace.citasmedicas.repository;


import com.metaenlace.citasmedicas.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    public Optional<Usuario> findByUsuario(String usuario);
    Optional<Usuario> findOneByUsuario(String email);
}
