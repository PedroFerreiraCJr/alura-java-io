package br.com.dotofcodex.java_io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class TesteLeitura {
	public static void main(String[] args) throws IOException {
		// Fluxo de Entrada com Arquivo
		FileInputStream fis = new FileInputStream("arquivo.txt");
		InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
		BufferedReader br = new BufferedReader(isr);

		String line = null;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}

		br.close();
	}
}
