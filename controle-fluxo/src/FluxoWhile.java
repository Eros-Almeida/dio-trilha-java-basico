//estrutura do controle de fluxo while
//while é uma estrutura de repetição que executa um bloco de código enquanto a condição for verdadeira
//a condição é avaliada antes de cada execução do bloco de código
//se a condição for falsa, o bloco de código não é executado
//a condição é obrigatória e deve ser um booleano
//sintaxe:
//while (condição) {bloco de código}

import java.util.concurrent.ThreadLocalRandom;

public class FluxoWhile {
    public static void main(String[] args) {
        double mesada = 50;
        while (mesada > 0) {
            double valorDoce = valorAleatorio();

            //se o valor do doce for maior que a mesada, o valor do doce é igual a mesada
            //isso evita que o valor do doce seja maior que a mesada
            if (valorDoce > mesada)
                valorDoce = mesada;
            
            System.out.println("Valor do Doce: R$ " + valorDoce + " Adiocionado no carrinho");
            mesada = mesada - valorDoce;
            
        }
        System.out.println("Mesada: " + mesada);
        System.err.println("Marcelinho gastou toda a mesada em doces");
    }


    //método que retorna um valor aleatório entre 2 e 8
    //ThreadLocalRandom.current().nextDouble(2, 8) retorna um valor entre 2 e 8
    //ThreadLocalRandom.current() retorna um gerador de números aleatórios

    public static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
