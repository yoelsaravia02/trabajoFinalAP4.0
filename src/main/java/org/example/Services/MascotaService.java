package org.example.Services;

import org.example.Entidades.Mascota;
import org.example.Repositories.MascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MascotaService {

    @Autowired
    private MascotaRepository mascotaRepository;

    //GETALL
    public List<Mascota> findAll() {
        List<Mascota> mascotas = mascotaRepository.findAll();
        return mascotas;
    }

    //GETONE
    public Mascota findbyId(Long id){
        Optional<Mascota> mascota = mascotaRepository.findById(id);
        return mascota.orElse(null);
    }

    //POST
    public Mascota create() {
        Mascota mascota = new Mascota();
        mascota.setNombre(mascota.getNombre());
        mascota.setNombre(mascota.getNombre());
        mascota.setEdad(mascota.getEdad());
        mascota.setColor(mascota.getColor());
        mascota.setPeso(mascota.getPeso());
        mascota = mascotaRepository.save(mascota);
        return mascota;
    }

    //PUT
    public Mascota update(Long id, Mascota mascota) {
        Mascota mascotaExistente = mascotaRepository.findById(id).get();
        mascotaExistente.setNombre(mascota.getNombre());
        mascotaExistente.setNombre(mascota.getNombre());
        mascotaExistente.setEdad(mascota.getEdad());
        mascotaExistente.setColor(mascota.getColor());
        mascotaExistente.setPeso(mascota.getPeso());
        mascotaExistente = mascotaRepository.save(mascotaExistente);
        return mascotaExistente;
    }

    //DELETE
    public String delete(Long id) {
        mascotaRepository.deleteById(id);
        return "Mascota eliminada";
    }
}
