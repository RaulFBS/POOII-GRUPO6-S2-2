package Clases;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;

/**
 *
 * @author angelo
 */
public class Alumno extends Persona {
    private String codigoAlumno;
    private String nombreAlumno;
    private List<Curso> listaCursos;

    // Código del constructor exacto que pide el profesor en la indicación "h"
    public Alumno(String codigo, String nombre, List<Curso> listaCursos) {
        super("", "", "");
        this.codigoAlumno = codigo;
        this.nombreAlumno = nombre;
        this.listaCursos = listaCursos;
        
        this.leeCursosAlumno("cursosAlumnos.txt");
    }

    // --- AQUÍ ESTÁN LOS MÉTODOS QUE FALTABAN ---

    // Método para leer el archivo .txt (Indicación b)
    public void leeCursosAlumno(String nombreArchivo) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));
            String linea;
            while ((linea = br.readLine()) != null) {
                // Creamos el curso y le asignamos el nombre leído de la línea
                Curso nuevoCurso = new Curso();
                nuevoCurso.setNombreCurso(linea);
                this.listaCursos.add(nuevoCurso);
            }
            br.close();
        } catch (Exception e) {
            System.out.println("Error al leer el archivo de cursos: " + e.getMessage());
        }
    }

    // Indicación 1: "Deberá mostrarse los cursos en los que un alumno se encuentra matriculado."
    public void mostrarCursosMatriculados() {
        System.out.println("Cursos matriculados de " + this.nombreAlumno + ":");
        for (Curso curso : listaCursos) {
            System.out.println("- " + curso.getNombreCurso());
        }
    }

    // --- GETTERS Y SETTERS ---

    public String getCodigoAlumno() {
        return codigoAlumno;
    }

    public void setCodigoAlumno(String codigoAlumno) {
        this.codigoAlumno = codigoAlumno;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public List<Curso> getListaCursos() {
        return listaCursos;
    }

    public void setListaCursos(List<Curso> listaCursos) {
        this.listaCursos = listaCursos;
    }
}