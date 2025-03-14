public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 1000.0;
        double valorSolitado = 500.0;

        if(valorSolitado < saldo)
            saldo = saldo - valorSolitado;
        

        System.err.println("Saldo: " + saldo);
    }
}
