package candidatura;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
public class ProcessoSeletivo {
	
	//variável global:
	static List<String> selecionados = new ArrayList<>();
	
	public static void main(String[] args) {
		//chama os métodos da aplicação.
		selecaoCandidatos();
		listaSelecionados();
		entrarEmContatoComSelecionados();
	}
	//método de selecão de candidatos:
	static void selecaoCandidatos() {
		String[] candidatos = {"FELIPE","JULIA","PAULO","AUGUSTO","MONICA","FABRICIO","MIRELA","DANIELA","JORGE","FERNANDO"};
		
		int candidatosSelecionados = 0;
		int candidatoAtual = 0;
		double salarioBase = 2000.0;
		while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
			String candidato = candidatos[candidatoAtual];
			double salarioPretendido = valorPretendido();
			System.out.println("O candidato " + candidato + " solicitou o valor R$ " + String.format("%.2f", salarioPretendido) + " de salário.");
			
			//chamando o método de análise do candidato:
			analisarCandidato(candidato, salarioPretendido);
		
			if(salarioBase >= salarioPretendido) {
				System.out.println("O candidato " + candidato + " foi selecionado para a vaga.\n");
				selecionados.add(candidato);
				candidatosSelecionados++;
			}
			candidatoAtual++;
		}
			
	}
	//método de geração de lista de selecionados pelo índice e nome:
	static void listaSelecionados() {
		System.out.println("\n LISTA DE SELECIONADOS APROVADOS \n");
		//For padrão:
		//for(int indice = 0; indice < selecionados.size(); indice++) {
			//System.out.println((indice + 1) + ". " + selecionados.get(indice));
		
		//For-each:
		int indice = 1;
		for(String candidato : selecionados) {
			System.out.println(indice + ". " + candidato);
			indice++;
		}
	}
	
	//método randômico para gerar os valores pretendidos de salário
	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800,2200);
	}
	//método randômico para gerar as tentativas de contato
	static boolean ligarParaCandidato() {
		return ThreadLocalRandom.current().nextBoolean();
	}
	
	//método de análise para ligar para o aprovado.
	static void analisarCandidato(String candidato, double salarioPretendido) {
		double salarioBase = 2000.00;
		System.out.println("\nAnalisando Candidato: " + candidato);
		System.out.println("Salário pretendido: R$ " + String.format("%.2f", salarioPretendido));
		
		if(salarioBase > salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO " + candidato);
		}else if(salarioBase == salarioPretendido)
			System.out.println("LIGAR PARA O CANDIDATO " + candidato + " COM CONTRAPROPOSTA");
		else {
			System.out.println("AGUARDANDO RESULTADOS DOS DEMAIS CANDIDATOS\n");
		}
	}
	//método que seleciona o candidato para entrar em contato
	static void entrarEmContatoComSelecionados(){
		for (String candidato : selecionados){
			System.out.println("\n Ligando para " + candidato + "...");
			entrarEmContato(candidato);
		}		
	}
	//método que apresentar as tentativas realizadas.
	static void entrarEmContato(String candidato) {
		int tentativas = 0;
		boolean atendeu;
		
		do {
			atendeu = ligarParaCandidato();
			tentativas++;
			
			if(atendeu) {
				System.out.println(candidato + " atendeu na tentativa " + tentativas + "!");
			}else {
				System.out.println("Tentativa " + tentativas + " para " + candidato + " sem sucesso.");
			}
		}while (!atendeu && tentativas < 3);
		
		if(!atendeu) {
			System.out.println(candidato + " não atendeu após 3 tentativas. Tentar mais tarde.");
		}
	}
}