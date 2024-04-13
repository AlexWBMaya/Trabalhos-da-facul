#include <math.h>
#include <stdio.h>
#include <time.h>
#include <stdlib.h>
 
void insertionSort(int arr[], int n)
{
    int i, key, j;
    for (i = 1; i < n; i++) {   // i = 1                           // i = 2
        key = arr[i];           // chave = vetor[1]                // chave = vetor[2]
        j = i - 1;              // j = 1 - 1 = 0                   // j = 2 - 1 = 1
 
        // move os elementos 1 casa pra cima
        while (j >= 0 && arr[j] > key) {    // enquanto j0 >= 0 e vetor[j0] > vetor[1] // enquanto j0 >= 0 e vetor[j0] > vetor[2]
            arr[j + 1] = arr[j];            // vetor [1] = vetor [0]                   // vetor[1] = vetor[0]
            j = j - 1;                      // j = -1, quebra de loop                  // j = 0 - 1 = -1 
        }
        arr[j + 1] = key;                   //vetor [1] = chave = vetor[1]
    }
}

void printArray(int arr[], int n)
{
    int i;
    for (i = 0; i < n; i++)
        printf("%d ", arr[i]);
    printf("\n");
}

int main()
{
    srand(time(NULL));
    int tamanho = 1000;
    int vetor[tamanho];
    for(int loop1 = 0; loop1 < tamanho; loop1++){
        vetor[loop1] = rand() % 1000;
    }
 
    insertionSort(vetor, tamanho);
    printArray(vetor, tamanho);
 
    return 0;
}