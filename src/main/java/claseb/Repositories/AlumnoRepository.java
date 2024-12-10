package claseb.Repositories;

import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;

import claseb.Entities.Alumno;

public interface AlumnoRepository extends JpaRepository <Alumno, Integer> {

}
