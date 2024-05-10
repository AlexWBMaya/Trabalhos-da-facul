/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * author Alek
 */
public class SubclasseTrabalhador extends ClassePessoa {
    // Atributos da subclasse Trabalhador
    private String funcao;
    private String departamento;
    private double salario;

    // Construtores
    public SubclasseTrabalhador() {
        super();
    }

    public SubclasseTrabalhador(String nome, String endereco, String email, String telefone, String funcao, String departamento, double salario) {
        super(nome, endereco, email, telefone);
        this.funcao = funcao;
        this.departamento = departamento;
        this.salario = salario;
    }

    // Getters e Setters
    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // toString
    @Override
    public String toString() {
        return super.toString() + ", funcao=" + funcao + ", departamento=" + departamento + ", salario=" + salario + '}';
    }
}
