//inmport java.util.Scanner;
//Para inserir os parâmetros, utilizei o Scanner, que é uma classe do Java para ler entradas do usuário.
import java.util.Scanner;

    public class Contador {
        public static void main(String[] args) {
		    Scanner terminal = new Scanner(System.in);
		    
            //criei um loop infinito para garantir que o usuário insira os parâmetros corretos
            //e, caso contrário, o programa não irá parar até que os parâmetros sejam válidos.
            //O loop infinito é interrompido quando os parâmetros são válidos e a contagem é realizada.
            while (true) {
                try {
                    System.out.println("Digite o primeiro parâmetro");
		            int parametroUm = terminal.nextInt();
		            System.out.println("\nDigite o segundo parâmetro");
		            int parametroDois = terminal.nextInt();
			        //chamando o método contendo a lógica de contagem
                    contar(parametroUm, parametroDois);
		            break;
                }catch (ParametrosInvalidosException e) {
                    System.out.println("\nO SEGUNDO PARÂMETRO DEVE SER MAIOR QUE O PRIMEIRO.\n");
			        //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
		        }
	        }
        terminal.close();
        }
        // Para criar a exceção personalizada, criei uma classe chamada ParametrosInvalidosException que estende a classe Exception.
        // Essa classe é responsável por representar a exceção que será lançada quando os parâmetros forem inválidos.
	    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
            if (parametroUm > parametroDois) {
                throw new ParametrosInvalidosException();
                
            }
		    int contagem = parametroDois - parametroUm;

            System.out.println("\n---- Resultado da Contagem ----\n");

		//realizar o for para imprimir os números com base na variável contagem
            for (int i = 0; i <= contagem; i++) {
                System.out.println(parametroUm + i);
            }
	    }
}
