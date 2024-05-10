/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Alek
 */
public class ClasseProduto {
    //atributos
    private int codigo = 0;
    private String descricao = "";
    private float preco = 0;
    private String tipo = "";
    
    //métodos
    public ClasseProduto(){
    }
    
    public ClasseProduto(int codigo, String descricao, float preco, String tipo){
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
        this.tipo = tipo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return  "codigo=" + codigo + ", descricao=" + descricao + ", preco=" + preco + ", tipo=" + tipo;
    }
    
}
