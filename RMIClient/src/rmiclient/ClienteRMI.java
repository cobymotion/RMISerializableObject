package rmiclient;


import rmiRemote.ObjetoRemoto;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import rmiRemote.Cliente;


public class ClienteRMI {
    public static void main(String[] args) throws Exception {
        Registry reg = LocateRegistry.
                getRegistry("127.0.0.1",5001);
        ObjetoRemoto remoto ; 
        remoto = (ObjetoRemoto)reg.lookup("OBJRemoto"); 
        String cadena = remoto.getSaludo("Luis"); 
        System.out.println("El nombre es " + cadena);
        
        Cliente c = remoto.getCliente(); 
        
        System.out.println(c.getId());
        System.out.println(c.getNombre());
    }
}
