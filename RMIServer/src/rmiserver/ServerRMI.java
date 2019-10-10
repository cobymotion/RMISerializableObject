package rmiserver;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ServerRMI {
    
    public static void main(String[] args) throws Exception{
        System.out.println("Abriendo servidor");
        ObjetoRemotoImple objR = new ObjetoRemotoImple(); 
        Registry registry = LocateRegistry.createRegistry(5001);
        registry.rebind("OBJRemoto", objR);
        System.out.println("Servidor activo");
    }
    
}
