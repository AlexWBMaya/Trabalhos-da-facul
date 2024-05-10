/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * author Alek
 */
public class ClasseTV extends ClasseProduto {
    // Atributos específicos de TV
    private String modelo;
    private String marca;
    private String sistemaOperacional;
    private double tamanhoTela;

    // Construtores
    public ClasseTV() {
        super();
        this.setTipo("TV");
    }

    public ClasseTV(int codigo, String descricao, float preco, String modelo, String marca, String sistemaOperacional, double tamanhoTela) {
        super(codigo, descricao, preco, "TV");
        this.modelo = modelo;
        this.marca = marca;
        this.sistemaOperacional = sistemaOperacional;
        this.tamanhoTela = tamanhoTela;
    }

    // Getters e Setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public double getTamanhoTela() {
        return tamanhoTela;
    }

    public void setTamanhoTela(double tamanhoTela) {
        this.tamanhoTela = tamanhoTela;
    }

    @Override
    public String toString() {
        return super.toString() + ", modelo=" + modelo + ", marca=" + marca + ", sistemaOperacional=" + sistemaOperacional + ", tamanhoTela=" + tamanhoTela;
    }
}

