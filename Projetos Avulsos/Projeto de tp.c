#include <stdio.h>
#include <stdlib.h>
/////////////////////////////////       intersecção        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
void intersec(int *vet1, int *vet2, int tamanho1, int tamanho2)
{
    printf("\n");
    printf("Os números da intersecção do vetor (1) e (2) são;\n");
    for (int loop1 = 0; loop1 < tamanho1; loop1++)
    {
        for (int loop2 = 0; loop2 < tamanho2; loop2++)
        {
            if (*(vet1 + loop1) == *(vet2 + loop2))
            {
                printf("%d ", *(vet1 + loop1));
            }
        }
    }
    printf("\n");
    printf("\n");
}
/////////////////////////////////          União          ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
int existe(int vetoruniao[], int tamanhouniao, int vetor2)
{
    for (int loop1 = 0; loop1 < tamanhouniao; loop1++)
    {
        if (vetoruniao[loop1] == vetor2)
        {
            return 1;
        }
    }
    return 0;
}
void removeDuplicados(int *vet, int *tamanho) 
{
    int i, j, k;
    for (i = 0; i < *tamanho; i++) {
        for (j = i + 1; j < *tamanho;) {
            if (vet[j] == vet[i]) {
                for (k = j; k < *tamanho; k++) {
                    vet[k] = vet[k + 1];
                }
                (*tamanho)--;
            } else {
                j++;
            }
        }
    }
}
void uniao(int *vet1, int *vet2, int tamanho1, int tamanho2) 
{
    printf("\n");
    printf("Os números da união do vetor (1) e (2) são;\n");
    removeDuplicados(vet1, &tamanho1);
    removeDuplicados(vet2, &tamanho2);

    int vetormaster[tamanho1+tamanho2];
    int contador = 0;

    for (int loop1 = 0; loop1 < tamanho1; loop1++) {
        vetormaster[contador++] = *(vet1 + loop1);
    }

    for (int loop2 = 0; loop2 < (tamanho2); loop2++) {
        if (existe(vetormaster, contador, *(vet2 + loop2)) == 0) {
            vetormaster[contador++] = *(vet2 + loop2);
        }
    }
    for (int loop2 = 0; loop2 < contador; loop2++) {
        printf("%d ", vetormaster[loop2]);
    }
    printf("\n");
    printf("\n");
}
/////////////////////////////////       concatenação      /////////////////////////////////////////////////////////////////
void concatenacao(int *vet1, int *vet2, int tamanho1, int tamanho2)
{
    printf("\n");
    printf("Os números da concatenação do vetor (1) e (2) são;\n");
    int loop1, loop2;
    for (loop1 = 0; loop1 < tamanho1; loop1++)
    {
        if (loop1 != 0)
        {
            printf(", ");
        }
        
        printf("%d",*(vet1 + loop1));
    }

    for (loop2 = 0; loop2 < tamanho2; loop2++)
    {      
        if (loop1 != 0 || loop2 != 0)
        {
            printf(", ");
        }
        
        printf("%d",*(vet2 + loop2));
    }
    printf(".");
    printf("\n");
    printf("\n");
}
////////////////////////////////         diferença        ////////////////////////////////////////////////////////////
int existeponteiro(int *vet1, int tamanho1, int elemento)
{
    for (int loop1 = 0; loop1 < tamanho1; loop1++)
    {
        if(*(vet1 + loop1) == elemento)
        {
            return 1;
        }
    }
    return 0;
}
void diferenca(int *vet1, int *vet2, int tamanho1, int tamanho2)
{
    printf("\n");
    printf("Os números da subtração do vetor (1) e (2) são;\n");
    for (int loop1 = 0; loop1 < tamanho1; loop1++)
    {
        if (existeponteiro(vet2, tamanho2, *(vet1 + loop1)) == 0)
        {
            printf("%d ", *(vet1 + loop1));
        }
    }
    printf("\n");
    printf("\n");
    
    printf("Os números da subtração do vetor (2) e (1) são:\n");
    for (int loop2 = 0; loop2 < tamanho2; loop2++)
    {
        if (existeponteiro(vet1, tamanho1, *(vet2 + loop2)) == 0)
        {
            printf("%d ", *(vet2 + loop2));
        }
    }
    printf("\n");
    printf("\n");
}
////////////////////////////////        localização       ////////////////////////////////////////////////////////////
int existeloc(int *vet1, int tamanho1, int elemento)
{
    for (int loop1 = 0; loop1 < tamanho1; loop1++)
    {
        if(*(vet1 + loop1) == elemento)
        {
            return 1;
        }
    }
    return 0;
}
void localizacao(int *vet1, int *vet2, int tamanho1, int tamanho2, int elemento)
{
    int contador = 1;
    int achou = 0;
    if (existeloc(vet1, tamanho1, elemento) == 1)
    {
        for (int loop1 = 0; loop1 < tamanho1; loop1++)
        {
            if (*(vet1 + loop1) == elemento)
            {
                printf("O número que procura está na posição: (%d) do vetor 1\n", contador);
                achou = 1;
            }
            contador++;
        }
    }
    if (achou == 0)
        {
            printf("-1\n");
        } 
    printf("\n");

    int contador1 = 1;
    int achou1 = 0;

    if (existeloc(vet2, tamanho2, elemento) == 1)
    {
        for (int loop2 = 0; loop2 < tamanho2; loop2++)
        {
            if (*(vet2 + loop2) == elemento)
            {
                printf("O número que procura está na posição: (%d) do vetor 2\n", contador1);
                achou1 = 1;
            }
            contador1++;
        }
    }
    if (achou1 == 0)
        {
            printf("-1\n");
        } 
    printf("\n");
}
////////////////////////////////    ordenação crescente   ////////////////////////////////////////////////////////////
void crescente(int *vet1, int tamanho1)
{
    int aux, vetorord[tamanho1];
    for (int loop1 = 0; loop1 < tamanho1; loop1++)
    {
        vetorord[loop1] = *(vet1 + loop1);
    }

    for (int loop2 = 0; loop2 < tamanho1; loop2++)
    {
        for (int loop3 = loop2 + 1; loop3 < tamanho1; loop3++)
        {
            if (vetorord[loop2] > vetorord[loop3])
            {
                aux = vetorord[loop2];
                vetorord[loop2] = vetorord[loop3];
                vetorord[loop3] = aux;    
            }
        }  
    }

    for (int loop4 = 0; loop4 < tamanho1; loop4++)
    {
        printf("%d ", vetorord[loop4]);
    }
}
////////////////////////////////    intercalar ordenado   ////////////////////////////////////////////////////////////
void intercalar(int *vet1, int *vet2, int tamanho1, int tamanho2)
{
    printf("\n");
    printf("Os vetores intercalados em ordem crescente;\n");
    int vetfull[tamanho1 + tamanho2];
    for (int loop1 = 0; loop1 < tamanho1; loop1++)
    {
        vetfull[loop1] = *(vet1 + loop1);
    }
    for (int loop2 = 0; loop2 < (tamanho2); loop2++)
    {
        vetfull[loop2 + tamanho1] = *(vet2 + loop2);
    }
    crescente(vetfull, tamanho1 + tamanho2);
    printf("\n");
    printf("\n");
}
////////////////////////////////       produto escalar    ////////////////////////////////////////////////////////////
void prodescalar(int *vet1, int *vet2, int tamanho1, int tamanho2)
{
    printf("\n");
    printf("O produto escalar dos vetores é:\n");
    int soma = 0, maior, qual = 0;
    if (tamanho1 > tamanho2)
    {
        maior = tamanho2;
        qual = 1;
    }
    if (tamanho2 > tamanho1)
    {
        maior = tamanho1;
        qual = 2;
    }
    else
    {
        maior = tamanho1;
        qual = 0;
    }
    
    for (int loop1 = 0; loop1 < maior; loop1++)
    {
        soma = soma + (*(vet1 + loop1) * *(vet2 + loop1));
    }

    if (qual == 1)
    {
        for (int loop2 = maior; loop2 < tamanho1; loop2++)
        {
            soma = soma + *(vet1 + loop2);
        }
    }
    
    if (qual == 2)
    {
        for (int loop3 = maior; loop3 < tamanho2; loop3++)
        {
            soma = soma + *(vet2 + loop3);
        }
    }
    printf("%d", soma);
    printf("\n");
    printf("\n");
}
////////////////////////////////  multiplicar por escalar ////////////////////////////////////////////////////////////
void multiescalar(int *vet1, int tamanho1, int qualvetor)
{
    int vetorescalar[tamanho1], numeromultiplicador;
    printf("\n");
    printf("Digite o número pelo qual você quer multiplicar o vetor (%d);\n", qualvetor);
    printf("\n");
    scanf("%d", &numeromultiplicador);
    for (int loop1 = 0; loop1 < tamanho1; loop1++)
    {
        vetorescalar[loop1] = (*(vet1 + loop1) * numeromultiplicador);
    }
    printf("O vetor multiplicado é:\n");
    for (int loop2 = 0; loop2 < tamanho1; loop2++)
    {
        printf("%d ", vetorescalar[loop2]);
    }
    
    printf("\n");
    printf("\n");
}
////////////////////////////////          int main        //////////////////////////////////////////////////////////// 
int main()
{
    int *vet2, *vet1, tamanho1, tamanho2;
    int aux, *vettemp1, *vettemp2;

    for(int verif = 0; verif != 1;)
    {
        printf("Digite o tamanho do vetor (1):\n");
        scanf("%d", &tamanho1);
        if(tamanho1 > 30 || tamanho1 < 0)
        {
            printf("Tamanho de vetor inválido, digite um número menor que 30 \n");
        }
        else
        {
            verif = 1;
        }
    }
    for(int verif2 = 0; verif2 !=1;)
    {
        printf("Digite o tamanho do vetor (2):\n");
        scanf("%d", &tamanho2);
        if(tamanho2 > 30 || tamanho2 < 0)
        {
            printf("Tamanho de vetor inválido, digite um número menor que 30 \n");
        }
        else
        {
            verif2 = 1;
        }
    }
    vet1 = malloc(tamanho1 * sizeof(int));
    vet2 = malloc(tamanho2 * sizeof(int));
    float numFloat, numFloat1;

    for (int loop1 = 0; loop1 < tamanho1; loop1++)
    {
        printf("Digite o valor do vetor 1 na posição (%d)\n", loop1 + 1);
        while(scanf("%f", &numFloat) != 1 || numFloat != (int)numFloat) 
        {
            while(getchar() != '\n');
            printf("Erro: entrada inválida. Por favor, digite um número inteiro.\n");
        }
    }
    
    for (int loop2 = 0; loop2 < tamanho2; loop2++)
    {
        printf("Digite o valor do vetor 1 na posição (%d)\n", loop2 + 1);
        while(scanf("%f", &numFloat1) != 1 || numFloat1 != (int)numFloat1) 
        {
            while(getchar() != '\n');
            printf("Erro: entrada inválida. Por favor, digite um número inteiro.\n");
        }
    }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    int ativo = 0, escolha, elemento;
    while (ativo != 1)
    {
        ///////////////////         limpar console           ////////////////////
        printf("Qual operação deseja realizar?\n");
        printf("0-Sair.\n");
        printf("1-Calcular a intersecção dos vetores.\n");
        printf("2-Calcular a união dos vetores.\n");
        printf("3-Calcular a concatenação dos vetores.\n");
        printf("4-Calcular a subtração dos vetores.\n");
        printf("5-Achar um elemento em meio aos vetores.\n");
        printf("6-Calcular a multiplicação escalar dos vetores.\n");
        printf("7-Calcular o produto escalar dos vetores.\n");
        printf("8-Ordenar os vetores em ordem crescente.\n");
        printf("9-Intercalar os vetores em ordem crescente.\n");
        printf("10-Troque os valores do vetor 1 pelo 2, e do 2 pelo 1.\n");
        scanf("%d",&escolha);
        ///////////////////         limpar console            /////////////////////
        switch (escolha)
        {
        case 0:
            ativo = 1;
            break;

        case 1:
            intersec(vet1, vet2, tamanho1, tamanho2);
            break;
        
        case 2:
            uniao(vet1, vet2, tamanho1, tamanho2);
            break;
        
        case 3:
            concatenacao(vet1, vet2, tamanho1, tamanho2);
            break;

        case 4:
            diferenca(vet1, vet2, tamanho1, tamanho2);
            break;

        case 5:
            printf("Escreve o número que você quer procurar; \n");
            scanf("%d", &elemento);          
            localizacao(vet1, vet2, tamanho1, tamanho2, elemento);
            break;

        case 6:
            multiescalar(vet1, tamanho1, 1);
            multiescalar(vet2, tamanho2, 2);
            break;

        case 7:
            prodescalar(vet1, vet2, tamanho1, tamanho2);
            break;

        case 8:
            printf("\n");
            printf("O vetor (1) em ordem crescente é;\n");
            crescente(vet2, tamanho2);
            printf("\n");
            printf("O vetor (2) em ordem crescente é;\n");
            crescente(vet1, tamanho1);
            printf("\n");
            printf("\n");
            break;

        case 9:
            intercalar(vet1, vet2, tamanho1, tamanho2);
            break;

        case 10:
        vettemp1 = (int*) malloc(tamanho1 * sizeof(int));
        vettemp2 = (int*) malloc(tamanho2 * sizeof(int));

        for (int loop1 = 0; loop1 < tamanho1; loop1++)
        {
            vettemp1[loop1] = *(vet1 + loop1);
        }
        for (int loop2 = 0; loop2 < tamanho2; loop2++)
        {
            vettemp2[loop2] = *(vet2 + loop2);
        }

        int* temp = realloc(vet1, tamanho2 * sizeof(int));
        if (temp != NULL) {
            vet1 = temp;
        } else {
            printf("erro");
        }

        temp = realloc(vet2, tamanho1 * sizeof(int));
        if (temp != NULL) {
            vet2 = temp;
        } else {
            printf("erro");
        }

        aux = tamanho1;
        tamanho1 = tamanho2;
        tamanho2 = aux;

        for (int loop3 = 0; loop3 < tamanho1; loop3++)
        {
            if (loop3 < tamanho2) {
                *(vet1 + loop3) = vettemp2[loop3];
            } else {
                *(vet1 + loop3) = 0; // or any default value
            }
        }
        for (int loop4 = 0; loop4 < tamanho2; loop4++)
        {
            if (loop4 < tamanho1) {
                *(vet2 + loop4) = vettemp1[loop4];
            } else {
                *(vet2 + loop4) = 0; // or any default value
            }
        }

        free(vettemp1);
        free(vettemp2);
        break;

        default:
            printf("Escreva uma opção válida.\n");
        }
    }
}