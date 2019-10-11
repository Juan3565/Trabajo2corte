/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuejemplofinal;

import javax.swing.JOptionPane;

/**
 *
 * @author CSM PORTATIL 1
 */
public class Ordenamientos {
    
    public static void menu(){
        int opcion=0;
        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una opción valida: \n"
                    + "1. Ordenamiento Burbuja.\n"
                    + "2. Ordenamiento SHELL\n"
                    + "3. Volver"));
            switch(opcion){
                case 1:
                    burbuja();
                    break;
                case 2:
                    Shell();
                    break;
                case 3:
                    MenuejemploFinal objFinal = new MenuejemploFinal();
                    MenuejemploFinal.menu();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción No Valida");
                    break;
            }
            
        }while(opcion != 9);
    }
    
    public static void burbuja(){
        int lista[] = {3,2,1};
        System.out.print("Lista desordenada: ");
        imprimirLista(lista);
        ordenarB(lista);

        System.out.print("Lista ordenada: ");
        imprimirLista(lista);
    }
    
    public static void ordenarB(int [] A){
        int i, j, aux;
        for(i= 0; i < A.length - 1; i++){
            for(j= 0; j < A.length - i - 1; j++){
                if(A[j + 1] < A[j]){
                   aux= A[j + 1];
                   A[j+1]= A[j];
                   A[j]= aux;
                }
            }
        }
    }
    
    public static void imprimirLista(int[] arreglo){
        for(int i = 0; i < arreglo.length;i++){
            System.out.print(arreglo[i]+",");
        }
        System.out.println();
   }
    public static void Shell(){
    int lista[] = {5,4,3,2,1};
        System.out.print("Lista desordenada: ");
        imprimirLista(lista);
        ordenacionShell(lista);

        System.out.print("Lista ordenada: ");
        imprimirLista(lista);
    }
    
    public static void ordenacionShell(int a[])
    {
        int intervalo, i, j, k;
        int n= a.length;
        intervalo = n / 2;
        while (intervalo > 0){
            for (i = intervalo; i < n; i++){
                j = i - intervalo;
                while (j >= 0){
                    k = j + intervalo;
                    if (a[j] <= a[k]){
                        j = -1; // par de elementos ordenado
                    }else{
                        intercambiar(a, j, j+1);
                        j -= intervalo;
                    }
                }
            }
            intervalo = intervalo / 2;
        }
    }
  
    public static void intercambiar(int []a, int i, int j)
    {
        int aux = a[i];
        a[i] = a[j];
        a[j]= aux ;
    }
    
   
    }
