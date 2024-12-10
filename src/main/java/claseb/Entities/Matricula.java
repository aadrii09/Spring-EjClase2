package claseb.Entities;

import org.hibernate.annotations.OnDelete;

import claseb.Entities.Enums.Curso;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name="matriculas")
public class Matricula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch=FetchType.EAGER, targetEntity = Alumno.class)
    @JoinColumn(nullable = false, name="alumno_id")
    private Alumno alumno_id;

    @ManyToOne(fetch=FetchType.EAGER, targetEntity = Asignatura.class)
    @JoinColumn(nullable = false, name="asignatura_id")
    private Asignatura asignatura_id;

    @Column(length=55, nullable= false)
    private Integer nota;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, columnDefinition = "ENUM('PRIMERO', 'SEGUNDO', 'TERCERO', 'CUARTO')")
    private Curso curso;
    
    public Matricula() {
    }

    public Matricula(Alumno alumno_id, Asignatura asignatura_id, Integer nota, Curso curso) {
        this.alumno_id = alumno_id;
        this.asignatura_id = asignatura_id;
        this.nota = nota;
        this.curso = curso;
    }

    public Matricula(Integer id, Alumno alumno_id, Asignatura asignatura_id, Integer nota, Curso curso) {
        this.id = id;
        this.alumno_id = alumno_id;
        this.asignatura_id = asignatura_id;
        this.nota = nota;
        this.curso = curso;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Alumno getAlumno_id() {
        return alumno_id;
    }

    public void setAlumno_id(Alumno alumno_id) {
        this.alumno_id = alumno_id;
    }

    public Asignatura getAsignatura_id() {
        return asignatura_id;
    }

    public void setAsignatura_id(Asignatura asignatura_id) {
        this.asignatura_id = asignatura_id;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    



    

}
