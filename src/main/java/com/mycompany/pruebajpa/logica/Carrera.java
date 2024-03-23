package com.mycompany.pruebajpa.logica;

import java.io.Serializable;
import java.util.LinkedList;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity //Especifica la creacion de una entidad(tabla) en la BD.
public class Carrera implements Serializable {
    //Atributos
    @Id //Especifica la primary key
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String nombre;
    
    @OneToMany(mappedBy = "carre") //Relacion uno a muchos, entre Carrera y Materia
    private LinkedList <Materia> listaMaterias;
    
    //Metodo constructor sin parametros
    public Carrera() {
    }
    
    //Metodo constructor con parametros
    public Carrera(int id, String nombre, LinkedList<Materia> listaMaterias) {
        this.id = id;
        this.nombre = nombre;
        this.listaMaterias = listaMaterias;
    }
    
    //Metodos Get y Set
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<Materia> getListaMaterias() {
        return listaMaterias;
    }
    public void setListaMaterias(LinkedList<Materia> listaMaterias) {
        this.listaMaterias = listaMaterias;
    }
    
}
