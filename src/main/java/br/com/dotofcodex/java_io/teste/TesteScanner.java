package br.com.dotofcodex.java_io.teste;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;

public class TesteScanner {
	public static void main(String[] args) throws IOException {
		// Fluxo de Entrada com Arquivo
		Scanner scanner = new Scanner(new File("contas.csv"), StandardCharsets.UTF_8.displayName());
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			System.out.println("----------");

			Scanner lineScanner = new Scanner(line);
			lineScanner.useLocale(new Locale("pt", "BR"));
			lineScanner.useDelimiter(",");
			while (lineScanner.hasNext()) {
				System.out.println(lineScanner.next());
			}
			lineScanner.close();
		}

		scanner.close();
	}
}
