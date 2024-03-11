/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package package_retangulo_model;

import javax.swing.JOptionPane;

/**
 *
 * @author Alex
 */
public class Class_Retangulo {

    public float calculoAreaRetangulo(float comprimento, float largura){
        if(comprimento < 0 || largura < 0){
            JOptionPane.showMessageDialog(null, "Erro, o valor não pode ser menor a 0.");
            return 0;
        }
        else{
            return(largura * comprimento);
        }
    }
    public float calculoPerimetroRetangulo(float comprimento, float largura){
        if(comprimento < 0 || largura < 0){
            JOptionPane.showMessageDialog(null, "Erro, o valor não pode ser menor a 0.");
            return 0;
        }
        else{
            return((largura + comprimento)*2);
        }
    }
}
