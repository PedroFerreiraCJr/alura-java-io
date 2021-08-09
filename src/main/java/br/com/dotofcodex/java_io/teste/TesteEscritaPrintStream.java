package br.com.dotofcodex.java_io.teste;

import java.io.IOException;
import java.io.PrintWriter;

public class TesteEscritaPrintStream {
	public static void main(String[] args) throws IOException {
		// Fluxo de Saída com Arquivo
		PrintWriter pw = new PrintWriter("arquivo.txt");
		pw.println("A linguagem Java foi criada por James Gosling.");
		pw.println();
		pw.close();
	}
}
