
package listasDobles;

import javax.swing.JOptionPane;
import menuejemplofinal.MenuListas;
public class EjemploDoble {

    
    public static void menu(){
     ListaDoble listaDoble = new ListaDoble();
     int opcion = 0, elemento;
        do {            
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Que operación desea realizar?\n"
                            +"1. Agregar un Nodo al Inicio\n"
                            +"2. Agregar un nodo al final\n"
                            +"3. Mostrar la lista de inicio a fin\n"
                            +"4. Mostrar la lista de fin a inicio\n"
                            +"5. Volver\n","Menu de Opciones",
                            JOptionPane.INFORMATION_MESSAGE));
                switch (opcion){
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Agregando nodo al inicio."));
                        listaDoble.agregarAlInicio(elemento);
                        break;
                        
                    case 2:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Agregando nodo al final."));
                        listaDoble.agregarAlFinal(elemento);
                        break;
                    case 3:
                        if(!listaDoble.listaVacia()){
                            listaDoble.mostrarListaInicioFin();
                        }else{
                            JOptionPane.showMessageDialog(null, "No hay nodos en la lista",
                                        "Lista Vacia", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 4:
                        if(!listaDoble.listaVacia()){
                            listaDoble.mostrarListaFinInicio();
                        }else{
                            JOptionPane.showMessageDialog(null, "No hay nodos en la lista",
                                        "Lista Vacia", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 5:
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
        } while (opcion != 5);
    }

   
        
 }

