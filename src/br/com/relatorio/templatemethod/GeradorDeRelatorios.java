package br.com.relatorio.templatemethod;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public abstract class GeradorDeRelatorios {

	public final void gerarRelatorios(List<Produto> produtos) {
		String cabecalho = this.gerarCabecalho();
		String conteudo = this.gerarConteudo(produtos);
		this.gerarVisualizacao(cabecalho, conteudo);
	}
	
	protected String gerarCabecalho() {
		SimpleDateFormat sdf = new SimpleDateFormat("d/M/y");
		return new String(
				"RELATORIO DE PRODUTOS VENDIDOS\n"+
		sdf.format(new Date()) +
		"\nDIO Sistemas\n");
	}
	
	protected abstract String gerarConteudo(List<Produto> produtos);
	protected abstract void gerarVisualizacao(String cabecalho, String conteudo);
}
