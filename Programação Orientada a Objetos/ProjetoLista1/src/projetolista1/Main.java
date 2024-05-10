package projetolista1;

import Classes.SubclasseEstudante;
import Classes.SubclasseTrabalhador;
import Classes.SubclasseGraduado;
import java.util.Random;

/**
 *
 * author Alek
 */
public class Main {

    public static void main(String[] args) {
        Random random = new Random();

        SubclasseEstudante estudante = new SubclasseEstudante(
                "João Silva",
                "Rua das Flores, 123",
                "joao.silva@example.com",
                "999999999",
                random.nextInt(1000000),
                "Engenharia",
                "Campus Central"
        );

        SubclasseTrabalhador trabalhador = new SubclasseTrabalhador(
                "Maria Santos",
                "Avenida Principal, 456",
                "maria.santos@example.com",
                "888888888",
                "Analista de Sistemas",
                "TI",
                3500.00
        );

        SubclasseGraduado graduado = new SubclasseGraduado(
                "Pedro Oliveira",
                "Rua dos Sonhos, 789",
                "pedro.oliveira@example.com",
                "777777777",
                random.nextInt(1000000),
                "Medicina",
                "Campus Norte",
                2022,
                2023,
                "123456"
        );

        System.out.println("Estudante:");
        System.out.println(estudante.toString());
        System.out.println("\nTrabalhador:");
        System.out.println(trabalhador.toString());
        System.out.println("\nGraduado:");
        System.out.println(graduado.toString());
    }
}
