/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package package_esfera_model;

import javax.swing.JOptionPane;

/**
 *
 * @author Alex
 */
public class Class_Esfera {
    
    private float raio;
    
    public Class_Esfera(float raio){
        this.setRaio(raio);
    }
    
    public Class_Esfera(){
    }
    
    /**
     * @return the raio
     */
    public float getRaio() {
        return raio;
    }

    /**
     * @param raio the raio to set
     */
    public void setRaio(float raio) {
        if(raio != 0){
            this.raio = raio;
        }
        else{
            JOptionPane.showMessageDialog(null, "Erro, o valor não pode ser igual a 0.");
        }
    }
    
    public float calcularVolumeE(float raio){
        return (float) ((4*3.1415 * (raio * raio * raio))/3);
    }
    
    public float calcularAreaE(float raio){
        return (float) (4*3.1415*(raio*raio));
    }
    
}
