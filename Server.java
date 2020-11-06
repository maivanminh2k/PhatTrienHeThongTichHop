package lab5;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Server {

	public static void main(String[] args) throws RemoteException {
		// Tạo cổng server
		LocateRegistry.createRegistry(7777);
		try {
			Naming.rebind("rmi://localhost:7777/MuaVeMayBayService", new ChuyenBay());
			System.out.println("Xin Chào");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}