#include <stdio.h>
#include <stdlib.h>

int main()
{
    //↓tamanho de vetores↓//
    //↓tamanho de vetores↓//
    int tamanho1 = 0, tamanho2;
    int *pvet1, *pvet2;
    int valor1;

    for (int loop0 = 0; loop0 != 1;)
    {
        system("cls");
        printf("Digite o tamanho que deseja pro Vetor 1.\n");
        scanf("%d", &tamanho1);
        if(tamanho1 > 30)
        {
            printf("Tamanho de vetor inválido.\n");
            break;
        }
        else
        {
            int vetor1[tamanho1];
            pvet1 = vetor1[0];
            loop0 = 1;
            break;
        }
        break;  
    }

    for (int loop1 = 0; loop1 != 0;)
    {
        printf("Digite o tamanho que deseja pro Vetor 2.\n");
        scanf("%d", &tamanho2);
        if(tamanho2 > 30)
        {
            printf("Tamanho de vetor inválido.\n");
        }
        else
        {
            int vetor2[tamanho2];
            * pvet2 = vetor2[0];
            loop1 = 1;
        }
    }
    //↑tamanho dos vetores↑//
    //↑tamanho dos vetores↑//
 
    //↓elementos dos vetores↓//
    //↓elementos dos vetores↓//
    for (int loop2 = 0; loop2 <= tamanho1; loop2++)
    {
        scanf("%d", &valor1);
        * (pvet1 + loop2) = valor1;
    }
    for (int loop3 = 0; loop3 < tamanho1; loop3++)
    {
        printf(* (pvet1 + loop3));
    }
}