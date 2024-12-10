package claseb.Entities;



import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import claseb.Entities.Enums.ColorPelo;
import jakarta.annotation.Generated;
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
@Table(name="alumnos")
public class Alumno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length=55, nullable= false)
    private String nombre;
    @Column(length=55, nullable= false)
    private Integer edad;
    @Column(length=55, nullable= false)
    private String dni;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, columnDefinition = "ENUM('MARRON', 'VERDE', 'AZUL', 'BLANCO', 'AMARILLO')")
    private ColorPelo colorPelo;

    @OneToMany(mappedBy = "alumno_id", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Matricula> listaMatriculas;

    public Alumno() {
    }

    public Alumno(String nombre, Integer edad, String dni, ColorPelo colorPelo, List<Matricula> listaMatriculas) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.colorPelo = colorPelo;
        this.listaMatriculas = listaMatriculas;
    }

    public Alumno(Integer id, String nombre, Integer edad, String dni, ColorPelo colorPelo,
            List<Matricula> listaMatriculas) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.colorPelo = colorPelo;
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

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public ColorPelo getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(ColorPelo colorPelo) {
        this.colorPelo = colorPelo;
    }

    public List<Matricula> getListaMatriculas() {
        return listaMatriculas;
    }

    public void setListaMatriculas(List<Matricula> listaMatriculas) {
        this.listaMatriculas = listaMatriculas;
    }
    




}
