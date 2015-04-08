/**
 * Created by jaime on 07-04-2015.
 */
public class Objeto {

    protected String dato;

    Objeto(String dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        return dato;
    }
}
