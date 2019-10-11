package colas;

import javax.swing.JOptionPane;

public class Cola {
    protected NodoCola frente;
    protected NodoCola fin;
    
    // constructor para inicializar la cola vacía
    public Cola() {
        frente = fin = null;
    }
    
    //OPERACIONES
    
    // push(elemento): Inserta el dato al final de la Cola
    public void insertarDato(int dato) {
        NodoCola nuevoNodo;
        nuevoNodo = new NodoCola(dato);
        if (colaVacia()){
            frente = nuevoNodo;
        }
        else{
            fin.siguiente = nuevoNodo;
        }
        fin = nuevoNodo;
    }
    
    // Muestra al primero de la cola
    public int frenteCola() {
        return (frente.informacion);
    }
    
    // isEmpty() – Revisa si la Cola esta vacía.
    public boolean colaVacia() {
        return frente == null;
    }
    
    // quitar: Elimina el elemento que esta al inicio de la cola.
    public int eliminarDato() {
        int aux = frente.informacion;
        frente = frente.siguiente;
        return aux;
    }
    
    // Elimina todos los datos de la Cola.
    public void limpiarCola() {
        while (!colaVacia()){
            frente = frente.siguiente;
        }
    }
}
