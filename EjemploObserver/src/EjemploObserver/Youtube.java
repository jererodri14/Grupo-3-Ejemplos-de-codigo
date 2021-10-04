
package EjemploObserver;

public class Youtube {
    private void ejecuta ( ) {
        Observado canal1 = new CanalYoutube( " Canal 1 " ) ;
        Observador suscriptor1 = new Suscriptores ( " noobmaster69 " ) ;
        canal1.addObservador(suscriptor1) ;
        canal1.informaObservadores( " Se subio nuevo video" );
 }
public static void main(String[] args) {        
        new Youtube( ).ejecuta();
}
   }
