package Jogo;

public class princ {

	public static void main(String[] args) {
		
		
		Spell Ornn1 = new Spell("Ruptura Vulc�nica", 60);
		Spell Ornn2 = new Spell("F�lego do Fole", 80);
		Spell Ornn3 = new Spell("Investida Calcinante", 50);
		Spell Ornn4 = new Spell("Chamado do Deus da Forja", 100);
		Campe�o ornn = new Campe�o("Ornn", "O fogo sob a montanha", 600, 50, 0, Ornn1, Ornn2, Ornn3, Ornn4);
		//ornn.statusLuta();
		
		Spell Ashe1 = new Spell("Concentra��o", 80);
		Spell Ashe2 = new Spell("Rajada", 90);
		Spell Ashe3 = new Spell("Olhar do Falc�o", 40);
		Spell Ashe4 = new Spell("Flecha de Cristal Encantada", 120);
		Campe�o ashe = new Campe�o("Ashe", "A arqueira do gelo", 470, 80, 30, Ashe1, Ashe2, Ashe3, Ashe4);
		//ashe.statusLuta();
		
		Luta luta1 = new Luta(ornn, ashe);
		luta1.acontecendo();
		
	}
	
}
