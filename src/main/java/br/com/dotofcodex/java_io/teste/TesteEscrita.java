package br.com.dotofcodex.java_io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {
	public static void main(String[] args) throws IOException {
		// Fluxo de Saída com Arquivo
		OutputStream fos = new FileOutputStream("arquivo_2.txt");
		Writer w = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(w);

		bw.write("Pedro Junior");
		bw.newLine();
		
		bw.close();
	}
}
