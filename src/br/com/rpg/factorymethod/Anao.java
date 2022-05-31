package br.com.rpg.factorymethod;

public class Anao implements Raca {

	@Override
	public String ataque() {
		return "Ataca com machado";
	}

	@Override
	public String defesa() {
		return "Usa uma cota de malha para se defender";
	}

	@Override
	public String getNome() {
		return "Azaghal";
	}

}
