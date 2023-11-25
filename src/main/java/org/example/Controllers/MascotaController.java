package org.example.Controllers;

import org.example.Entidades.Mascota;
import org.example.Services.MascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class MascotaController {

    @Autowired
    private MascotaService mascotaService;

    public Mascota findMascotaById(Long id){
        System.out.println("Aqui se muestra la mascota: ");
        return mascotaService.findbyId(id);
    }

    public List<Mascota> mascotaList(){
        System.out.println("Aqui se muestra la lista de mascotas: ");
        return mascotaService.findAll();
    }

    public Mascota createMascota(){
        System.out.println("Aqui se crea la mascota: ");
        return mascotaService.create();
    }

    public Mascota updateMascota(Long id, Mascota mascota){
        System.out.println("Aqui se actualiza la mascota: ");
        return mascotaService.update(id, mascota);
    }

    public String deleteMascota(Long id){
        System.out.println("Aqui se elimina la mascota: ");
        return mascotaService.delete(id);
    }

}
