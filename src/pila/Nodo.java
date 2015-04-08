package pila;

/**
 * Created by jaime on 08-04-2015.
 */
public class Nodo<T> {
    private T dato;
    private Nodo enlace;

    Nodo(T dato) {
        this.dato = dato;
        this.enlace = null;
    }

    public void setEnlace(Nodo enlace) {
        this.enlace = enlace;
    }

    public Nodo getEnlace() {
        return this.enlace;
    }

    @Override
    public String toString() {
        return dato.toString();
    }
}
