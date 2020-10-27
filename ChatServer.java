package bai2_tuan4;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChatServer {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(1122);
			System.out.println("Server da duoc tao");
			Socket socket =server.accept();
			System.out.println("Client da ket noi den server");
			DataOutputStream out = new DataOutputStream(socket.getOutputStream());
			DataInputStream in = new DataInputStream(socket.getInputStream());
			Scanner input = new Scanner(System.in);
			while(true) {
				String str =in.readUTF();
				if(str.equalsIgnoreCase("h")) {	
					break;
				}else {
					System.out.println("Client: " + str);
				}
				System.out.println("\n");
				out.writeUTF(input.nextLine());
				out.flush();
			}
			System.out.println("Ngat ket noi tro chuyen");
			input.close();
			in.close();
			out.close();
			socket.close();
			server.close();
		} catch (IOException e) {
			System.out.println("Cuoc tro chuyen ket thuc");
		}

	}

}