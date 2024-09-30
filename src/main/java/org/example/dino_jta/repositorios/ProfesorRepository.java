package org.example.dino_jta.repositorios;

import com.example.um1.entidades.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfesorRepository extends JpaRepository <Profesor,Long> {

}
