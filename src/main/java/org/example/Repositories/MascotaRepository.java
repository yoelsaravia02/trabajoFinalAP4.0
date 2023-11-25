package org.example.Repositories;

import org.example.Entidades.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MascotaRepository extends JpaRepository<Mascota, Long> {
}
