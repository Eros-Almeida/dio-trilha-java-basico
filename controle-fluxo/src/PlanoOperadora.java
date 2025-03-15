// \n é um caractere de escape que pula uma linha
// usando \n em uma string, você pode pular linhas
// \t é um caractere de escape que dá um tab
// \s é um caractere de escape que dá um espaço
// \b é um caractere de escape que dá um backspace
// \r é um caractere de escape que dá um carriage return
// \f é um caractere de escape que dá um form feed
// \z é um caractere de escape que dá um null
// /u é um caractere de escape que dá um unicode
// \x é um caractere de escape que dá um hexadecimal
// \0 é um caractere de escape que dá um octal
// \ddd é um caractere de escape que dá um octal
// \c é um caractere de escape que dá um control
// \l é um caractere de escape que dá um lowercase


public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "A";

        switch (plano) {
            case "T": {
                System.out.println("5GB de YouTube\n");
            }             
            case "M": {
                System.out.println("WhatsApp e Instagram grátis\n");
            }
            case "P": {
                System.out.println("100 minutos de ligação\n");
            }break;

            default: {
                System.out.println("Escolha os Planos Cadastrados: \n Avançado (T)\n Médio (M)\n Básico (P)\n");
            }
        }
    }
}
