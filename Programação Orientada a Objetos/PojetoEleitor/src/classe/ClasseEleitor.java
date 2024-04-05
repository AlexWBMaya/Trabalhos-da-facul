/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classe;

/**
 *
 * @author Alex
 */
public class ClasseEleitor {
    //Atributos
    String nomeCompleto = "";
    int anoDeNascimento = 0;
    
    //Métodos

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) throws Exception {
        if(nomeCompleto.isEmpty())
            throw new Exception("O NOME ESTÁ VAZIO.");
        this.nomeCompleto = nomeCompleto;
    }

    public int getAnoDeNascimento() {
        return anoDeNascimento;
    }

    public void setAnoDeNascimento(int anoDeNascimento) throws Exception {
        if(anoDeNascimento < 1900 || anoDeNascimento > 2024)
            throw new Exception("DATA INVÁLIDA");
        this.anoDeNascimento = anoDeNascimento;
    }
    
    public String tipoDeEleitor(int anoDeNascimento) {
    String resposta = "";
    int idade = 2024 - anoDeNascimento;
    
    if (idade < 16) {
        resposta = "Não eleitor";
    } else if (idade < 18 || idade > 65) {
        resposta = "Eleitor Facultativo";
    } else {
        resposta = "Eleitor Obrigatório";
    }
    
    return resposta;
    }
}

