/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

public class ContaPoupanca {
    // Atributos
    private String nomeCompleto = "";
    private int agencia = 0;
    private int numeroDaConta = 0;
    private float saldo = 0;
    
    //Metodos
    public ContaPoupanca(String nomeCompleto, int agencia,
            int numeroDaConta, float saldo)throws Exception{
        if(nomeCompleto.isEmpty()) 
            throw new Exception("Nome não pode ser vazio");
        this.nomeCompleto = nomeCompleto;
        if(agencia <= 0)
            throw new Exception("Agencia não pode ser <= 0");
        this.agencia = agencia;
        if(numeroDaConta <= 0)
            throw new Exception("Numero da Conta não pode ser <= 0");
        this.numeroDaConta = numeroDaConta;
        if(saldo < 1000)
            throw new Exception("Saldo não pode ser <= 1000");
        this.saldo = saldo;
    }
    public String getNomeCompleto() {
        return nomeCompleto;
    }
    public void setNomeCompleto(String nomeCompleto)throws Exception {
        if(nomeCompleto.isEmpty()) 
            throw new Exception("Nome não pode ser vazio");
        this.nomeCompleto = nomeCompleto;
    }
    public int getAgencia() {
        return agencia;
    }
    public void setAgencia(int agencia)throws Exception {
        if(agencia <= 0)
            throw new Exception("Agencia não pode ser <= 0");
        this.agencia = agencia;
    }
    public int getNumeroDaConta() {
        return numeroDaConta;
    }
    public void setNumeroDaConta(int numeroDaConta)throws Exception {
        if(numeroDaConta <= 0)
            throw new Exception("Numero da Conta não pode ser <= 0");
        this.numeroDaConta = numeroDaConta;
    }
    public float getSaldo() {
        return saldo;
    }
    public float sacar(float valor)throws Exception{
        if(valor <= 0) 
            throw new Exception("valor do saque não pode ser <= 0");
        if(valor > saldo)
            throw new Exception("Faltou cracole");
        saldo -= valor; // saldo = saldo - valor
        return valor;
    }
    public void depositar(float valor)throws Exception{
        if(valor <= 0) 
            throw new Exception("valor do deposito não pode ser <= 0");
        saldo += valor;
    }
    public String emitirSaldo(){
        String saida = "Banco Seu Dinheiro e MEU\n";
        saida += "Agencia: " + agencia + "\n";
        saida += "Número da Conta: " + numeroDaConta + "\n";
        saida += "Nome do Cliente: " + nomeCompleto + "\n";
        saida += "Saldo: R$ " + saldo + "\n";
        return saida;
    }
}
