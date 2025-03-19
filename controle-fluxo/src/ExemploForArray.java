//array é um tipo de variável que armazena uma coleção de elementos de um mesmo tipo
//array é uma estrutura de dados que armazena uma coleção de elementos de um mesmo tipo
//sintaxe array: tipo[] nome = new tipo[tamanho];
//tipo é o tipo dos elementos do array
//nome é o nome do array
//tamanho é a quantidade de elementos do array
//índice é a posição de um elemento no array
//índice é um número inteiro que representa a posição de um elemento no array
//índice começa em 0
//índice termina em tamanho - 1
//índice é usado para acessar um elemento do array
//for com array é uma estrutura de repetição que permite executar um bloco de código várias vezes
//for com array é uma estrutura de repetição que permite acessar cada elemento do array
//sintaxe: for (int x = 0; x < array.length; x++) { bloco de código }
//array.length é a quantidade de elementos do array
//array.length é uma propriedade que retorna a quantidade de elementos do array
//length é o tamanho do array
//x é a variável de controle
//x é uma variável inteira que representa a posição de um elemento no array
//x começa em 0
//x termina em array.length - 1

public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = {"THIAGO", "SALETE", "DIONISOS", "ESTER", "LUCIO", "ELAINE"};

        for(int x = 0; x < alunos.length; x++) {
            System.out.println("O Aluno no indice x = " + x + " é " + alunos[x]);
        }
    }
}