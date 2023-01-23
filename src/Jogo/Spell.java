package Jogo;

public class Spell {

	//Atributos
	private String nome;
	private int dano;
	
	//Construtor
	public Spell(String n, int d) {
		this.setNome(n);
		this.setDano(d);
	}
	
	//Métodos Especiais
	public int getDano() {
		return dano;
	}

	public void setDano(int dano) {
		this.dano = dano;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
