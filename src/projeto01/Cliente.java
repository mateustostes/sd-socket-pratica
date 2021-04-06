package projeto01;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Cliente {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		
		Socket s = new Socket("localhost", 2000);
		DataOutputStream saida = new DataOutputStream(s.getOutputStream());
		DataInputStream entrada = new DataInputStream(s.getInputStream());
		
		for (int i = 0; i < 100000; i++){
			saida.writeInt(i);
			System.out.println("Enviei o valor: "+i);
			String en = entrada.readUTF();
			System.out.println("Recebi o valor: "+en);
			}
		
		
	}

}
