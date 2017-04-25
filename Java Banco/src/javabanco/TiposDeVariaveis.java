package javabanco;

import java.util.ArrayList;
import java.util.Date;

import javabanco.entidade.ContaCorrente;
import javabanco.entidade.Operacao;

public class TiposDeVariaveis {

	public static void main(String[] args) {
		int umNumero = 42;
		int outroNumero = 3;
		int produto = 0;

		Integer umNumeroObj = new Integer(42);

		// alt + shit + x, j
		System.out.println("umNumero: " + umNumero);

		produto = umNumero * outroNumero;

		System.out.println("produto: " + produto);

		System.out.println("umNumeroObj: " + umNumeroObj);

		ArrayList<Integer> contas = new ArrayList<Integer>();

		contas.add(12345);
		contas.add(67890);
		contas.add(246810);
		contas.add(13579);

		System.out.println("contas: " + contas);

		ContaCorrente cc1 = new ContaCorrente("Gilberto", 67890);
		System.out.println("cc1.getSaldo(): " + cc1.getSaldo());

		cc1.credito(umNumero);

		System.out.println("cc1.getSaldo() ap�s cr�dito: " + cc1.getSaldo());

		cc1.debito(20);

		System.out.println("cc1.getSaldo() ap�s d�bito: " + cc1.getSaldo());

		System.out.println("cc1.extrato():" + cc1.extrato());

		Operacao o1 = new Operacao(500, "CREDITO", new Date(2017 - 1900, 3, 18, 10, 0, 0));
		Operacao o2 = new Operacao(300, "DEBITO", new Date());

		// System.out.println("o1: " + o1.getValor() + ", " +
		// o1.getTipoOperacao() + ", " + o1.getDataHora());
		System.out.println("o1: " + o1.toString());
		System.out.println("o2: " + o2.toString());

		ContaCorrente cc2 = new ContaCorrente("Marcos", 12345);
		cc1.transferencia(10, cc2);
		System.out.println("cc2.extrato():" + cc2.extrato());
		System.out.println("cc1.extrato():" + cc1.extrato());

		System.out.println("Nome do titular cc1: " + cc1.getTitular());
		System.out.println("Nome do titular cc2: " + cc2.getTitular());
		System.out.println("Numero da conta cc1: " + cc1.getNumero());
		System.out.println("Numero da conta cc2: " + cc2.getNumero());
	}

}
