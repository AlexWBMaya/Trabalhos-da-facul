#include <stdio.h>
#include <time.h>
#include <stdlib.h>

void bubbleSort(int tamanho, int vetor[]){
    int aux;

    for(int loop2 = 0; loop2 < tamanho; loop2 ++){
        for(int loop3 = 0; loop3 < tamanho - loop2 - 1; loop3++){
            if(vetor[loop3] > vetor[loop3 + 1]){
                aux = vetor[loop3];
                vetor[loop3] = vetor[loop3 + 1];
                vetor[loop3 + 1] = aux;
            }
        }
    }
}

void buscaMelhorada(int tamanho, int vetor[]){
    int chave;
    printf("Chave; ");
    scanf("%d", &chave);
    for(int loop4 = 0; loop4 <= 10; loop4++){
        if(vetor[loop4] == chave){
            printf("O valor %d está na posição %d.", chave, loop4);
        }
    }
}

int main(){
    int vetor[10];
    int vetorteste[10];

    srand(time(NULL));
    for(int loop1 = 0; loop1 < 10; loop1++){
        vetor[loop1] = rand() % 100;
        vetorteste[loop1] = vetor[loop1];
    }

    bubbleSort(10, vetorteste);
    for(int teste1 = 0; teste1 < 10; teste1++){
        printf("%d ", vetorteste[teste1]);
    }

    buscaMelhorada(10, vetorteste);

    return 0;
}
