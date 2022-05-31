package br.com.rpg.factorymethod;

public class RacaFactory {
	
	public static Raca criaRaca(int raca) {
		if (raca == 1) {
			return new Humano();
		} else if (raca == 2) {
			return new Anao();
		} else if (raca == 3) {
			return new Elfo();
		} else
		return null;
	}

}
