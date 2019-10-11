package pilas;

import javax.swing.JOptionPane;
import menuejemplofinal.MenuejemploFinal;

public class MenuPilas {
    
    public static void menu() {
        Pila objPila = new Pila();
        int opcion = 0;
        int dato;
           do {            
               try {
                   opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                               "Que operación desea realizar sobre la pila?\n"
                               +"1. Insertar un dato\n"
                               +"2. Mostar el dato de la cima\n"
                               +"3. Revisar si la pila esta vacía\n"
                               +"4. Eliminar el dato de la cima\n"
                               +"5. Limpiar la pila\n"
                               +"6. Volver\n","Menú Pila",
                               JOptionPane.INFORMATION_MESSAGE));
                   switch (opcion){
                       case 1:
                           dato = Integer.parseInt(JOptionPane.showInputDialog(null, "Insertar un dato."));
                           objPila.insertarDato(dato);
                           break;
                       case 2:
                           if(!objPila.pilaVacia()){
                           JOptionPane.showMessageDialog(null, "El dato que esta en la cima es: " + objPila.cimaPila());
                           }else{
                               JOptionPane.showMessageDialog(null, "No hay datos en la pila.",
                                           "Pila Vacia", JOptionPane.INFORMATION_MESSAGE);
                           }                           
                           break;
                       case 3:
                           if(!objPila.pilaVacia()){
                               JOptionPane.showMessageDialog(null, "La pila se encuentra con datos.",
                                           "Pila no esta vacia", JOptionPane.INFORMATION_MESSAGE);
                           }else{
                               JOptionPane.showMessageDialog(null, "No hay datos en la pila.",
                                           "Pila Vacia", JOptionPane.INFORMATION_MESSAGE);
                           }
                           break;
                       case 4:
                           if(!objPila.pilaVacia()){
                                JOptionPane.showMessageDialog(null, "El dato a eliminar es: " + objPila.eliminarDato());
                           }else{
                               JOptionPane.showMessageDialog(null, "No hay datos en la pila.",
                                           "Pila Vacia", JOptionPane.INFORMATION_MESSAGE);
                           }
                           break;
                       case 5:
                           if(!objPila.pilaVacia()){
                           objPila.limpiarPila();
                           JOptionPane.showMessageDialog(null, "La pila se ha limpiado correctamente.");
                           }else{
                               JOptionPane.showMessageDialog(null, "No hay datos en la pila.",
                                           "Pila Vacia", JOptionPane.INFORMATION_MESSAGE);
                           }
                           break;
                       case 6:
                           MenuejemploFinal objFinal = new MenuejemploFinal();
                    MenuejemploFinal.menu();
                           break;
                       default:
                           JOptionPane.showMessageDialog(null, "Seleccionó una opción no valida.",
                                           "Error", JOptionPane.ERROR_MESSAGE);
                           break;                    
                   }            
               } catch (Exception e) {
                   JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
               }
           } while (opcion != 6);
    }
    
}
