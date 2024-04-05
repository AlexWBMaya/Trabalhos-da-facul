/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoparalelepipedo;

/**
 *
 * @author Alex
 */
public class ClasseCone {
    //atributos
    private float raio;
    private float altura;
    
    //metodos

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) throws Exception {
        if(raio < 0)
            throw new Exception("O valor do raio não pode ser negativo;");
        this.raio = raio;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) throws Exception {
        if(altura < 0)
            throw new Exception("A altura não pode ser negativa.");
        this.altura = altura;
    }
    
    public float calcularGeratriz(){
        return (float) Math.sqrt((altura * altura) + (raio * raio));
    }
    
    public float calcularLaterallCone() {
        return (float) (3.1415 * raio * calcularGeratriz());
    }
    
    public float calcularAreaTotalCone() {
        return (float) (3.1415*raio*(calcularGeratriz()+raio));
    }
    
    public float calcularVolume() {
        return (float) ( 1.0/3.0 * 3.1415 * (raio * raio)*altura);
    }
}
