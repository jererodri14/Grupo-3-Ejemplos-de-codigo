
package EjemploObserver;

public class PruebaEspias {
    private void ejecuta ( ) {
        Observado espiaBoris = new EspiaKGB( " Boris " ) ;
        Observador jefeBorisKGB = new JefeEspiasKGB ( " Jefe de Boris " ) ;
        espiaBoris.addObservador(jefeBorisKGB) ;
        espiaBoris.informaObservadores( " Estoy siguiendo al topo " );
 }
public static void main(String[] args) {        
        new PruebaEspias( ).ejecuta( );
}
   }
