#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main() {
    srand(time(NULL)); 

    int tempoNaFaculdade = 0;
    int sono = 0;
    int limiteSono = 100; 
    while (tempoNaFaculdade < 8 * 60) { 
        printf("Tempo na faculdade: %d minutos\n", tempoNaFaculdade);
        if (sono >= limiteSono) {
            printf("Sensação de sono muito grande. Saindo da faculdade!\n");
            break;
        }

        tempoNaFaculdade += 30; 
        sleep(1); // Espera 1 segundo (simulação de tempo real)
    }

    printf("Fim do dia de faculdade eu quero morrer.\n");

    return 0;
}