#include <stdio.h>
#include <stdlib.h>
#include <time.h>

void selectionSort(int tamanho, int vetor[]){
    int temp;
    int minimo;
    
    for(int loop1; loop1 < tamanho; loop1++){
        minimo = loop1;
        
        for(int loop2 = loop1 + 1; loop2 < tamanho; loop2++){
            
            if(vetor[loop2] < vetor[minimo]){
                minimo = loop2;
            }
            
            if(minimo != loop1){
                temp = vetor[minimo];
                vetor[minimo] = vetor[loop1];
                vetor[loop1] = temp;
            }
        
        }
    
    }

}

int main(){
    int tamanho = 1000;
    int vetor[tamanho];
    srand(time(NULL));
    for(int loop1; loop1 < 100;){
        vetor[loop1] = rand() % 1000;
    }

    selectionSort(tamanho, vetor);

    for(int loop2; loop2 < tamanho; loop2++){
        printf("%d", vetor[loop2]);
    }
}