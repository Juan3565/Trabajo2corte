package pilas;

public class NodoPila {    
    int informacion;
    NodoPila siguiente;
    
    NodoPila(int dato)
    {
        informacion = dato;
        siguiente = null;
    }
}
