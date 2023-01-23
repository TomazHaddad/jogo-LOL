package Jogo;

public class Campeão {

	//Atributos
	private String nome;
	private String titulo;
	private int vidaMax;
	private int vidaAtual;
	private int ad;
	private int ap;
	private boolean vivo;
	private Spell ataque1;
	private Spell ataque2;
	private Spell ataque3;
	private Spell ataque4;
	
	//Construtor
	public Campeão(String n, String ti, int v, int ad, int ap, Spell at1, Spell at2, Spell at3, Spell at4) {
		this.setNome(n);
		this.setTitulo(ti);
		this.setVidaMax(v);
		this.setVidaAtual(v);
		this.setAd(ad);
		this.setAp(ap);
		this.setVivo(true);
		this.setAtaque1(at1);
		this.setAtaque2(at2);
		this.setAtaque3(at3);
		this.setAtaque4(at4);
	}
	
	//Metodos
	public void atacar() {
		
	}
	public void morrer() {
		if(this.getVidaMax() == 0) {
			this.setVivo(false);
		}
	}
	
	public void status() {
		System.out.println("------------------------");
		System.out.println(this.getNome() + ", " + this.getTitulo() + ", está pronto para a batalha.");
		System.out.println("Ele tem " + this.getVidaMax() + " pontos de vida, " + this.getAd() + " pontos de AD e " + this.getAp() + " pontos de AP.");
		System.out.println("Ataques disponíveis: ");
		System.out.println(this.getAtaque1().getNome() + ": " + this.getAtaque1().getDano() + " de dano.");
		System.out.println(this.getAtaque2().getNome() + ": " + this.getAtaque2().getDano() + " de dano.");
		System.out.println(this.getAtaque3().getNome() + ": " + this.getAtaque3().getDano() + " de dano.");
		System.out.println(this.getAtaque4().getNome() + ": " + this.getAtaque4().getDano() + " de dano.");
		System.out.println("------------------------");
	}
	
	public void statusLuta() {
		System.out.println("------------------------");
		System.out.println("" + this.getNome() + ": " + this.getVidaAtual() + " HP");
		System.out.println("------------------------");
	}
	
	//Metodos especiais

	public int getAd() {
		return ad;
	}
	public void setAd(int ad) {
		this.ad = ad;
	}
	public int getAp() {
		return ap;
	}
	public void setAp(int ap) {
		this.ap = ap;
	}
	public boolean isVivo() {
		return vivo;
	}
	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}

	public Spell getAtaque1() {
		return ataque1;
	}

	public void setAtaque1(Spell ataque1) {
		this.ataque1 = ataque1;
	}

	public Spell getAtaque2() {
		return ataque2;
	}

	public void setAtaque2(Spell ataque2) {
		this.ataque2 = ataque2;
	}

	public Spell getAtaque3() {
		return ataque3;
	}

	public void setAtaque3(Spell ataque3) {
		this.ataque3 = ataque3;
	}

	public Spell getAtaque4() {
		return ataque4;
	}

	public void setAtaque4(Spell ataque4) {
		this.ataque4 = ataque4;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getVidaMax() {
		return vidaMax;
	}

	public void setVidaMax(int vidaMax) {
		this.vidaMax = vidaMax;
	}

	public int getVidaAtual() {
		return vidaAtual;
	}

	public void setVidaAtual(int vidaAtual) {
		this.vidaAtual = vidaAtual;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	
	
}
