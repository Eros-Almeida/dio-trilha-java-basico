//Estrutura do controle de fluxo de repetição For em Java
//For é uma estrutura de repetição que permite executar um bloco de código várias vezes
//A estrutura do for é composta por 3 partes: inicialização, condição e incremento ou decremento
//A inicialização é executada apenas uma vez, no início do laço
//A condição é avaliada antes de cada execução do bloco de código
//O incremento ou decremento é executado após cada execução do bloco de código
//Sintaxe: for (inicialização; condição; incremento/decremento) { bloco de código }
//bloco de código é o código que será executado várias vezes
//inicialização é a parte onde declaramos e inicializamos a variável de controle
//condição é a parte onde declaramos a condição que será avaliada antes de cada execução do bloco de código
//incremento/decremento é a parte onde incrementamos ou decrementamos a variável de controle

public class ExemploFor {
    public static void main(String[] args) {
        for(int carneirinhos = 1; carneirinhos <= 20; carneirinhos++) {
            System.out.println("Carneirinhos " + carneirinhos);
        }

        System.out.println("Joãozinho dormiu!");
    }
}
