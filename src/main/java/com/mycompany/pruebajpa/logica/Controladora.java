package com.mycompany.pruebajpa.logica;

import com.mycompany.pruebajpa.persistencia.ControladoraPersistencia;
import java.util.ArrayList;
import java.util.LinkedList;

public class Controladora {
    //Instanciamos la clase ControladoraPersistencia
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    //*** ALUMNO ***
    //Procedimientos
    public void crearAlumno(Alumno alu) {
        controlPersis.crearAlumno(alu);
    }
    
    public void eliminarAlumno(int id) {
        controlPersis.eliminarAlumno(id);
    }
    
    public void editarAlumno(Alumno alu) {
        controlPersis.editarAlumno(alu);
    }
    
    //Funcion
    public Alumno traerAlumno(int id) {
        return controlPersis.traerAlumno(id);
    }
    
    public ArrayList<Alumno> traerListaAlumnos() {
        return controlPersis.traerListaAlumnos();
    }
    
    //*** CARRERA ***
    //Procedimientos
    public void crearCarrera(Carrera carre) {
        controlPersis.crearCarrera(carre);
    }
    
    public void eliminarCarrera(int id) {
        controlPersis.eliminarCarrera(id);
    }
    
    public void editarCarrera(Carrera carre) {
        controlPersis.editarCarrera(carre);
    }
    
    //Funcion
    public Carrera traerCarrera(int id) {
        return controlPersis.traerCarrera(id);
    }
    
    public ArrayList<Carrera> traerListaCarreras() {
        return controlPersis.traerListaCarreras();
    }
    
    //*** MATERIA ***
    //Procedimientos
    public void crearMateria(Materia mate) {
        controlPersis.crearMateria(mate);
    }
    
    public void eliminarMateria(int id) {
        controlPersis.eliminarMateria(id);
    }
    
    public void editarMateria(Materia mate) {
        controlPersis.editarMateria(mate);
    }
    
    //Funcion
    public Materia traerMateria(int id) {
        return controlPersis.traerMateria(id);
    }
    
    public LinkedList<Materia> traerListaMaterias() {
        return controlPersis.traerListaMaterias();
    }
    
}
