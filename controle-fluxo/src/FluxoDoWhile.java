// Código que exemplifica o uso do laço de repetição do-while em Java.
// O laço do-while é uma estrutura de repetição que executa um bloco de código
// enquanto uma condição for verdadeira. A diferença entre o laço while e do-while
// é que o laço do-while executa o bloco de código pelo menos uma vez, pois a condição
// é verificada após a execução do bloco de código.
// Sintaxe:
// do {
//     // bloco de código
// } while (condição expressão booleana para validar a execução do bloco de código);
// O bloco de código é executado pelo menos uma vez, e a condição é verificada após a execução
// se for inválida, o bloco de código não é executado novamente.

// Importação da classe Random para gerar números aleatórios
import java.util.Random;

public class FluxoDoWhile {
    public static void main(String[] args) {
        System.out.println("Discando...");
        
        // executa o bloco de código pelo menos uma vez
        do {
            System.out.println("Telefone tocando...");

            // verifica se a chamada foi atendida
            // se não foi atendida, executa novamente
        } while (tocando());

            System.out.println("Alo !!!");
        
        }
        // método que simula a chamada telefônica
    private static boolean tocando() {
        boolean atendido = new Random().nextInt(3) == 1;
        System.out.println("Atendeu? " + atendido);

        // retorna verdadeiro se não foi atendido
        // e falso se foi atendido
        //! é o operador de negação
        return ! atendido;
    }
}
