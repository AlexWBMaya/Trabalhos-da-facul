/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * author Alek
 */
public class ClasseCD extends ClasseProduto {
    // Atributos específicos de CD
    private String nomeAlbum;
    private String banda;
    private String cantor;
    private String generoMusical;

    // Construtores
    public ClasseCD() {
        super();
        this.setTipo("CD de música");
    }

    public ClasseCD(int codigo, String descricao, float preco, String nomeAlbum, String banda, String cantor, String generoMusical) {
        super(codigo, descricao, preco, "CD de música");
        this.nomeAlbum = nomeAlbum;
        this.banda = banda;
        this.cantor = cantor;
        this.generoMusical = generoMusical;
    }

    // Getters e Setters
    public String getNomeAlbum() {
        return nomeAlbum;
    }

    public void setNomeAlbum(String nomeAlbum) {
        this.nomeAlbum = nomeAlbum;
    }

    public String getBanda() {
        return banda;
    }

    public void setBanda(String banda) {
        this.banda = banda;
    }

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public String getGeneroMusical() {
        return generoMusical;
    }

    public void setGeneroMusical(String generoMusical) {
        this.generoMusical = generoMusical;
    }

    @Override
    public String toString() {
        return super.toString() + ", nomeAlbum=" + nomeAlbum + ", banda=" + banda + ", cantor=" + cantor + ", generoMusical=" + generoMusical;
    }
}
