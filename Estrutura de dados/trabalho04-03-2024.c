#include <stdio.h>
#include <stdlib.h>
#include <time.h>

void BuscaLinear(int vetor[])
{
    int chave;
    scanf("%d", &chave);
    for(int loop = 0; loop <= 18; loop++)
    {
        if(vetor[loop] == chave)
        {
            printf("O valor %d está na posição %d.\n", chave, loop + 1);
        }
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
    BuscaLinear(vetor);
}