package com.mycompany.pruebajpa;

import com.mycompany.pruebajpa.logica.Alumno;
import com.mycompany.pruebajpa.logica.Carrera;
import com.mycompany.pruebajpa.logica.Controladora;
import com.mycompany.pruebajpa.logica.Materia;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class PruebaJpa {

    public static void main(String[] args) {
        //Instanciamos la clase Controladora
        Controladora control = new Controladora();
        
        //Creamos la lista de Materias y la agregamos
        LinkedList<Materia> listaMaterias = new LinkedList<Materia>();
        
        //Creacion de Carrera con lista de materias
        Carrera carre = new Carrera(25, "Tecnicatura en Programacion", listaMaterias);
        
        //Guardamos Carrera en BD
        control.crearCarrera(carre);
        
        //Creacion de Materias
        Materia mate1 = new Materia(58, "Programacion I", "Cuatrimestral", carre);
        Materia mate2 = new Materia(59, "Programacion II", "Cuatrimestral", carre);
        Materia mate3 = new Materia(60, "Programacion Avanzada", "Anual", carre);
        
        //Guardado de Materias en BD
        control.crearMateria(mate1);
        control.crearMateria(mate2);
        control.crearMateria(mate3);
        
        //Agregar a la lista las materias
        listaMaterias.add(mate1);
        listaMaterias.add(mate2);
        listaMaterias.add(mate3);
        
        carre.setListaMaterias(listaMaterias);
        control.editarCarrera(carre);
        
        //Creacion de Alumno con carrera
        Alumno al = new Alumno(23, "Luis", "Pacherrez", new Date(), carre);
        
        //Guardamos el alumno en la BD
        control.crearAlumno(al);
        
        //Vemos el resultado
        System.out.println("-----------------------");
        System.out.println("---- DATOS ALUMNOS ----");
        Alumno alu = control.traerAlumno(23);
        System.out.println("Alumno: " + alu.getNombre() + " " + alu.getApellido());
        System.out.println("Cursa la carrera de: " + alu.getCarre().getNombre());
        
        // ==================== ANTES DE LA CLASE MATERIA ====================
        //Creacion de carrera
        //Carrera carre = new Carrera(20, "Tecnicatura en Programacion");
        
        //Guardado Carrera en BD
        //control.crearCarrera(carre);
        
        //Creacion de alumno con carrera
        //Alumno al = new Alumno(10, "Javier", "Risco", new Date(), carre);
        
        //Guardamos el alumno en la BD
        //control.crearAlumno(al);
        
        //Vemos el resultado
        //System.out.println("-----------------------");
        //System.out.println("---- DATOS ALUMNOS ----");
        //Alumno alu = control.traerAlumno(10);
        //System.out.println("Alumno: " + alu.getNombre() + " " + alu.getApellido());
        //System.out.println("Cursa la carrera de: " + alu.getCarre().getNombre());
        
        // ==================== ANTES DE LA CLASE CARRERA ====================
        //*** Creamos un alumno ***
        //Alumno alu = new Alumno(2, "Carlos", "Gomez", new Date());
        //control.crearAlumno(alu);
        
        //*** Eliminamos un alumno ***
        //control.eliminarAlumno(2);
        
        //***Editar un alumno ***
        //alu.setApellido("Gonzales");
        //control.editarAlumno(alu);
        
        //***Listar un alumno ***
        //Alumno alu = control.traerAlumno(1);
        //System.out.println("El alumno es: " + alu.toString());
        
        //***Listar todos los alumnos ***
        //ArrayList<Alumno> listaAlumnos = control.traerListaAlumnos();
        //for(Alumno al : listaAlumnos) {
        //    System.out.println("El alumno es: " + al.toString());
        //}
        
    }
}
