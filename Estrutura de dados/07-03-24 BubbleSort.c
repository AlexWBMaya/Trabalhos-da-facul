#include <stdio.h>
#include <stdlib.h>
#include <time.h>

void bubbleSort(int vetor[], int tamanho){
    int aux;
    
    for(int loop1 = 0;loop1 < tamanho; loop1++){
        for(int loop2 = 0; loop2 < tamanho; loop2++){
            if(vetor[loop2] > vetor[loop2 + 1]){
                aux = vetor[loop2];
                vetor[loop2] = vetor[loop2 + 1];
                vetor[loop2 + 1] = aux;
            }
        }
    }
    for(int demo = 0; demo < 18; demo++){
        printf("%d ", vetor[demo]);
    }
}

int main()
{
    srand(time(NULL));
    int vetor[18];
    int resp;
    for(int loop1 = 0; loop1 < 18; loop1++)
    {
        vetor[loop1] = rand() % 100;
    }
    for(int loop2; loop2 < 18; loop2++)
    {
        printf("%d ", vetor[loop2]);
    }
    printf("\n");
    bubbleSort(vetor, 18);
}