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

public interface Component {

    public String metodoDefecto();
    public ArrayList<Component> getHijos();
    public boolean añadirComponente(Component c);
    public boolean eliminarComponente(Component c);
}
