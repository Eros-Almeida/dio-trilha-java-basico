// Código que exemplifica o uso de exceções em Java

// Importa a classe NumberFormat do pacote java.text
// A classe NumberFormat é usada para converter números em strings e strings em números
import java.text.NumberFormat;

// Importa a classe ParseException do pacote java.text
// A classe ParseException é usada para representar exceções de conversão de string para número
import java.text.ParseException;

// Exemplo de exceção de conversão de string para número
// O método parse da classe NumberFormat lança uma exceção
// do tipo ParseException quando não consegue converter a string para número
// O método main tenta converter a string "a1.75" para número
// e captura a exceção lançada pelo método parse
// O método printStackTrace da exceção exibe a pilha de chamadas que levou ao erro

public class ExemploExcecao {
    public static void main(String[] args) {
        Number valor;
        try {

            // Tenta converter a string "a1.75" para número
            // Se a string for válida, o método parse converte a string para número
            // e o valor é armazenado na variável valor
            valor = NumberFormat.getInstance().parse("a1.75");
            System.out.println(valor);

            // Se a string for inválida, o método parse lança uma exceção do tipo ParseException e o código abaixo não é executado
            // Se a string for válida, o código abaixo é executado

        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
}
