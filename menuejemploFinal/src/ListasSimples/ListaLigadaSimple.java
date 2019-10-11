package ListasSimples;

import javax.swing.JOptionPane;

public class ListaLigadaSimple {
    protected Nodo primero;
    protected Nodo ultimo;
    protected int tamano = 0;
    
    public ListaLigadaSimple(){
        primero = null;
        ultimo = null;
    }
    
    public void insertar(String o) {
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.setInformacion(o);
        if(primero == null){
            primero = nuevoNodo;
            primero.setSiguiente(null);
            ultimo = primero;
            tamano += 1;
        }else{
            ultimo.setSiguiente(nuevoNodo);
            nuevoNodo.setSiguiente(null);
            ultimo = nuevoNodo;
            tamano += 1;
        }
      }

      public String eliminarPrimero() {
        String out = "";
        if (!listaVacia()) {
          out = primero.getInformacion();
          primero = primero.getSiguiente();
            tamano -= 1;
        }
        return out;
      }

      public void imprimirNodo(int n) {
        if (!listaVacia()) {
            if(n <= tamano-1){
                Nodo tmp = primero;
                for (int i = 0; i < n; i++) {
                  tmp = tmp.getSiguiente();
                  if (tmp == null)
                    return;
                }
                JOptionPane.showMessageDialog(null,"El nodo a mostar es: " + tmp.getInformacion());
            }else{                
                JOptionPane.showMessageDialog(null,"El nodo no existe");
            }
        }
      }

      public void imprimirLista() {
        if (!listaVacia()) {
          Nodo tmp = primero;
          while (tmp != null) {
            System.out.println(tmp.getInformacion() + " => ");
            tmp = tmp.getSiguiente();
          }
        }
      }
      
      //Metodo para mostrar la lista inicio a fin
    public void mostrarListaInicioFin(){
        if(!listaVacia()){
            String datos = "";
            Nodo auxiliar = primero;
            while(auxiliar != null){
                datos = datos + "[" + auxiliar.getInformacion() + "] =>";
                auxiliar = auxiliar.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, datos,
                    "Mostrando Lista Inicio a Fin",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

      public boolean listaVacia() {
        if (primero == null)
          return true;
        else
          return false;
      }
}
