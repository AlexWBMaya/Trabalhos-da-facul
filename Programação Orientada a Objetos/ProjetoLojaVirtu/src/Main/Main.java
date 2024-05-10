package Main;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
import Classes.ClasseCD;
import Classes.ClasseLivro;
import Classes.ClasseNotebook;
import Classes.ClasseTV;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();

        // Criando uma instância aleatória de Livro
        ClasseLivro livro = new ClasseLivro(
                random.nextInt(1000), // Código
                "Livro " + random.nextInt(100), // Descrição
                random.nextFloat() * 100, // Preço
                "Titulo " + random.nextInt(100), // Título
                "Autor " + random.nextInt(100), // Autor
                "Tradutor " + random.nextInt(100), // Tradutor
                "Editora " + random.nextInt(100), // Editora
                random.nextInt(50) + 1970 // Ano de publicação entre 1970 e 2019
        );

        // Criando uma instância aleatória de CD
        ClasseCD cd = new ClasseCD(
                random.nextInt(1000), // Código
                "CD " + random.nextInt(100), // Descrição
                random.nextFloat() * 100, // Preço
                "Album " + random.nextInt(100), // Nome do album
                "Banda " + random.nextInt(100), // Banda
                "Cantor " + random.nextInt(100), // Cantor
                "Gênero " + random.nextInt(100) // Gênero musical
        );

        // Criando uma instância aleatória de Notebook
        ClasseNotebook notebook = new ClasseNotebook(
                random.nextInt(1000), // Código
                "Notebook " + random.nextInt(100), // Descrição
                random.nextFloat() * 1000, // Preço
                "Marca " + random.nextInt(100), // Marca
                "Modelo " + random.nextInt(100), // Modelo
                random.nextInt(16) + "GB", // Memória RAM
                random.nextInt(1000) + "GB SSD", // Capacidade do HD/SSD
                "Processador " + random.nextInt(100), // Processador
                random.nextDouble() * 10 + 10, // Tamanho da tela entre 10 e 20 polegadas
                "Sistema Operacional " + random.nextInt(100) // Sistema Operacional
        );

        // Criando uma instância aleatória de TV
        ClasseTV tv = new ClasseTV(
                random.nextInt(1000), // Código
                "TV " + random.nextInt(100), // Descrição
                random.nextFloat() * 2000, // Preço
                "Modelo " + random.nextInt(100), // Modelo
                "Marca " + random.nextInt(100), // Marca
                "Sistema Operacional " + random.nextInt(100), // Sistema Operacional
                random.nextDouble() * 50 + 20 // Tamanho da tela entre 20 e 70 polegadas
        );

        // Imprimindo as informações dos produtos
        System.out.println("Informações do Livro:");
        System.out.println(livro.toString());

        System.out.println("\nInformações do CD:");
        System.out.println(cd.toString());

        System.out.println("\nInformações do Notebook:");
        System.out.println(notebook.toString());

        System.out.println("\nInformações da TV:");
        System.out.println(tv.toString());
    }
}
