#include <stdio.h>
#include <stdlib.h>
void multiplica(int numerador1, int denominador1, int numerador2, int denominador2) 
    {
    int resultadoNumerador = numerador1 * numerador2;
    int resultadoDenominador = denominador1 * denominador2;
    printf("Resultado da multiplicação: %d/%d\n", resultadoNumerador, resultadoDenominador);
    }
    
void divide(int numerador1, int denominador1, int numerador2, int denominador2) 
{
    int resultadoNum = numerador1 * denominador2;
    int resultadoDen = denominador1 * numerador2;
    printf("Resultado da divisão: %d/%d\n", resultadoNum, resultadoDen);
}

void tipoFracao(int numerador1, int denominador1)
{
    
    if(numerador1<denominador1)
    {
        printf("A fração é própria \n");

    }
    else
    {
        printf("A fração é imprópria \n");
    }
}

void inverte(int numerador1, int denominador1)
{
	int aux = numerador1;
	numerador1 = denominador1;
	denominador1 = aux;
	printf("A fração invertida é: %d/%d\n", numerador1, denominador1);
}

void adiciona(int numerador1, int denominador1, int numerador2, int denominador2)
{
	int resultadoDenominador = MMC(denominador1, denominador2);
	int resultadoNumerador = (resultadoDenominador/denominador1)*numerador1+(resultadoDenominador/denominador2)*numerador2;
	printf("Resultado da soma: %d/%d\n", resultadoNumerador, resultadoDenominador);
}

void subtrai(int numerador1, int denominador1, int numerador2, int denominador2)
{
	int resultadoDenominador = MMC(denominador1, denominador2);
	int resultadoNumerador = (resultadoDenominador/denominador1)*numerador1-(resultadoDenominador/denominador2)*numerador2;
	printf("Resultado da subtracao: %d/%d\n", resultadoNumerador, resultadoDenominador);
}

int MMC(int denominador1, int denominador2)
{
	if(denominador1 != denominador2 ) return denominador1 * denominador2;
	else return denominador1; 
}

void maior(int numerador1, int denominador1, int numerador2, int denominador2)
{
	int resultadoDenominador = MMC(denominador1, denominador2);
	int resultadoNumerador = (resultadoDenominador/denominador1)*numerador1-(resultadoDenominador/denominador2)*numerador2;
	printf("Resultado da subtracao: %d/%d\n", resultadoNumerador, resultadoDenominador);	
}

int main()
{
    int N1, D1, N2, D2;
    int escolha, choice;
    char opcao;
    
    do
    {
    printf("Informe o numerador da primeira fracao: \n");
    scanf("%d",&N1);
    printf("Informe o denominador da primeira fracao: \n");
    scanf("%d",&D1);
    while (D1 == 0)
	{
		printf("Denominador não pode ser zero. Informe novamente: ");
		scanf("%d", &D1);
     }
    printf("Informe o numerador da segunda fracao: \n");
    scanf("%d",&N2);
    printf("Informe o denominador da segunda fracao: \n");
    scanf("%d",&D2);
    while (D2 == 0)
    {
	printf("Denominador não pode ser zero. Informe novamente: ");
    scanf("%d", &D1);
    }
    
    printf("Escolha a operação:\n");
    printf("1. Multiplicação de fracoes.\n");
    printf("2. Divisão de fracoes.\n");
    printf("3. Multiplicação de fracao por um número inteiro.\n");
    printf("4. Determinar qual é o tipo da fração.\n");
    printf("5. Inverter a fração.\n");
    printf("6. Adicionar as duas fracoes.\n");
    printf("7. Subtrair as duas fracoes.\n");
    printf("8. Determine qual das duas fracoes é a maior.\n");
    printf("Digite o número da operação desejada: ");
    scanf("%d", &escolha);
    
    switch (escolha) 
    {
        case 1:
            multiplica(N1, D1, N2, D2);
            break;
        case 2:
            divide(N1,D1,N2,D2);
            break;
        case 3:
            multiplica(N1, D1, N2, D2);
            break;
        case 4:
			printf("Escolha qual fracao deseja determinar (1/2): ");
			scanf("%d", &choice);
			if (choice == 1) tipoFracao(N1, D1);
			else tipoFracao(N2, D2);
            break;
        case 5:
			printf("Escolha qual fracao deseja inverter (1/2): ");
			scanf("%d", &choice);
			if (choice == 1) inverte(N1, D1);
			else inverte(N2, D2);
        break;
        case 6:
			adiciona(N1, D1, N2, D2);
			break;
		case 7:
			subtrai(N1, D1, N2, D2);
			break;
		case 8:
			if ((float)N1/D1 > (float)N2/D2) printf("%d/%d é maior que %d/%d", N1, D1, N2, D2);
			else if((float)N1/D1 < (float)N2/D2) printf("%d/%d é maior que %d/%d", N2, D2, N1, D1);
			else printf("%d/%d  igual a %d/%d", N2, D2, N1, D1);
			break;
        default:
            printf("Opção inválida.\n");
            break;
    }
    
    printf("Deseja informar um novo par de frações? (S/N): ");
    scanf(" %c", &opcao);
}
    while (opcao == 'S' || opcao == 's');
    
return 0;
}