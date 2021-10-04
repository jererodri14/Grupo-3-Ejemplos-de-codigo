
package EjemploObserver;

import java.util.ArrayList;
import java.util.List;

 public class EspiaKGB implements Observado {
    private String nombre ;
    private List<Observador>observadores = new ArrayList<Observador >() ;

    public EspiaKGB ( String nombre ) {
        super ( ) ;
    this.nombre = nombre ;
    }
    @Override
    public void addObservador ( Observador observador ) {
        observadores.add( observador ) ;
    }
    @Override
    public void removeObservador( Observador observador ) {
        observadores.remove ( observador ) ;
    }
    @Override
    public void informaObservadores( String accion) {
        for ( Observador observador : observadores )
            observador.informe ( nombre + " : " + accion ) ;
 }
}
