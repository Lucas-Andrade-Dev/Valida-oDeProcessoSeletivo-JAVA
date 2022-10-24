package candidatos;

import java.util.Set;

public class Candidatos {
   
	private int id;
	private String nome;
	private double salarioPretendido;
	private static Integer num=0;

	public Candidatos() {

	}

	public Candidatos(String nome, double salarioPretendido) {
        num += 1;
		this.id = num;
        this.nome = nome;
        this.salarioPretendido = salarioPretendido;
		
	}

	public String getNome() {
		return nome;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalarioPretendido() {
		return salarioPretendido;
	}

	public void setSalarioPretendido(double salarioPretendido) {
		this.salarioPretendido = salarioPretendido;
	}

}
