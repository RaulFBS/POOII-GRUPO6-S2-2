package Clases;

/**
 *
 * @author angelo
 */
public class Curso {
    private String nombreCurso;
    private int nota;

    public Curso() {
    }

    public Curso(String nombreCurso, int nota) {
        this.nombreCurso = nombreCurso;
        this.nota = nota;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }
}
