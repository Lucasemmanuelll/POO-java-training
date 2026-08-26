public class Curso {
    private String curso;

    Curso(String curso) {
        this.curso = curso;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String Curso) {
        this.curso = Curso;
    }
    public void mostrarCurso(){
    System.out.println("Curso: " + this.curso);
    }

}
