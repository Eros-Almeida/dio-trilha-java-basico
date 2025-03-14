public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 1000.00;
        double valorSolitado = 500.00;

        if(valorSolitado < saldo)
            saldo = saldo - valorSolitado;
        

        System.out.println("Saldo atual: R$ " + saldo);
    }
}
