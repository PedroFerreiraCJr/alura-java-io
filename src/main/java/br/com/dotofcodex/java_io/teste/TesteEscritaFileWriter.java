package br.com.dotofcodex.java_io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {
	public static void main(String[] args) throws IOException {
		// Fluxo de Saída com Arquivo
		BufferedWriter bw = new BufferedWriter(new FileWriter("arquivo.txt"));
		bw.write("A linguagem Java foi criada por James Gosling.");
		bw.newLine();
		bw.close();
	}
}
