package org.example.dino_jta.repositorios;

import com.example.um1.entidades.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository <Persona, Long>{
}
