package org.example.dino_jta.repositorios;

import com.example.um1.entidades.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlumnoRepository extends JpaRepository <Alumno, Long> {
}
