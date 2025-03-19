//Tratamento de exceção:
//exceção é um evento que ocorre durante a execução de um programa, que interrompe o fluxo normal de instruções.
//O tratamento de exceção é uma técnica usada para manipular exceções e permitir que o programa continue a ser executado.
//O tratamento de exceção em Java é feito através de cinco palavras-chave: try, catch, throw, throws e finally.
//A palavra-chave try é usada para definir um bloco de código no qual as exceções podem ocorrer.
//A palavra-chave catch é usada para capturar exceções que ocorrem dentro do bloco try.
//A palavra-chave throw é usada para lançar uma exceção.
//A palavra-chave throws é usada para declarar exceções que podem ser lançadas por um método.
//A palavra-chave finally é usada para definir um bloco de código que é executado após o bloco try-catch, independentemente de ocorrer uma exceção ou não.
//sintaxe:
//try {
//    // código que pode gerar uma exceção
//} catch (Exception e) {
//    // código que é executado se uma exceção ocorrer
//} finally {
//    // código que é executado após o bloco try-catch
//}

//Para esse exemplo consideramos que algumas exceções pode ocorrer durante a execução do prorama:
//  - Não informar o nome e o sobrenome;
//  - Não informar a idade ou informar um valor da idade ter um caractere Não numérico;
//  - O valor da altura ter uma vírgula ao invés de um ponto.

//Possíveis exceções:
//  - InputMismatchException: ocorre quando o tipo de dado fornecido pelo usuário não corresponde ao tipo de dado esperado.

// Outras exceções que podem ocorrer:
//  - ArithmeticException: ocorre quando ocorre uma divisão por zero.
//  - ArrayIndexOutOfBoundsException: ocorre quando um índice de matriz é maior que o tamanho da matriz.
//  - NullPointerException: ocorre quando um método é chamado em um objeto nulo.
//  - FileNotFoundException: ocorre quando um arquivo não é encontrado.
//  - IOException: ocorre quando ocorre um erro de entrada/saída.
//  - ClassNotFoundException: ocorre quando uma classe não é encontrada.
//  - SQLException: ocorre quando ocorre um erro de banco de dados.
//  - NumberFormatException: ocorre quando uma string não pode ser convertida em um número.
//  - OutOfMemoryError: ocorre quando a JVM fica sem memória.
//  - StackOverflowError: ocorre quando a pilha de chamadas de um programa é muito grande.

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) throws Exception {
        try {
        
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu Nome?");
            String nome = scanner.next();

            System.out.println("Digite seu Sobrenome?");
            String sobrenome = scanner.next();

            System.out.println("Digite sua Idade?");
            int idade = scanner.nextInt();

            System.out.println("Digite sua Altura?");
            double altura = scanner.nextDouble();

            System.out.println("Olá, meu nome é " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            //toUpperCase() é um método que converte todos os caracteres de uma string em maiúsculas.
            //toLowerCase() é um método que converte todos os caracteres de uma string em minúsculas.

            System.out.println("Tenho " + idade + " anos e ");
            System.out.println("minha altura é " + altura + " cm");

            scanner.close();
        } catch (InputMismatchException e) {
            System.out.println("Erro: Tipo de dado fornecido pelo usuário não corresponde ao tipo de dado esperado. \n" + "Por favor, nos campos Idade e Altura informar dados numéricos.");
        }
    }
    
}
