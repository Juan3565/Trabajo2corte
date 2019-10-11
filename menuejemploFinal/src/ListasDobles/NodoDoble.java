package listasDobles;

public class NodoDoble {
    private int informacion;
    public NodoDoble siguiente, anterior;
    
    //Constructor cuando no hay nodos.
    public NodoDoble(int inf){
        this(inf, null, null);
    }
    //constructor cuando hay nodos.
    public NodoDoble(int inf, NodoDoble sig, NodoDoble ant){
        setInformacion(inf);
        setSiguiente(sig);
        setAnterior(ant);
    }

    public void setInformacion(int informacion) {
        this.informacion = informacion;
    }

    public void setSiguiente(NodoDoble siguiente) {
        this.siguiente = siguiente;
    }

    public void setAnterior(NodoDoble anterior) {
        this.anterior = anterior;
    }

    public int getInformacion() {
        return informacion;
    }

    public NodoDoble getSiguiente() {
        return siguiente;
    }

    public NodoDoble getAnterior() {
        return anterior;
    }    
}
