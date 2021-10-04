/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplopatroncomposite;

import java.util.ArrayList;

/**
 *
 * @author HEIZEL
 */
public class Leaf implements Component{

    private String identificador;
    public Leaf(String identificador){ 
        this.identificador = identificador; 
    }   
    public String metodoDefecto(){ 
        return identificador; 
    }    
    public ArrayList<Component> getHijos(){ 
        return null; 
    }    
    public boolean añadirComponente(Component component){
        return false; 
    }    
    public boolean eliminarComponente(Component component){ 
        return false; 
    }

    
}
