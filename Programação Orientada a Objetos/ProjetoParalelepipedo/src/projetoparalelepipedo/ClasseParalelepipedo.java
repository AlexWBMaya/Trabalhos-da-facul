/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoparalelepipedo;

/**
 *
 * @author Alex
 */
public class ClasseParalelepipedo {
    //atributos
    private float altura = 0;
    private float largura = 0;
    private float comprimento = 0;

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }
    
    public float calcularVolumeParalelepipedo() {
        return altura * comprimento * largura;
    }
    public float calcularAreaParalelepipedo() {
        return (altura * largura + altura * comprimento + largura * comprimento) * 2;
    }
}
