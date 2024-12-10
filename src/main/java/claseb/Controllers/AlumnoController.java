package claseb.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import claseb.Entities.Alumno;
import claseb.Services.Implements.AlumnoService;

@RestController
@RequestMapping("/alumno")
public class AlumnoController {
    @Autowired
    AlumnoService alumnoService;

    @PostMapping(value = "/crearAlumno")
    public void crearAlumno(@RequestBody Alumno alumno){
        alumnoService.crearAlumno(alumno);
    }
}
