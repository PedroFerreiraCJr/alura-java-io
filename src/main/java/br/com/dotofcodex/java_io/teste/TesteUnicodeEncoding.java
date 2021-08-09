package br.com.dotofcodex.java_io.teste;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEncoding {
	public static void main(String[] args) {
		String letra = "C";
		// obtem a representação de codepoint (em Unicode) de determinado caracter da
		// string
		System.out.println("Letra 'C' Codepoint: " + letra.codePointAt(0));

		// obtem o conjunto caracteres default do sistema operacional
		Charset charset = Charset.defaultCharset();
		System.out.println("Linux Default Charset: " + charset.displayName());

		// obtem os bytes de uma string a partir de um charset
		byte[] bytes = letra.getBytes(charset);
		System.out.println(bytes.length + ", " + charset.displayName());

		// metodo utilitario para obter outros charsets: Charset.forName
		charset = Charset.forName("UTF-16");
		bytes = letra.getBytes(charset);
		System.out.println(bytes.length + ", " + charset.displayName());

		// classe relacionada e dependente de Charset
		charset = StandardCharsets.US_ASCII;
		bytes = letra.getBytes(charset);
		System.out.println(bytes.length + ", " + charset.displayName());

		// decodificação dos bytes de uma string, que foi codificada no charset default
		// do sistema operacional
		String letraDecode = new String(bytes, Charset.defaultCharset());
		System.out.println(letraDecode);
	}

	private static void banaryOperation() {
		// https://www.baeldung.com/java-bitwise-operators
		final byte val1 = 1; // 0000 0001
		final byte val2 = 2; // 0000 0010
		final byte result = val1 | val2;
		String binary = Integer.toBinaryString(result);
		System.out.println("00000000".substring(binary.length()) + binary);
	}
}