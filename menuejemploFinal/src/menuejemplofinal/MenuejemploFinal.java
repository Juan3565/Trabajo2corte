
package menuejemplofinal;

import javax.swing.JOptionPane;
import pilas.MenuPilas;
import colas.MenuColas;


public class MenuejemploFinal {

   
    public static void main(String[] args) {
        menu();
    }
    
    public static void menu(){
        int opcion=0;
        do{
          try{
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una opción valida: \n"
                    + "1. Ordenamientos.\n"
                    + "2. Listas\n"
                    + "3. Pilas\n"
                    + "4. Colas\n"
                    + "5. Salir"));
            switch(opcion){
                case 1:
                    Ordenamientos objOrdenamiento = new Ordenamientos();
                    Ordenamientos.menu();
                    break;
                case 2:
                    MenuListas objMenuListas = new MenuListas();
                    MenuListas.menu();
                    break;
                case 3:
                    MenuPilas objpilas = new MenuPilas();
                    objpilas.menu();
                    break;
                case 4:
                    MenuColas objcolas = new MenuColas();
                    objcolas.menu();
                    break;
                case 5:
                    System.exit(0); 
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción No Valida");
                    break;
            }
          }catch (Exception e) {
                   JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
          }
        }while(opcion != 7);
    }
    
}
