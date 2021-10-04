
package EjemploObserver;

public class JefeEspiasKGB implements Observador {
    private String nombre;

    public JefeEspiasKGB ( ) {
    super ( ) ;
    nombre = " Anonimo " ;
    }
    public JefeEspiasKGB ( String nombre ) {
        super ( ) ;
        this.nombre = nombre ;
    }
    @Override
    public void informe ( String evento ) {
        System.out.println( nombre + " recibe de " + evento) ;
    }
 }
