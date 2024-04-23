/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Alex
 */
public class ClasseMudarBase {
    public static String mudarBase(int numero, int base) throws Exception {
        if (numero <= 0 || base <= 0)
            throw new Exception("Coloque apenas números positivos.");
        
        ClassePilha pilha = new ClassePilha(50);
        
        while (numero > 0) {
            int resto = numero % base;
            if (resto >= 10) {
                pilha.inserir((char) ('A' + resto - 10));
            } else {
                pilha.inserir(resto);
            }
            numero /= base;
        }
        
        StringBuilder numeroConvertido = new StringBuilder();
        while (!pilha.estaVazia()) {
            numeroConvertido.append(pilha.retirar());
        }
        
        return numeroConvertido.toString();
    }
}
