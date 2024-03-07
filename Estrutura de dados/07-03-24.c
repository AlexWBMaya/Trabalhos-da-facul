#include <stdio.h>
#include <stdlib.h>

void trocar (int *px, int *py)
{
    int aux = *px;*px = *py;*py = aux; 
}
        
int main()
{
    int x, y;
    printf("\nValor para x? ");
    scanf("%d",&x);
    printf("\nValor para y? ");
    scanf("%d",&y);
    // mostrando os conteudos de x e y
    printf("\nX = %d e Y = %d\n", x, y);
    printf("\nTrocando...\n");
    trocar (&x, &y);
    printf("\nX = %d e Y = %d\n", x, y);
}