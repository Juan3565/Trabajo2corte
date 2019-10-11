package colas;

import javax.swing.JOptionPane;
import menuejemplofinal.MenuejemploFinal;

public class MenuColas {
    
    public static void menu() {
        Cola objCola = new Cola();
        int opcion = 0;
        int dato;
           do {            
               try {
                   opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                               "Que operación desea realizar sobre la cola?\n"
                               +"1. Insertar un dato\n"
                               +"2. Mostar el dato que esta al inicio\n"
                               +"3. Revisar si la cola esta vacía\n"
                               +"4. Eliminar el dato del incio\n"
                               +"5. Limpiar la cola\n"
                               +"6. Volver\n","Menú Cola",
                               JOptionPane.INFORMATION_MESSAGE));
                   switch (opcion){
                       case 1:
                           dato = Integer.parseInt(JOptionPane.showInputDialog(null, "Insertar un dato."));
                           objCola.insertarDato(dato);
                           break;
                       case 2:
                           if(!objCola.colaVacia()){
                           JOptionPane.showMessageDialog(null, "El dato que esta al inicio es: " + objCola.frenteCola());
                           }else{
                               JOptionPane.showMessageDialog(null, "No hay datos en la cola.",
                                           "Cola Vacia", JOptionPane.INFORMATION_MESSAGE);
                           }                           
                           break;
                       case 3:
                           if(!objCola.colaVacia()){
                               JOptionPane.showMessageDialog(null, "La cola se encuentra con datos.",
                                           "Cola no esta vacia", JOptionPane.INFORMATION_MESSAGE);
                           }else{
                               JOptionPane.showMessageDialog(null, "No hay datos en la cola.",
                                           "Cola Vacia", JOptionPane.INFORMATION_MESSAGE);
                           }
                           break;
                       case 4:
                           if(!objCola.colaVacia()){
                                JOptionPane.showMessageDialog(null, "El dato a eliminar es: " + objCola.eliminarDato());
                           }else{
                               JOptionPane.showMessageDialog(null, "No hay datos en la cola.",
                                           "Cola Vacia", JOptionPane.INFORMATION_MESSAGE);
                           }
                           break;
                       case 5:
                           if(!objCola.colaVacia()){
                           objCola.limpiarCola();
                           JOptionPane.showMessageDialog(null, "La cola se ha limpiado correctamente.");
                           }else{
                               JOptionPane.showMessageDialog(null, "No hay datos en la cola.",
                                           "Cola Vacia", JOptionPane.INFORMATION_MESSAGE);
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
