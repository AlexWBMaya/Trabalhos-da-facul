/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Alex
 */
public class ClasseNNatural {
    //atributo
    private long numero = 0;
        
    //métodos

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "" + numero;
    }
        
    public ClasseNNatural(ClasseNNatural objeto) {
        this.numero = objeto.numero;
    }

    public void ClasseNNatural(long numero) throws Exception{
        if(numero < 0) 
            throw new Exception("O numero não pode ser negativo.");
        this.numero = numero;
    }

    public ClasseNNatural() {

    }

    public void set(long numero)throws Exception{
        if(numero <= -1)
            throw new Exception("O número não pode ser negativo.");
        this.numero = numero;
    }

    public void set(ClasseNNatural objeto) {
        this.numero = objeto.numero;
    }

    /**
    * @return 
    */
    public long get() {
	return numero;
    }

    /**
    * @return 
     * @throws java.lang.Exception 
    */
    public long fatorial() throws Exception {
        if (numero < 0) {
            throw new Exception("Não é possível calcular o fatorial de um número negativo.");
        }
        long fatorial = 1;
        for (long aux = numero; aux >= 1; aux--) {
            fatorial *= aux;
        }
        return fatorial;
    }




    public boolean numeroPerfeito() {
        int raiz;
        raiz = (int) Math.pow(numero, 2);
        return (raiz * raiz) == numero;
    }

    public boolean capicua() {
        long invertido = 0;
        long aux = numero;            
        while(aux > 0){
            invertido = invertido * 10 + aux % 10;
            aux /= 10;
        }    
        return invertido == numero;
    }

    /**
    * @return 
    */
    public boolean quadradoPerfeito() {
        long raiz = (long) Math.sqrt(numero);
        return raiz * raiz == numero;
    }

    public boolean numeroPrimo() {
        if (numero <= 1)
            return false;
        for (long loop1 = numero - 1; loop1 >= 2; loop1--)
            if (numero % loop1 == 0)
                return false;
        return true; 
    }


    /**
    * @param base
    * @return 
    */
    public String mudarBase(long base) {
    if (numero == 0)
        return "0";

    StringBuilder resultado = new StringBuilder();
    long numTemp = Math.abs(numero);
    while (numTemp > 0) {
        long remanescente = numTemp % base;
        if (base == 16 && remanescente >= 10)
            resultado.insert(0, (char) ('A' + remanescente - 10));
        else
            resultado.insert(0, remanescente);

        numTemp /= base;
    }

    return resultado.toString();
}



    /**
    * calcular o maximo divisor comum entre
    * o atribuito e outro objeto
    * @param objeto
    * @param num
    * @return 
    */
    public long mdc(ClasseNNatural objeto, long num) {
        long numeroOriginal = objeto.numero;
        while (num != 0) {
            long temp = num;
            num = objeto.numero % num;
            objeto.numero = temp;
        }
        long resultado = objeto.numero;
        objeto.numero = numeroOriginal;
        return resultado;
    }



    /**
    * calcular o minimo multiplo comum entre 
    * o atributo e outro objeto desta classe
    * @param objeto
    * @param num
    * @return 
    */
    public long mmc(ClasseNNatural objeto, long num) {
        long mdc = mdc(objeto, num);
        if (mdc == 0) {
            return 0; 
        }
        long numeroOriginal = objeto.numero; 
        long resultado = (objeto.numero * num) / mdc; 
        objeto.numero = numeroOriginal; 
        return resultado;
    }



    /**
    * calcular se o atributo e primo com 
    * o atributo de outro objeto
    * @param objeto
    * @param num
    * @return 
    */
    public boolean saoPrimosEntreSi(ClasseNNatural objeto, long num) {
        return mdc(objeto, num) == 1;
    }
}

