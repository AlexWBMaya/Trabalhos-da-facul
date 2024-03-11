/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package package_piramide_model;

import javax.swing.JOptionPane;

/**
 *
 * @author Alex
 */
public class Class_Piramide {
    
    private float base;
    private float altura;
    
    public Class_Piramide(float baseparam, float alturaparam){
        this.setbase(baseparam);
        this.setaltura(alturaparam);
    }
    
    public Class_Piramide(){
    }
    
    public float getbase(){
        return base;
    }
    public float getaltura(){
        return altura;
    }
    public void setbase(float num){
        if(num != 0){
            this.base = num;
        }
        else{
            JOptionPane.showMessageDialog(null, "Erro, o valor não pode ser igual a 0.");
        }
    }
    public void setaltura(float num) {
        if(num != 0){
            this.altura = num;
        }
        else{
            JOptionPane.showMessageDialog(null, "Erro, o valor não pode ser igual a 0.");
        }
    }
    public String tostring(){
        return "Class_Piramide[ base " + base + " altura " + altura + "]";
    }
    
    public float calcularVolume(float base, float altura){
        return (((base*base)*altura)/3);
    }
}
