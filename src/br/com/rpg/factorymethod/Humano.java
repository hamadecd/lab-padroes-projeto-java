package br.com.rpg.factorymethod;

public class Humano implements Raca {

	@Override
	public String getNome() {
		return "Aragorn";
	}

	@Override
	public String ataque() {
		return "Ataca com espada";
	}

	@Override
	public String defesa() {
		return "Usa uma tocha para se defender";
	}

}
