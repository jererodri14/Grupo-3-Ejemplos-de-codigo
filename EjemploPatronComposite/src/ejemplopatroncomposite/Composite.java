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
public class Composite implements Component{

   private String identificador;
    private ArrayList<Component> listaComponentes = new ArrayList<Component>();
    public Composite(String identificador) {
        this.identificador = identificador; 
    }    
    public String metodoDefecto() {
        String s = "(" + identificador + ":";
        for (Component hijo : getHijos())
        s = s + " " + hijo.metodoDefecto();
        return s + ")";
    }    
    public ArrayList<Component> getHijos(){
        return listaComponentes; 
    }    
    public boolean añadirComponente(Component componente){
        return listaComponentes.add(componente); 
    }    
    public boolean eliminarComponente(Component componente){
    return listaComponentes.remove(componente); }
    
}
