package ListasSimples;

import javax.swing.JOptionPane;
import menuejemplofinal.MenuListas;

public class EjemploListas {

    public static void menu(){
        ListaLigadaSimple listaSimple = new ListaLigadaSimple();
     int opcion = 0, nodoMostrar;
     String elemento;
        do {            
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Que operación desea realizar?\n"
                            +"1. Insertar un Nodo\n"
                            +"2. Mostar toda la lista\n"
                            +"3. Ver tamaño de la lista\n"
                            +"4. Limpiar toda la lista\n"
                            +"5. Mostrar un nodo de la lista\n"
                            +"6. Eliminar un nodo\n"
                            +"7. Volver\n","Menú Listas",
                            JOptionPane.INFORMATION_MESSAGE));
                switch (opcion){
                    case 1:
                        elemento = JOptionPane.showInputDialog(null, "Insertar un Nodo.");
                        listaSimple.insertar(elemento);
                        break;
                        
                    case 2:
                        if(!listaSimple.listaVacia()){
                            listaSimple.mostrarListaInicioFin();
                        }else{
                            JOptionPane.showMessageDialog(null, "No hay nodos en la lista",
                                        "Lista Vacia", JOptionPane.ERROR_MESSAGE);
                        }
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, listaSimple.tamano);
                        break;
                    case 4:
                        //"4. Limpiar toda la lista";
                        break;
                    case 5:
                        if(!listaSimple.listaVacia()){
                            nodoMostrar = Integer.parseInt(JOptionPane.showInputDialog("¿Que nodo desea mostrar?"));
                            listaSimple.imprimirNodo(nodoMostrar);
                        }else{
                            JOptionPane.showMessageDialog(null, "No hay nodos en la lista",
                                        "Lista Vacia", JOptionPane.ERROR_MESSAGE);
                        }
                        break;
                    case 6:
                        if(!listaSimple.listaVacia()){
                            elemento = listaSimple.eliminarPrimero();
                        JOptionPane.showMessageDialog(null, "El nodo a eliminar es: " + elemento,
                                        "Lista Vacia", JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(null, "No hay nodos en la lista",
                                        "Lista Vacia", JOptionPane.ERROR_MESSAGE);
                        }                        
                        break;
                    case 7:
                        MenuListas objListas = new MenuListas();
                    MenuListas.menu();
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Seleccionó una opción no valida.",
                                        "Error", JOptionPane.ERROR_MESSAGE);
                        break;                    
                }            
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            }
        } while (opcion != 7);
    }
}

