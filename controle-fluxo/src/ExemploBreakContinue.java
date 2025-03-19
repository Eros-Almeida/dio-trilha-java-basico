//break: interrompe a execução do laço de repetição
//continue: interrompe a execução da iteração atual e passa para a próxima iteração
//sintaxe: break; continue;
//o break e o continue são usados dentro de laços de repetição (for, while, do-while)
//o break e o continue são usados para controlar o fluxo de execução de um laço de repetição

public class ExemploBreakContinue {
    public static void main(String[] args) {
        for (int numero = 1; numero <= 5; numero++){
            if (numero == 3)
                continue;
                
            System.out.println("Número: " + numero);
        }
    }
}
