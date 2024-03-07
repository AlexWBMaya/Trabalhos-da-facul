package entidades;

public class Paciente{
    
    //Atributos
    public String nomeCompleto = "";
    public int peso = 0;
    public String sexo = "";
    
    
    public String strAltura = "";
    public float Altura = Float.parseFloat(strAltura);
    
    //metodos
    public float calcularIMC(){
        return peso/(Altura * Altura);
    }
}
