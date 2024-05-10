package Classes;

/**
 *
 * author Alek
 */
public class SubclasseEstudante extends ClassePessoa {
    // Atributos da subclasse Estudante
    private int matricula;
    private String curso;
    private String campus;

    // Construtores
    public SubclasseEstudante() {
        super();
    }

    public SubclasseEstudante(String nome, String endereco, String email, String telefone, int matricula, String curso, String campus) {
        super(nome, endereco, email, telefone);
        this.matricula = matricula;
        this.curso = curso;
        this.campus = campus;
    }

    // Getters e Setters
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    // toString
    @Override
    public String toString() {
        return super.toString() + ", matricula=" + matricula + ", curso=" + curso + ", campus=" + campus;
    }
}
