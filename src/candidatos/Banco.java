package candidatos;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private static List<Candidatos> candidatos = new ArrayList<Candidatos>();
	private static List<Candidatos> candidatosSelecionados = new ArrayList<Candidatos>();
	
	public static void addCandidato(Candidatos candidato) {
		Banco.candidatos.add(candidato);
	}
	
	
	public static void addCandidatoSelecionado(Candidatos candidato) {
		Banco.candidatosSelecionados.add(candidato);
	}
	
	
	
	public void removerCandidato(Integer id) {
		Banco.candidatos.removeIf(e -> (e.getId() == id));

	}
	
	
	public List<Candidatos> getCandidatos(){
		return candidatos;
	}
	
	public List<Candidatos> getCandidatosSelecionados(){
		return candidatosSelecionados;
	}
	
	
	
	static {
		
		Candidatos candidato1 = new Candidatos("Lucas",2000.0);
		addCandidato(candidato1);
		
		Candidatos candidato2 = new Candidatos("Julia",1900.0);
		addCandidato(candidato2);
		
		Candidatos candidato3 = new Candidatos("Roger",2200.0);
		addCandidato(candidato3);
		
		Candidatos candidato4 = new Candidatos("João",1800.0);
		addCandidato(candidato4);
		
		Candidatos candidato5 = new Candidatos("Douglas",2400.0);
		addCandidato(candidato5);
		
		Candidatos candidato6 = new Candidatos("Giovana",3000.0);
		addCandidato(candidato6);
		
		Candidatos candidato7 = new Candidatos("Guilherme",2000.0);
		addCandidato(candidato7);
		
		Candidatos candidato8 = new Candidatos("Caique",1900.0);
		addCandidato(candidato8);
		
		Candidatos candidato9 = new Candidatos("Maria",1950.0);
		addCandidato(candidato9);
		
		Candidatos candidato10 = new Candidatos("Felipe",1750.0);
		addCandidato(candidato10);
		
	}

}
