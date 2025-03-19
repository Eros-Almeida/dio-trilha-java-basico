public class ExemploFormatadorCep {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("2153017");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("CEP inválido.\nO CEP deve conter 8 dígitos de acordo com a Regra de Negócios.");
        }

    }    
    
    //metodo que formata um cep
    static String formatarCep(String cep) throws CepInvalidoException{
        if (cep.length() != 8)
            throw new CepInvalidoException();

            return "23.789-123";
        
    }
}
