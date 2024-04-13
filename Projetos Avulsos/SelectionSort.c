#include <stdio.h>
#include <string.h>

void selectionSort(int tamanho, char vetor[][100]){
    char temp[100];

    for (int posInicial = 0; posInicial < tamanho - 1; posInicial++)
    {
        int minimo = posInicial;
        for (int posComparada = posInicial + 1; posComparada < tamanho; posComparada++)
        {
            
            if ((strcmp(vetor[posComparada],vetor[minimo])) < 0)
            {
                minimo = posComparada;
            }
            
        }

        if (minimo != posInicial)
        {
            strcpy(temp, vetor[posInicial]);
            strcpy(vetor[posInicial], vetor[minimo]);
            strcpy(vetor[minimo], temp);
        }

    }
    
}

int main(){
    char strings[10][100] =
    {
    "demonstração",
    "maçã",
    "joão",
    "amigos",
    "batalha",
    "incrível",
    "exemplo",
    "top",
    "feliz",
    "cidade",
    };

    selectionSort(10, strings);
    for (int loop1 = 0; loop1 < 10; loop1++)
    {
        printf("\n");
        printf(strings[loop1]);
    }
    
}