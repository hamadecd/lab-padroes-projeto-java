package br.com.rpg.factorymethod;

public class Elfo implements Raca {

	@Override
	public String ataque() {
		return "Ataca com arco e flecha";
		
	}

	@Override
	public String defesa() {
		return "Usa uma escudo para se defender";
	}

	@Override
	public String getNome() {
		return "Legolas";
	}

}
