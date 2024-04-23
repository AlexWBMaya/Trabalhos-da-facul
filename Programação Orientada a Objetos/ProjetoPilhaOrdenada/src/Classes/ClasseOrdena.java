package Classes;

import java.util.Random;

public class ClasseOrdena {
    
    public static int[] gerarValoresAleatorios() {
        long seed = System.currentTimeMillis();
        Random random = new Random(seed);
        
        int[] valores = new int[10];
        for (int i = 0; i < valores.length; i++) {
            valores[i] = random.nextInt(100);
        }
        return valores;
    }
    
    public static int[] ordenarComPilha(int[] valores) throws Exception {
        ClassePilha pilha = new ClassePilha(valores.length);
        ClassePilha aux = new ClassePilha(valores.length);
        
        for (int valor : valores) {
            pilha.inserir(valor);
        }
        
        while (!pilha.estaVazia()) {
            int x = pilha.retirar();

            while (!aux.estaVazia() && aux.acessar() < x) {
                int y = aux.retirar();
                pilha.inserir(y);
            }
            
            aux.inserir(x);
        }
        
        for (int i = 0; i < valores.length; i++) {
            valores[i] = aux.retirar();
        }
        
        return valores;
    }
}
