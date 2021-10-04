
package EjemploObserver;

public interface Observado {
    public void addObservador(Observador observador) ;
    public void removeObservador( Observador observador) ;
    public void informaObservadores( String accion ) ;
}
