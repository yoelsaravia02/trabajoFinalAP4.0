package org.example.Controllers;


import org.example.Entidades.TurnoMedico;
import org.example.Services.TurnoMedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class TurnoMedicoController {

    @Autowired
    private TurnoMedicoService turnoMedicoService;

    public TurnoMedico findTurnoMedicoById(Long id) {
        System.out.println("Aquie el turno medico: ");
        return turnoMedicoService.findById(id);
    }

    public List<TurnoMedico> turnoMedicoList() {
        System.out.println("Aqui la lista de turnos medicos: ");
        return turnoMedicoService.findAll();
    }

    public TurnoMedico createTurnoMedico() {
        System.out.println("Aqui se crea el turno medico: ");
        return turnoMedicoService.create();
    }

    public TurnoMedico updateTurnoMedico(Long id, TurnoMedico turno) {
        System.out.println("Aqui se actualiza el turno medico: ");
        return turnoMedicoService.update(id, turno);
    }

    public String deleteTurnoMedico(Long id) {
        System.out.println("Aqui se elimina el turno medico: ");
        return turnoMedicoService.delete(id);
    }

    public TurnoMedico updateEstadoTurnoMedico(Long id, TurnoMedico turno) {
        System.out.println("Aqui se actualiza el estado del turno medico: ");
        return turnoMedicoService.updateEstado(id, turno);
    }

}
