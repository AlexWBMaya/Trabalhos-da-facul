/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classe;

/**
 *
 * @author Alex
 */
public class ClasseSalario {
    //atributos
    int matricula = 0;
    String nomeCompleto = "";
    int dependentes = 0;
    int producao = 0;
    float salarioBase = 0;
    
    float gratificacao = 0;
    float salarioBruto = 0;
    float descontoINSS = 0;
    float descontoIRPF = 0;
    float descontoDependentes = 0;
    float salarioLiquido = 0;
    float descontos = 0;
    
    String saida = "";
    
    public void gratificacao(){
        //Gratificação>
        if(producao <= 1000)
            gratificacao = 500;
        if(producao > 1000 && producao <= 2000)
            gratificacao = 1250;
        if(producao > 2000)
            gratificacao = 2250;
        //Gratificação<
    }
    
    public void descontos(){
        descontos = descontoIRPF + descontoINSS - descontoDependentes;
        salarioLiquido = salarioBruto - descontos;
    }
    
    public void descontoDependentes(){
        descontoDependentes = (dependentes * 123);
    }
    
    public void descontoDoIRPF(){
        if(salarioBruto <= 1903.98)
            descontoIRPF = 0;
        else if(salarioBruto > 1903.98 && salarioBruto <= 2826.65)
            descontoIRPF = (float) (salarioBruto * 0.075);
        
        else if(salarioBruto > 2826.65 && salarioBruto <= 3751.06)
            descontoIRPF = (float) (salarioBruto * 0.15);
        
        else if(salarioBruto > 3751.06 && salarioBruto <= 4664.68)
            descontoIRPF = (float) (salarioBruto * 0.225);
        
        else if(salarioBruto > 4664.68)
            descontoIRPF = (float) (salarioBruto * 0.275);
    }
    
    public void descontoDoINSS(){
    //Desconto Do INSS>
        if(salarioBruto <= 1302)
            descontoINSS = (float) (salarioBruto * 0.075);
        
        else if(salarioBruto > 1302 && salarioBruto <= 2571.29)
            descontoINSS = (float) (salarioBruto * 0.9);
        
        else if(salarioBruto > 2571.30 && salarioBruto <= 3856.94)
            descontoINSS = (float) (salarioBruto * 0.12);
        
        else if(salarioBruto > 3856.94)
            descontoINSS = (float) (salarioBruto * 0.14);
        //Desconto Do INSS<
    }
    
    public void salarioBruto(){
        salarioBruto = salarioBase + gratificacao;
    }
        
    public ClasseSalario(int matricula, String nomeCompleto, int dependentes, int producao, float salarioBase)throws Exception{
        
        if(matricula < 0)
            throw new Exception("Matricula Negativa.");
        this.matricula = matricula;
        
        if(nomeCompleto.isEmpty())
            throw new Exception("Nome Vazio");
        this.nomeCompleto = nomeCompleto;
        
        if(dependentes < 0)
            throw new Exception("Dependentes Negativo");
        this.dependentes = dependentes;
        
        if(producao < 0)
            throw new Exception("Produção Negativa");
        this.producao = producao;
        
        if(salarioBase < 0)
            throw new Exception ("Salario Negativo");
        this.salarioBase = salarioBase;  
    }
    
    //metodos
    public String saida(){
        saida += "Matrícula; " + matricula + "\n";
        saida += "Nome Completo; " + nomeCompleto + "\n";
        saida += "Número De Dependentes; " + dependentes + "\n";
        saida += "Produção; " + producao + "\n";
        saida += "Gratificação; " + gratificacao + "\n";
        saida += "Salário Bruto; " + salarioBruto + "\n";
        saida += "Salário Base; " + salarioBase + "\n";
        saida += "INSS; " + descontoINSS + "\n";
        saida += "IRPF;  " + descontoIRPF + "\n";
        saida += "Desconto Por dependentes; " + descontoDependentes + "\n";
        saida += "Salário Liquído; " + salarioLiquido + "\n";
        
        return saida;
    }
    
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula)throws Exception {
        this.matricula = matricula;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public int getDependentes() {
        return dependentes;
    }

    public void setDependentes(int dependentes) {
        this.dependentes = dependentes;
    }

    public int getProducao() {
        return producao;
    }

    public void setProducao(int producao) {
        this.producao = producao;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public float getGratificacao() {
        return gratificacao;
    }

    public void setGratificacao(float gratificacao) {
        this.gratificacao = gratificacao;
    }

    public float getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(float salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public float getDescontoINSS() {
        return descontoINSS;
    }

    public void setDescontoINSS(float descontoINSS) {
        this.descontoINSS = descontoINSS;
    }

    public float getDescontoIRPF() {
        return descontoIRPF;
    }

    public void setDescontoIRPF(float descontoIRPF) {
        this.descontoIRPF = descontoIRPF;
    }

    public float getDescontoDependentes() {
        return descontoDependentes;
    }

    public void setDescontoDependentes(float descontoDependentes) {
        this.descontoDependentes = descontoDependentes;
    }

    public float getSalarioLiquido() {
        return salarioLiquido;
    }

    public void setSalarioLiquido(float salarioLiquido) {
        this.salarioLiquido = salarioLiquido;
    }
    
}
