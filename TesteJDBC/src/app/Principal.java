package app;

import java.math.BigDecimal;
import java.sql.Date;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import dao.ProdutoDAO;
import db.DbException;
import modelo.Produto;

public class Principal {
	public static void main(String[] args) {
		SimpleDateFormat fd = new SimpleDateFormat("dd.MM.yyyy");
		NumberFormat fm = NumberFormat.getCurrencyInstance();

		ProdutoDAO dao = new ProdutoDAO();

		
		 Produto pdt = new Produto(null, 
				 					"Televisão", 
				 					Date.valueOf("2022-11-25"),
				 					30, 
				 					new BigDecimal(5499.99));
		 
		  //pdt.setIdProd(5);
		 
		 try {
			 if (dao.excluir(3)) {
				 System.out.println("Exclusão efetuada com sucesso!");
			 } else {
				 System.out.println("Registro não excluido!");
			 }
		 } catch (DbException e) {
			 System.out.println(e.getMessage());
		 }

			/*
			 * Map<String, Integer> retorno = new HashMap<>();
			 * 
			 * try { retorno = dao.salvar(pdt);
			 * 
			 * System.out.println(retorno.get("afetados").toString() +
			 * "registro(s) afetado(s)"); if (retorno.get("chave") != null) {
			 * System.out.println("Novo ID gerado: " + retorno.get("chave")); } } catch
			 * (DbException e) { System.out.println(e.getMessage()); }
			 */

		 
//		System.out.println("Informe o nome do produto a pesquisar: ");
//		Scanner sc = new Scanner(System.in);
//		String nome = sc.nextLine();
//		List<Produto> lista = dao.buscarPorNome(nome);
//		
//		if (lista.isEmpty()) {
//			System.out.println("\nTabela está vazia!");
//		}else {
//			System.out.println("Lista de Produtos");
//			System.out.println("# Total de registros: " + dao.getNumeroRegistros());
//			String msg = "# registros coincidindo com o filtro de busca: " + lista.size();
//			System.out.println("=" .repeat(msg.length()));
//			
//			for (Produto produto : lista) {
//				System.out.println("Id...........: " + produto.getIdProd());
//				System.out.println("Nome produto.: " + produto.getNomeProd());
//				System.out.println("Data cadastro: " + produto.getDataCadastro());
//				System.out.println("Quantidade...: " + produto.getQuantidade());
//				System.out.println("Preço........: " + fm.format(produto.getPreco()));
//				System.out.println();
//		}
//
//		System.out.println("-" .repeat(msg.length()));
//		System.out.println(msg);
//		}
	}
}
