/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Alek
 */
public class ClasseLivro extends ClasseProduto {
    // Atributos específicos de Livro
    private String titulo;
    private String autor;
    private String tradutor;
    private String editora;
    private int anoPublicacao;

    // Construtores
    public ClasseLivro() {
        super();
        this.setTipo("Livro");
    }

    public ClasseLivro(int codigo, String descricao, float preco, String titulo, String autor, String tradutor, String editora, int anoPublicacao) {
        super(codigo, descricao, preco, "Livro");
        this.titulo = titulo;
        this.autor = autor;
        this.tradutor = tradutor;
        this.editora = editora;
        this.anoPublicacao = anoPublicacao;
    }

    // Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTradutor() {
        return tradutor;
    }

    public void setTradutor(String tradutor) {
        this.tradutor = tradutor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    @Override
    public String toString() {
        return super.toString() + ", titulo=" + titulo + ", autor=" + autor + ", tradutor=" + tradutor + ", editora=" + editora + ", anoPublicacao=" + anoPublicacao;
    }
}
