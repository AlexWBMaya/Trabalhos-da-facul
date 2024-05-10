/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * author Alek
 */
public class ClasseNotebook extends ClasseProduto {
    // Atributos específicos de Notebook
    private String marca;
    private String modelo;
    private String memoriaRAM;
    private String capacidadeHDSSD;
    private String processador;
    private double tamanhoTela;
    private String sistemaOperacional;

    // Construtores
    public ClasseNotebook() {
        super();
        this.setTipo("Notebook");
    }

    public ClasseNotebook(int codigo, String descricao, float preco, String marca, String modelo, String memoriaRAM, String capacidadeHDSSD, String processador, double tamanhoTela, String sistemaOperacional) {
        super(codigo, descricao, preco, "Notebook");
        this.marca = marca;
        this.modelo = modelo;
        this.memoriaRAM = memoriaRAM;
        this.capacidadeHDSSD = capacidadeHDSSD;
        this.processador = processador;
        this.tamanhoTela = tamanhoTela;
        this.sistemaOperacional = sistemaOperacional;
    }

    // Getters e Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(String memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public String getCapacidadeHDSSD() {
        return capacidadeHDSSD;
    }

    public void setCapacidadeHDSSD(String capacidadeHDSSD) {
        this.capacidadeHDSSD = capacidadeHDSSD;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public double getTamanhoTela() {
        return tamanhoTela;
    }

    public void setTamanhoTela(double tamanhoTela) {
        this.tamanhoTela = tamanhoTela;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    @Override
    public String toString() {
        return super.toString() + ", marca=" + marca + ", modelo=" + modelo + ", memoriaRAM=" + memoriaRAM + ", capacidadeHDSSD=" + capacidadeHDSSD + ", processador=" + processador + ", tamanhoTela=" + tamanhoTela + ", sistemaOperacional=" + sistemaOperacional;
    }
}

