package analisandoCandidatos;

import java.util.List;
import java.util.Random;

import candidatos.Banco;
import candidatos.Candidatos;

public class ProcessoSeletivo {

	public static Banco bancoDeCandidatos = new Banco();
	public static List<Candidatos> listaCandidatos;
	public static List<Candidatos> listaCandidatosSelecionados;

	public static void main(String[] args) {

		selecaoCandidato();
		System.out.println("-----------------Candidatos Selecionados--------------------\n");

		listaCandidatosSelecionados.forEach(c -> {
			bancoDeCandidatos.removerCandidato(c.getId());
			System.out.println("Nome: " + c.getNome() + "\nSalario Pretendido: " + c.getSalarioPretendido() + "\n");
		});

		System.out.println("------------------------------------------------------------");
        
		for(Candidatos candidatos: listaCandidatosSelecionados) {
			
			entrandoEmContato(candidatos);
			
		}
	   

	}

	static void selecaoCandidato() {
		listaCandidatosSelecionados = bancoDeCandidatos.getCandidatosSelecionados();
		listaCandidatos = bancoDeCandidatos.getCandidatos();

		for (Candidatos c : listaCandidatos) {
			if (analisarCandidato(c.getSalarioPretendido()).equals("LIGAR PARA O CANDIDATO")
					|| analisarCandidato(c.getSalarioPretendido())
							.equals("LIGAR PARA O CANDIDATO COM UMA CONTRA PROPOSTA")) {
				listaCandidatosSelecionados.add(c);

			}

			if (listaCandidatosSelecionados.size() == 5) {
				break;
			}
		}

	}
	
	
	static boolean atender() {
		return new Random().nextInt(3)==1;
	}
	
	static void entrandoEmContato(Candidatos candidatos) {
		int tentativasRealizadas = 1;
		boolean continuarTentando = true;
		boolean atendeu = false;
		
		do {
			
			
			if (atender()==true) {
				atendeu = true;
				
				System.out.println("O Candidato "+ candidatos.getNome() + " Atendeu na " + tentativasRealizadas + "º tentativa ");
				
				break;
				
			}else if(tentativasRealizadas == 3) {
				
				System.out.println("O Candidato " + candidatos.getNome() + " não atendeu após "+ tentativasRealizadas +" tentativa e foi desqualificado para a vaga");
				
				continuarTentando = false;
				
				break;
			}
			
			tentativasRealizadas++;
			
			
		} while (continuarTentando == true || atendeu == false);
		
	}



	static String analisarCandidato(double salarioPretendido) {
		double salarioBase = 2000.0;
		if (salarioBase > salarioPretendido) {
			return "LIGAR PARA O CANDIDATO";
		} else if (salarioBase == salarioPretendido) {
			return "LIGAR PARA O CANDIDATO COM UMA CONTRA PROPOSTA";
		} else {
			return "AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS";
		}
	}

}
