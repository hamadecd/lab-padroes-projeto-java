package br.com.relatorio.templatemethod;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

public class RelatorioAnaliticoGUI extends GeradorDeRelatorios {
	
	@Override
    protected String gerarCabecalho(){
        SimpleDateFormat sdf = new SimpleDateFormat("H:m:s d/M/y G");
        return new String(
            "RELATORIO DE PRODUTOS VENDIDOS\n"+
            sdf.format(new Date()) +
            "\nDIO Sistemas\n");    
    }

	@Override
	protected String gerarConteudo(List<Produto> produtos) {
		StringBuilder conteudo = new StringBuilder();
		double totalProdutos = 0;
		conteudo.append("\nPRODUTOS VENDIDOS\n");
		for (Produto produto : produtos) {
			totalProdutos += produto.getPreco();
			conteudo.append(produto.getNome() + "R$ " + produto.getPreco() + "\n");
		}
		conteudo.append("\nTOTAL VENDIDO " + totalProdutos);
		return conteudo.toString();
	}

	@Override
	protected void gerarVisualizacao(String cabecalho, String conteudo) {
		JOptionPane.showMessageDialog(null, cabecalho + conteudo, "Relatório analítico", JOptionPane.INFORMATION_MESSAGE);
	}

}
