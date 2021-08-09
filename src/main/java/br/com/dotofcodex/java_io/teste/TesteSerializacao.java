package br.com.dotofcodex.java_io.teste;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import br.com.dotofcodex.java_io.model.Cliente;

public class TesteSerializacao {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Cliente cliente = new Cliente();
		cliente.setNome("Nico");
		cliente.setProfissao("Instrutor");
		cliente.setCpf("000.000.000-11");
		
		//write(cliente);
		Cliente desserializado = (Cliente) read();
		System.out.println(desserializado.getNome());
	}

	private static void write(Object o) throws IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
		oos.writeObject(o);
		oos.close();
	}

	private static Object read() throws IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
		Object value = ois.readObject();
		ois.close();
		return value;
	}
}
