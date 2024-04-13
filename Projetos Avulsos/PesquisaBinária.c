#include <stdio.h>
#include <stdlib.h>
#include <time.h>

void criarPacotes(int tamanho, int vetor[]){
    srand(time(NULL));

    for (int loop1 = 0; loop1 < tamanho; loop1++)
    {
        vetor[loop1] = rand() % 10000;
    }
}

void ordenarPacotes(int tamanho,int vetor[]){
    int aux = 0;
    for (int loop3 = 0; loop3 < tamanho - 1; loop3++)
    {
        for (int loop4 = 0; loop4 < tamanho - loop3 - 1; loop4++)
        {
            if (vetor[loop4] > vetor[loop4 + 1])
            {
                aux = vetor[loop4];
                vetor[loop4] = vetor[loop4 + 1];
                vetor[loop4 + 1] = aux;
            }   
        }   
    }
}

int buscaBinaria(int tamanho,int vetor[]){
    int chave;
    int inicio = 0;
    int fim = tamanho - 1;
    int meio;
    scanf("%d",&chave);

    while (inicio <= fim)
    {
        meio = inicio + (fim - inicio)/2;
        if (chave == vetor[meio])
        {
            return meio;
        }
        if (chave < vetor[meio])
        {
            fim = meio - 1;
        }
        else
        {
            inicio = meio + 1;
        }
    }
    return -1;
}

int main(){
    int pacotes[1000];
    int posicao;

    criarPacotes(1000, pacotes);
    for (int loop2 = 0; loop2 < 1000; loop2++)
    {
        printf("%d ",pacotes[loop2]);
    }
    printf("\n\n");
    
    ordenarPacotes(1000, pacotes);
    for (int loop5 = 0; loop5 < 1000; loop5++)
    {
        printf("%d ",pacotes[loop5]);
    }
    printf("\n\n");

    posicao = buscaBinaria(1000,pacotes);
    if (posicao != -1)
    {
        printf("Posição; %d\n, Valor;%d", posicao, pacotes[posicao]);
    }
    else
        printf("Chave não encontrada.");
}