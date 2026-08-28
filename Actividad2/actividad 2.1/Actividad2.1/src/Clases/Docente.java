package Clases;

import java.util.Random;

/**
 *
 * @author angelo
 */
public class Docente extends Persona {
    private String cursoDocente;
     private String facultadDocente;

    public Docente(String Dni, String Nombre, String Apellido, String cursoDocente, String facultadDocente) {
        super(Dni, Nombre, Apellido);
        
        this.cursoDocente = cursoDocente;
        this.facultadDocente = facultadDocente;
    }
    
    // Indicación g: Método calificarCurso
    public void calificarCurso(Curso curso) {
        Random rand = new Random();
        int notaAleatoria = rand.nextInt(21); // Compañero, esto genera un num aleatorio entero entre 0 y 20
        curso.setNota(notaAleatoria);
        System.out.println("Nota asignada: " + notaAleatoria + " al curso " + curso.getNombreCurso());
    }

    public String getCursoDocente() {
        return cursoDocente;
    }

    public void setCursoDocente(String cursoDocente) {
        this.cursoDocente = cursoDocente;
    }

    public String getFacultadDocente() {
        return facultadDocente;
    }

    public void setFacultadDocente(String facultadDocente) {
        this.facultadDocente = facultadDocente;
    }
     
}
