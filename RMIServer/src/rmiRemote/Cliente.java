
package rmiRemote;

import java.io.Serializable;

public class Cliente implements Serializable{
    
    private int id; 
    private String nombre; 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    
}
