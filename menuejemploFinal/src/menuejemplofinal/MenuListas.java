package menuejemplofinal;

import ListasSimples.EjemploListas;
import listasDobles.EjemploDoble;
import javax.swing.JOptionPane;


public class MenuListas {
    
    public static void menu(){
        int opcion=0;
        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una opción valida: \n"
                    + "1. Listas Simples.\n"
                    + "2. Listas Dobles.\n"
                    + "3. Volver"));
            switch(opcion){
                case 1:
                    EjemploListas objListasSimples = new EjemploListas();
                    objListasSimples.menu();
                    break;
                case 2:
                    EjemploDoble objListasDobles = new EjemploDoble();
                    objListasDobles.menu();
                    break;
                case 3:
                    MenuejemploFinal objFinal = new MenuejemploFinal();
                    objFinal.menu();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción No Valida");
                    break;
            }
            
        }while(opcion != 3);
    }
}
    

