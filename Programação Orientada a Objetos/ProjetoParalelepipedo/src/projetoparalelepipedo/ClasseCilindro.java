/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoparalelepipedo;

/**
 *
 * @author Alex
 */
public class ClasseCilindro {
    //atributos
    private float raio = 0;
    private float altura = 0;
    
    //metodos
    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public float calcularLateralCilindro(){
        return (float) (2 * 3.1415 * raio * altura);
    }
    
    public float calcularAreaTotalCilindro(){
        return (float) (2*3.1415*raio*(altura+raio));
    }
    
    public float calcularVolumeCilindro(){
        return (float) (3.1415*raio*raio*altura);
    }
}
