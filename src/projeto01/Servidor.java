package projeto01;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		ServerSocket s = new ServerSocket(2000);
		System.out.println("Esperando conexao...............");
		
		Socket conexao = s.accept();
		System.out.println("Conexão aceita, esperando dados");
		
		DataInputStream entrada = new DataInputStream(conexao.getInputStream());
		DataOutputStream saida = new DataOutputStream(conexao.getOutputStream());
		
		for (int i = 0; i < 100000; i++) {
			int linha = entrada.readInt();
			System.out.println("O cliente enviou o valor: " + linha);
			saida.writeUTF("recebi seu dado: " + linha);
		}

	}

}
