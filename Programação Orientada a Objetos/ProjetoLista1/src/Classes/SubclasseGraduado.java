package Classes;

/**
 *
 * author Alek
 */
public class SubclasseGraduado extends SubclasseEstudante {
    // Atributos da subclasse Graduado
    private int anoConclusao;
    private int anoColacaoGrau;
    private String numeroDiploma;

    // Construtores
    public SubclasseGraduado() {
        super();
    }

    public SubclasseGraduado(String nome, String endereco, String email, String telefone, int matricula, String curso, String campus, int anoConclusao, int anoColacaoGrau, String numeroDiploma) {
        super(nome, endereco, email, telefone, matricula, curso, campus);
        this.anoConclusao = anoConclusao;
        this.anoColacaoGrau = anoColacaoGrau;
        this.numeroDiploma = numeroDiploma;
    }

    // Getters e Setters
    public int getAnoConclusao() {
        return anoConclusao;
    }

    public void setAnoConclusao(int anoConclusao) {
        this.anoConclusao = anoConclusao;
    }

    public int getAnoColacaoGrau() {
        return anoColacaoGrau;
    }

    public void setAnoColacaoGrau(int anoColacaoGrau) {
        this.anoColacaoGrau = anoColacaoGrau;
    }

    public String getNumeroDiploma() {
        return numeroDiploma;
    }

    public void setNumeroDiploma(String numeroDiploma) {
        this.numeroDiploma = numeroDiploma;
    }

    // toString
    @Override
    public String toString() {
        return super.toString() + ", anoConclusao=" + anoConclusao + ", anoColacaoGrau=" + anoColacaoGrau + ", numeroDiploma=" + numeroDiploma;
    }
}
