//foreach é uma forma simplificada de percorrer um array ou uma coleção de elementos
//foreach é uma estrutura de repetição que permite acessar cada elemento de um array ou de uma coleção de elementos
//foreach é uma estrutura de repetição que permite executar um bloco de código para cada elemento de um array ou de uma coleção de elementos
//sintaxe: for (tipo nome : array) { bloco de código }
//tipo é o tipo dos elementos do array
//nome é o nome do array
//array é a descrição do nome array

public class ExemploForeach {
    public static void main(String[] args) {
        String alunos[] = {"THIAGO", "SALETE", "DIONISOS", "ESTER", "LUCIO", "ELAINE"};

        for(String aluno : alunos) {
            System.out.println("O Aluno é " + aluno);
        }
    }
}
