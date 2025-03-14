//Operador ternário
        //Sintaxe: condição ? valor_se_verdadeiro : valor_se_falso
        //resultado é uma variável do tipo String
        //nota é uma variável do tipo int
        //nota >=7 é a condição
        //? é o operador ternário
        //: é o separador entre o valor verdadeiro e o valor falso
        //&& é o operador lógico E
        //|| é o operador lógico OU
        //O operador ternário é uma forma mais enxuta de escrever um if-else
        //O operador ternário é uma expressão, ou seja, tem um valor de retorno

public class ResultadoEscolar3 {
    public static void main(String[] args) {
        int nota = 4;
        String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuparação" : "Reprovado";
        System.out.println(resultado);
    }
}