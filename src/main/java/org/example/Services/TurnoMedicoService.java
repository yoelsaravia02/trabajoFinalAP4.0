package org.example.Services;


import org.example.Entidades.TurnoMedico;
import org.example.Repositories.TurnoMedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TurnoMedicoService {

    @Autowired
    private TurnoMedicoRepository turnoMedicoRepository;
    // GETALL
    public List<TurnoMedico> findAll() {
        List<TurnoMedico> turnos = turnoMedicoRepository.findAll();
        return turnos;
    }
    // GETONE
    public TurnoMedico findById(Long id) {
        TurnoMedico turno = turnoMedicoRepository.findById(id).get();
        return turno;
    }
    // POST
    public TurnoMedico create() {
        TurnoMedico turno = new TurnoMedico();
        turno.setFechaTurno(turno.getFechaTurno());
        turno.setEstado(turno.getEstado());
        turno.setPrecio(turno.getPrecio());
        turno.setMascota(turno.getMascota());
        turno.setProfesionalMedico(turno.getProfesionalMedico());
        turno = turnoMedicoRepository.save(turno);
        return turno;
    }
    // PUT
    public TurnoMedico update(Long id, TurnoMedico turno) {
        TurnoMedico turnoExistente = turnoMedicoRepository.findById(id).get();
        turnoExistente.setEstado(turno.getEstado());
        turnoExistente.setFechaTurno(turno.getFechaTurno());
        turnoExistente.setPrecio(turno.getPrecio());
        turnoExistente.setMascota(turno.getMascota());
        turnoExistente.setProfesionalMedico(turno.getProfesionalMedico());
        turnoExistente = turnoMedicoRepository.save(turnoExistente);
        return turnoExistente;
    }
    // DELETE
    public String delete(Long id) {
        turnoMedicoRepository.deleteById(id);
        return "Turno eliminado";
    }

    //UPDATE ESTADO
    public TurnoMedico updateEstado(Long id, TurnoMedico turno) {
        TurnoMedico turnoExistente = turnoMedicoRepository.findById(id).get();
        turnoExistente.setEstado(turno.getEstado());
        turnoExistente = turnoMedicoRepository.save(turnoExistente);
        return turnoExistente;
    }

}
