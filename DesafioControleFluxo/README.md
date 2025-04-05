
# Desafio Controle de Fluxo - Contador

O objetivo do desafio consiste em imprimir interações **For** entre duas **variáveis** inseridas como parâmetro pelo terminal, dada a condição em que o segundo parâmetro seja menor que o primeiro. Nesse contexto, uma **exceção** costumuzada foi implementada para o caso em que não ocorra a condição.
## Planejamento de Tarefas:

1. Criação do **Projeto DesafioControleFluxo**;
2. Criação de duas classes: **Contador** e **ParametrosInvalidosException** dentro do projeto;
3. Importação da biblioteca **java.util.Scanner** para uso da classe.
4. Constituição do método **Main** com uma variável que chama a classe **Scanner** para a entrada de dados (**Parâmetros**), contém o laço de repetição **While** e uma estrutura de exceção **try-catch** para tratamento da exceção;
5. Constituição do método **Contar** que através de uma estrutura condicional **if** irá empilhar os valores do laço **For** de uma variável **int** e imprimir no console **System.out.println()** caso os parâmetros estejam de acordo com a condicional senão irá imprimir uma **Exception**.
## Código Desenvolvido:

```java
import java.util.Scanner;
public class Contador {
    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Digite o primeiro parâmetro");
                int parametroUm = terminal.nextInt();
                System.out.println("\nDigite o segundo parâmetro");
                int parametroDois = terminal.nextInt();
                contar(parametroUm, parametroDois);
            break;

            }catch (ParametrosInvalidosException e) {
                System.out.println("\nO SEGUNDO PARÂMETRO DEVE SER MAIOR QUE O PRIMEIRO.\n");
            }
        }
        terminal.close();
    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }
        int contagem = parametroDois - parametroUm;
        
        System.out.println("\n---- Resultado da Contagem ----\n");
        
        for (int i = 0; i <= contagem; i++) {
            System.out.println(parametroUm + i);
            }
    }
}
```


## Resultados Alcançados

##### **CASO 1 - Condições Atendidas**

![Parâmetros_atendidos](https://github.com/user-attachments/assets/deda6b7f-4a46-4dcc-8476-42dc3d4fcfc8)

##### **CASO 2 - Condições Não Atendidas**

![Parâmetros_não_atendidos](https://github.com/user-attachments/assets/ab3917d3-d9ac-47a8-975a-6ccbe2e91bcf)

## Considerações

Ótimo desafio que proporcionou conhecimento atráves da prática. Foi possível experimentar algumas estruturas condicionais e de repetição que apresetaram erros e acertos. Apesar do código está próximo do que foi colocado como exemplo pude testar de formas diferentes e outras possíbilidades como por exemplo uso do **While**, **For**, **if** e **Try-Catch**.

Este desafio apresentado pelo professor [Gleyson Sampaio](https://github.com/glysns) da [DIO](https://dio.me), além de valoroso e prático, nos faz explorar ainda mais sobre o assunto.

Meus sinceros agradecimentos.
