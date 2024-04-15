#include <stdio.h>
#include <stdlib.h>
#define tamanho 100

typedef struct fila {
    int ini, fim;
    float vet[tamanho];
} Fila;

int proximoIndice(int indice) {
    return (indice + 1) % tamanho; // Retorna o próximo índice, garantindo que ele esteja dentro do intervalo válido
}

Fila* cria(void) {
    Fila* f = (Fila*)malloc(sizeof(Fila));
    f->ini = f->fim = 0;
    return f;
}

void insere(Fila* f, float valor) {
    if (proximoIndice(f->fim) == f->ini) {
        printf("Capacidade da fila estourou.\n");
        exit(1);
    }
    f->vet[f->fim] = valor;
    f->fim = proximoIndice(f->fim);
}

float retira(Fila* f) {
    if (f->ini == f->fim) {
        printf("A fila está vazia.\n");
        exit(1);
    }
    float v = f->vet[f->ini];
    f->ini = proximoIndice(f->ini);
    return v;
}

int vazia(Fila* f) {
    return (f->ini == f->fim);
}

int cheia(Fila* f) {
    return (proximoIndice(f->fim) == f->ini);
}

void libera(Fila* f) {
    free(f);
}

int main() {
    Fila* filaExecutada = cria();
    float valor;
    int escolha;
    printf("Executar sequencialmente.\nTestes;\n");
    printf("1 - Inserir um valor.\n2 - Retirar um valor.\n3 - Verificar se a fila está vazia.\n4 - Verificar se a fila está cheia.\n");
    printf("5 - Imprimir fila.\n6 - Sair.\n");
    do {
        printf("\nEscolha uma opção: ");
        scanf("%d", &escolha);

        switch (escolha) {
            case 1:
                printf("Digite o valor a ser inserido: ");
                scanf("%f", &valor);
                insere(filaExecutada, valor);
                printf("Valor inserido com sucesso.\n");
                break;
            case 2:
                printf("Valor retirado: %.2f\n", retira(filaExecutada));
                break;
            case 3:
                if (vazia(filaExecutada)) {
                    printf("A fila está vazia.\n");
                } else {
                    printf("A fila não está vazia.\n");
                }
                break;
            case 4:
                if (cheia(filaExecutada)) {
                    printf("A fila está cheia.\n");
                } else {
                    printf("A fila não está cheia.\n");
                }
                break;
            case 5:
                printf("Elementos da fila:\n");
                int i = filaExecutada->ini;
                while (i != filaExecutada->fim) {
                    printf("%.2f ", filaExecutada->vet[i]);
                    i = proximoIndice(i);
                }
                printf("\n");
                break;
            case 6:
                printf("Saindo do programa.\n");
                break;
            default:
                printf("Opção inválida.\n");
        }
    } while (escolha != 6);

    libera(filaExecutada);

    return 0;
}
