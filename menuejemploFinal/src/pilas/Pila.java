package pilas;

import javax.swing.JOptionPane;

public class Pila {
    private NodoPila cima;
    
    //Constructor para inicializar la pila vacía
    public Pila() {
        cima = null;
    }
    
    //OPERACIONES
        
    //push(elemento) – Inserta el dato en la parte superior de la pila.
    public void insertarDato(int dato) {
        NodoPila nuevoNodo;
        nuevoNodo = new NodoPila(dato);
        nuevoNodo.siguiente = cima;
        cima = nuevoNodo;
    }
    
    //topEl() – Mostar el dato superior de la pila sin quitarlo.
    public int cimaPila() {
        return cima.informacion;
    }
    
    //isEmpty() – Revisa si la pila esta vacía.
    public boolean pilaVacia() {
        return cima == null;
    }
    
    //pop() – Extrae el dato superior de la pila.
    public int eliminarDato() {
        int aux = cima.informacion;
        cima = cima.siguiente;
        return aux;
    }
    
    //Clear() – Borrar la pila.
    public void limpiarPila() {
        NodoPila nodo;
        while(!pilaVacia()) {
            nodo = cima;
            nodo.siguiente = null;
            cima = cima.siguiente;
        }
    }
}
