package br.com.dotofcodex.java_io.teste;

import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class TesteEscritaPrintWriter {
	public static void main(String[] args) throws IOException {
		// Fluxo de Saída com Arquivo
		PrintStream ps = new PrintStream("arquivo.txt", StandardCharsets.UTF_8.displayName());
		ps.println("A linguagem Java foi criada por James Gosling.");
		ps.println();
		ps.close();
	}
}
