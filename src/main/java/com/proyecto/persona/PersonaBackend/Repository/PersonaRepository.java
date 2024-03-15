package com.proyecto.persona.PersonaBackend.Repository;

import com.proyecto.persona.PersonaBackend.Model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
}
