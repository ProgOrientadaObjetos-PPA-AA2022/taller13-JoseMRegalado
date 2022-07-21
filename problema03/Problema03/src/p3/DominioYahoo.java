
package p3;

/**
 *
 * @author SALA I
 */
public class DominioYahoo implements Dominio{
    private String dominio;

    @Override
    public void establecerDominio(String g) {
        dominio = g;
    }

    @Override
    public String obtenerDominio() {
        return dominio;
    }
    
    @Override
    public String toString(){
        String cadena = String.format(" - Yahoo");
        return cadena;
    }
}
