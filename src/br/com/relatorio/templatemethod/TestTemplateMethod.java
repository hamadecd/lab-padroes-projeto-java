package br.com.relatorio.templatemethod;

import java.util.ArrayList;
import java.util.List;

public class TestTemplateMethod {

	public static void main(String[] args) {

		List<Produto> produtos = new ArrayList<>();
		produtos.add(new Produto("Mouse", 10));
		produtos.add(new Produto("Teclado", 35));
		produtos.add(new Produto("Webcam", 230));

		GeradorDeRelatorios relatorioSimplesConsole = new RelatorioSimplesConsole();
		relatorioSimplesConsole.gerarRelatorios(produtos);

		GeradorDeRelatorios relatorioAnaliticoGUI = new RelatorioAnaliticoGUI();
		relatorioAnaliticoGUI.gerarRelatorios(produtos);

	}

}
