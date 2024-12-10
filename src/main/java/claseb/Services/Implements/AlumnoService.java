package claseb.Services.Implements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import claseb.Entities.Alumno;
import claseb.Repositories.AlumnoRepository;
import claseb.Services.service.IAlumnoService;

@Service
public class AlumnoService implements IAlumnoService {

    @Autowired
    AlumnoRepository alumnoRepo;
    @Override
    public void crearAlumno(Alumno alumno) {
        alumnoRepo.save(alumno);
    }
    
}
