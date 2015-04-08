/**
 * Created by jaime on 07-04-2015.
 */
public class TriReferencia {

    private Objeto ref1;
    private Objeto ref2;
    private Objeto ref3;

    TriReferencia(Objeto ref1, Objeto ref2, Objeto ref3) {
        this.ref1 = ref1;
        this.ref2 = ref2;
        this.ref3 = ref3;
    }

    @Override
    public String toString() {
        return "[ " + ref1 + ", " + ref2 + ", " + ref3 +" ]";
    }
}
