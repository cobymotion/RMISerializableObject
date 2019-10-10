package rmiserver;


import rmiRemote.ObjetoRemoto;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import rmiRemote.Cliente;


public class ObjetoRemotoImple extends UnicastRemoteObject
implements ObjetoRemoto {

    public ObjetoRemotoImple() throws RemoteException {
        super(); 
    }

 
    @Override
    public String getSaludo(String nombre) throws RemoteException {
            String nombreMayus = nombre.toUpperCase(); 
            return "HOLA SOY RMI Y ME LLAMO " + nombreMayus;
    }

    @Override
    public Cliente getCliente() throws RemoteException {
        Cliente c = new Cliente();
        c.setId(1);
        c.setNombre("PEPE");
        return c;
    }
    
}
