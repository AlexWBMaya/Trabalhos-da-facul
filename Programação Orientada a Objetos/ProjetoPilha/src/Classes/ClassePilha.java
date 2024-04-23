package Classes;

/**
 *
 * @author Alex
 */
public class ClassePilha {
    //atributos
    int tamanho;
    int[] vet;
    int topo;
    
    //métodos
    public ClassePilha(int tamanho) throws Exception {
        if (tamanho <= 0) {
            throw new Exception("O tamanho da pilha deve ser maior que zero.");
        }
        this.tamanho = tamanho;
        vet = new int[tamanho];
        topo = -1;
    }
    
    public boolean estaVazia() {
        return topo == -1;
    }
    
    public boolean estaCheia() {
        return topo == tamanho - 1;
    }
    
    public void inserir(int elemento) throws Exception {
        if (estaCheia()) {
            throw new Exception("A pilha está cheia.");
        }
        topo++;
        vet[topo] = elemento;
    }
    
    public int retirar() throws Exception {
        if (estaVazia()) {
            throw new Exception("A pilha está vazia.");
        }
        int retorno = vet[topo];
        topo--;
        return retorno;
    }
    
    public int acessar() throws Exception {
        if (estaVazia()) {
            throw new Exception("A pilha está vazia.");
        }
        return vet[topo];
    }
}
