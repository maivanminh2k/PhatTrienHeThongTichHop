package bai1;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ServerSocket server = new ServerSocket(1100);
			System.out.println("Server da duoc tao");
			Socket client = server.accept();
			System.out.println("Client da ket noi den server");
			Scanner inFromClient = new Scanner(client.getInputStream());
			PrintStream outToClient = new PrintStream(client.getOutputStream());
			outToClient.println("Nhap so tra ve chu so: ");
			String num = inFromClient.nextLine();
			System.out.println("client: " +num);
			
			switch (num)
			{
				case "0": outToClient.println("Khong");
					break;
				case "1": outToClient.println("mot");
					break;
				case "2": outToClient.println("hai");
					break;
				case "3": outToClient.println("ba");
					break;
				case "4": outToClient.println("bon");
					break;
				case "5": outToClient.println("nam");
					break;
				case "6": outToClient.println("sau");
					break;
				case "7": outToClient.println("bay");
					break;
				case "8": outToClient.println("tam");
					break;
				case "9": outToClient.println("chin");
					break;
				default: outToClient.println("Khong phai so nguyen");
			}
			
			}
			catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}

	}
}