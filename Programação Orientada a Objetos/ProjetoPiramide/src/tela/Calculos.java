/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tela;

/**
 *
 * @author Alex
 */
public class Calculos {
    
    public double somar(double n1, double n2){
        
        return(n1+n2);
    
    }
    
    public double subtrair(double n1, double n2) {
        
        return(n1-n2);
    }
    
    public double imc(double peso, double altura){
        
        return (int) (peso/(altura * altura));
        
    }
}
