
package EjemploObserver;

public class Suscriptores implements Observador {
    private String nombre;

    public Suscriptores ( ) {
    super ( ) ;
    nombre = " Anonimo " ;
    }
    public Suscriptores ( String nombre ) {
        super ( ) ;
        this.nombre = nombre ;
    }
    @Override
    public void informe ( String evento ) {
        System.out.println( nombre + " recibe de " + evento) ;
    }
 }
