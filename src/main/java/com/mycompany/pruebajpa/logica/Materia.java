package com.mycompany.pruebajpa.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity //Especifica la creacion de una entidad(tabla) en la BD.
public class Materia implements Serializable {
    //Atributos
    @Id //Especifica la primary key
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String nombre;
    private String tipo;
    
    @ManyToOne //Relacion de muchos a uno
    private Carrera carre;
    
    //Metodo constructor sin parametros
    public Materia() {
    }
    
    //Metodo constructor con parametros
    public Materia(int id, String nombre, String tipo, Carrera carre) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.carre = carre;
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

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Carrera getCarre() {
        return carre;
    }
    public void setCarre(Carrera carre) {
        this.carre = carre;
    }

}
