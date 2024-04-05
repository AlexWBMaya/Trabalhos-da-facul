/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classe;

/**
 *
 * @author Alex
 */
public class ClassePoupanca {
    //Atributos
    String nomeCompleto = "";
    int numeroDaConta = 0;
    int agencia = 0;
    float saldo = 0;
    
    //Metodos
    public String emitirSaldo(){
        String saida = "Informações do Cliente\n";
        saida += "Agência: " + agencia + "\n";
        saida += "Número da Conta: " + numeroDaConta + "\n";
        saida += "Nome do Cliente: " + nomeCompleto + "\n";
        saida += "Saldo: " + saldo + "\n";
        return saida;
    }
    
    public void sacar(float valor)throws Exception{
        if(valor <= 0)
            throw new Exception("O valor do saque deve ser maior que 0");
        saldo -= valor;
    }
    
    public void depositar(float valor)throws Exception{
        if(valor <= 0) 
            throw new Exception("O valor do deposito deve ser maior que 0");
        saldo += valor;
    }
    
    public ClassePoupanca(String nomeCompleto, int numeroDaConta, int agencia, float saldo) throws Exception{
        
        if(nomeCompleto.isEmpty())
            throw new Exception("O nome não pode estar vazio");
        this.nomeCompleto = nomeCompleto;
        
        if(numeroDaConta < 0)
            throw new Exception("Essa conta não existe");
        this.numeroDaConta = numeroDaConta;
        
        if(agencia < 0)
            throw new Exception("Essa agência não existe");
        this.agencia = agencia;
        
        if(saldo < 1000)
            throw new Exception("O saldo inicial deve ser maior que 1000");
        this.saldo = saldo;
    }
    
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
}
