package br.com.rpg.factorymethod;

import java.util.Scanner;

public class TestFactoryMethod {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escolha a raça do personagem: \n"
				+ "1 - Humano \n"
				+ "2 - Anão \n"
				+ "3 - Elfo");
		int tipoRaca = entrada.nextInt();
		Raca raca = RacaFactory.criaRaca(tipoRaca);
		System.out.println(raca.getNome());
		System.out.println(raca.ataque());
		System.out.println(raca.defesa());
		entrada.close();
	}

}
