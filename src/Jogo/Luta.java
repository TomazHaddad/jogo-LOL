package Jogo;

import java.util.Scanner;

public class Luta implements InterfaceLuta{

	//Atributos
	private Campeão lutador1;
	private Campeão lutador2;
	private boolean rolando;
	
	//Construtor
	public Luta(Campeão l1, Campeão l2) {
		this.setLutador1(l1);
		this.setLutador2(l2);
		this.setRolando(true);
	}
	
	//Métodos
	
	public void acontecendo() {
		Scanner sc = new Scanner(System.in);
		this.getLutador1().statusLuta();
		this.getLutador2().statusLuta();
		while(this.getLutador1().getVidaAtual() > 0 && this.getLutador2().getVidaAtual() > 0) {
			System.out.println("Qual golpe " + this.getLutador1().getNome() + " usará?");
			System.out.println("1 " + this.getLutador1().getAtaque1().getNome() + " - " + this.getLutador1().getAtaque1().getDano());
			System.out.println("2 " + this.getLutador1().getAtaque2().getNome() + " - " + this.getLutador1().getAtaque2().getDano()) ;
			System.out.println("3 " + this.getLutador1().getAtaque3().getNome() + " - " + this.getLutador1().getAtaque3().getDano());
			System.out.println("4 " + this.getLutador1().getAtaque4().getNome() + " - " + this.getLutador1().getAtaque4().getDano());
			System.out.println("----------------------------------");
			int valor1 = sc.nextInt();
			while(valor1 != 1 && valor1 != 2 && valor1 != 3 && valor1 != 4){
				System.out.println("Digite um valor válido entre 1 e 4.");
				valor1 = sc.nextInt();
			}
			ataqueLut1(valor1);
			if(this.getLutador2().getVidaAtual() <= 0) {
				this.getLutador2().setVidaAtual(0);
				this.getLutador2().statusLuta();
				System.out.println(this.getLutador2().getNome() + " desmaiou. Vitória de " + this.getLutador1().getNome());
				this.setRolando(false);
			}
			if(this.isRolando() != false) {
				this.getLutador2().statusLuta();
				System.out.println("Qual golpe " + this.getLutador2().getNome() + " usará?");
				System.out.println("1 " + this.getLutador2().getAtaque1().getNome() +  " - " + this.getLutador2().getAtaque1().getDano());
				System.out.println("2 " + this.getLutador2().getAtaque2().getNome() +  " - " + this.getLutador2().getAtaque2().getDano());
				System.out.println("3 " + this.getLutador2().getAtaque3().getNome() +  " - " + this.getLutador2().getAtaque3().getDano());
				System.out.println("4 " + this.getLutador2().getAtaque4().getNome() +  " - " + this.getLutador2().getAtaque4().getDano());
				int valor2 = sc.nextInt();
				while(valor2 != 1 && valor2 != 2 && valor2 != 3 && valor2 != 4) {
					System.out.println("Digite um valor válido entre 1 e 4.");
					valor2 = sc.nextInt();
				}
				ataqueLut2(valor2);
				this.getLutador1().statusLuta();
				if(this.getLutador1().getVidaAtual() <= 0) {
					this.getLutador1().setVidaAtual(0);
					this.getLutador1().statusLuta();
					System.out.println(this.getLutador1().getNome() + " desmaiou. Vitória de " + this.getLutador2().getNome());
					this.setRolando(false);
				}
			}
		}
		sc.close();
	}
	
	public void ataqueLut1(int valor) {
			if(valor == 1) {
				this.getLutador2().setVidaAtual(this.getLutador2().getVidaAtual() - this.getLutador1().getAtaque1().getDano());
			}else if(valor == 2) {
				this.getLutador2().setVidaAtual(this.getLutador2().getVidaAtual() - this.getLutador1().getAtaque2().getDano());
			}else if(valor == 3) {
				this.getLutador2().setVidaAtual(this.getLutador2().getVidaAtual() - this.getLutador1().getAtaque3().getDano());
			}else if(valor == 4) {
				this.getLutador2().setVidaAtual(this.getLutador2().getVidaAtual() - this.getLutador1().getAtaque4().getDano());
			}
	}
	
	public void ataqueLut2(int valor) {
			if(valor == 1) {
				this.getLutador1().setVidaAtual(this.getLutador1().getVidaAtual() - this.getLutador2().getAtaque1().getDano());
			}else if(valor == 2){
				this.getLutador1().setVidaAtual(this.getLutador1().getVidaAtual() - this.getLutador2().getAtaque2().getDano());
			}else if(valor == 3){
				this.getLutador1().setVidaAtual(this.getLutador1().getVidaAtual() - this.getLutador2().getAtaque3().getDano());
			}else if(valor == 4){
				this.getLutador1().setVidaAtual(this.getLutador1().getVidaAtual() - this.getLutador2().getAtaque4().getDano());
			}
	}
	
	//Métodos especiais
	public Campeão getLutador1() {
		return lutador1;
	}
	public void setLutador1(Campeão lutador1) {
		this.lutador1 = lutador1;
	}
	public Campeão getLutador2() {
		return lutador2;
	}
	public void setLutador2(Campeão lutador2) {
		this.lutador2 = lutador2;
	}
	
	public boolean isRolando() {
		return rolando;
	}

	public void setRolando(boolean rolando) {
		this.rolando = rolando;
	}

	
	
}
