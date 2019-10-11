package listasDobles;

import javax.swing.JOptionPane;

public class ListaDoble {
    private NodoDoble primero, ultimo;
    
    public ListaDoble(){
        primero = ultimo = null;
    }
    //Metodo para saber si una lista esta vacia
    public boolean listaVacia(){
        return primero==null;
    }
    
    //Metodo para agregar al final
    public void agregarAlFinal(int inf){
        if(!listaVacia()){
            ultimo = new NodoDoble(inf, null, ultimo);
            ultimo.getAnterior().setSiguiente(ultimo);
        }else{
            primero = ultimo = new NodoDoble(inf);
        }        
    }
    
    //Metodo para agregar al inicio
    public void agregarAlInicio(int inf){
        if(!listaVacia()){
            primero = new NodoDoble(inf, primero, null);
            primero.getSiguiente().setAnterior(primero);
        }else{
            primero = ultimo = new NodoDoble(inf);
        }        
    }
    
    //Metodo para mostrar la lista inicio a fin
    public void mostrarListaInicioFin(){
        if(!listaVacia()){
            String datos = "<=>";
            NodoDoble auxiliar = primero;
            while(auxiliar != null){
                datos = datos + "[" + auxiliar.getInformacion() + "] <=>";
                auxiliar = auxiliar.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, datos,
                    "Mostrando Lista Inicio a Fin",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    //Metodo para mostrar la lista fin a inicio
    public void mostrarListaFinInicio(){
        if(!listaVacia()){
            String datos = "<=>";
            NodoDoble auxiliar = ultimo;
            while(auxiliar != null){
                datos = datos + "[" + auxiliar.getInformacion() + "] <=>";
                auxiliar = auxiliar.getAnterior();
            }
            JOptionPane.showMessageDialog(null, datos,
                    "Mostrando Lista Fin a Inicio",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }
}