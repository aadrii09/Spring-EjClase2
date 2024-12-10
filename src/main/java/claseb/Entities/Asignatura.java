package claseb.Entities;

import java.util.List;

import claseb.Entities.Enums.ColorPelo;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table(name="asignaturas")
public class Asignatura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length=55, nullable= false)
    private String nombre;
    @Column(length=55, nullable= false)
    private Integer horas;

    @OneToMany(mappedBy = "asignatura_id", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Matricula> listaMatriculas;

    public Asignatura() {
    }

    public Asignatura(String nombre, Integer horas, List<Matricula> listaMatriculas) {
        this.nombre = nombre;
        this.horas = horas;
        this.listaMatriculas = listaMatriculas;
    }

    public Asignatura(Integer id, String nombre, Integer horas, List<Matricula> listaMatriculas) {
        this.id = id;
        this.nombre = nombre;
        this.horas = horas;
        this.listaMatriculas = listaMatriculas;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public List<Matricula> getListaMatriculas() {
        return listaMatriculas;
    }

    public void setListaMatriculas(List<Matricula> listaMatriculas) {
        this.listaMatriculas = listaMatriculas;
    }

   

    
}
