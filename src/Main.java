import pila.Pila;

/**
 * Created by jaime on 08-04-2015.
 */
public class Main {
    public static void main(String[] args) {
        Objeto obj1 = new Objeto("uno");
        Objeto obj2 = new Objeto("dos");
        Objeto obj3 = new Objeto("tres");
        Objeto obj4 = new Objeto("pepe");
        Objeto obj5 = new Objeto("lala");
        Objeto obj6 = new Objeto("pepa");

        TriReferencia triReferencia1 = new TriReferencia(obj1, obj2, obj3);
        TriReferencia triReferencia2 = new TriReferencia(obj4, obj5, obj6);



        Pila<TriReferencia> pila = new Pila<TriReferencia>();

        pila.apilar(triReferencia1);

        pila.apilar(triReferencia2);

        //System.out.println(pila.verTop());

        System.out.println(pila.toString());


    }
}
