package br.com.dotofcodex.java_io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteCopiaArquivo {
	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("arquivo.txt");
		Reader r = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(r);
		
		OutputStream os = new FileOutputStream("arquivo_ii.txt");
		Writer w = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(w);
		
		String line = null;
		while ((line = br.readLine()) != null) {
			bw.write(line);
			bw.newLine();
		}
		
		bw.close();
		br.close();
	}
}
