//Operador ternário
        //Sintaxe: condição ? valor_se_verdadeiro : valor_se_falso
        //? é o operador ternário
        //: é o separador entre o valor verdadeiro e o valor falso
        //O operador ternário é uma forma mais enxuta de escrever um if-else
        //O operador ternário é uma expressão, ou seja, tem um valor de retorno
        //Se o valor solicitado for menor que o saldo, o resultado é "Saldo atual: R$ " + (saldo - valorSolicitado), senão, é "Saldo insuficiente"
        //Se o valor solicitado for menor que o saldo, o saldo é atualizado para saldo - valorSolicitado

public class CaixaEletronico3 {
    public static void main(String[] args) {
        double saldo = 1000.00;
        double valorSolitado = 500.00;

        String SaldoAtual = valorSolitado < saldo ? "Saldo atual: R$ " + (saldo - valorSolitado) : "Saldo insuficiente";
        System.out.println(SaldoAtual);
    }
}
