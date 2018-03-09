/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wagen;

/**
 *
 * @author UTBIS
 */

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Wagen {

    /**
     * @param args the command line arguments
     */
    
       ArrayList miAL = new ArrayList(); //Array List simple
    
    public static void main(String[] args) {
        Wagen obA = new Wagen();        
        obA.menu();   
    }
    public void menu(){
        String op;
       do{
           op = JOptionPane.showInputDialog(null,"1.  Informacion de auto\n"
                                              +"2.  Modificar auto\n"     
                                              +"3.  Mostrar autos\n"
                                              +"4.  Salir");
 
           switch(op){
 
               case "1"://Bloque para introducir datos al array list                   
                        String a, b, c, d, N;                        
                        a = JOptionPane.showInputDialog(null, "Ingrese el Color del Auto: ");
                        miAL.add(a);
                        b = JOptionPane.showInputDialog(null, "Ingrese el Status del Auto: ");
                        miAL.add(b);    
                        c = JOptionPane.showInputDialog(null, "Ingrese el Nombre del Auto: ");
                        miAL.add(c);    
                        d = JOptionPane.showInputDialog(null, "Ingrese la ID del Auto: ");
                        miAL.add(d);    
                        N = JOptionPane.showInputDialog(null, "Ingrese el Numero de Personas del Auto: ");
                        miAL.add(N);    
                   break;
               case "2"://Bloque para Modificar dato del array                  
                        String A, a1, B, b1, C, c1, D, d1, n, n1;
                        int indice;
                        A = JOptionPane.showInputDialog(null, "Modificar Color: ");
                        if(miAL.contains(A)){
                            indice = miAL.indexOf(A);
                            a1 = JOptionPane.showInputDialog(null, "Ingrese el nuevo Color: ");
                            miAL.set(indice, a1);
                        }else{
                            JOptionPane.showMessageDialog(null, "No existe el dato a modificar !", "", JOptionPane.ERROR_MESSAGE);
                        }
                        B = JOptionPane.showInputDialog(null, "Modificar Status: ");
                        if(miAL.contains(B)){
                            indice = miAL.indexOf(B);
                            b1 = JOptionPane.showInputDialog(null, "Ingrese el nuevo Status: ");
                            miAL.set(indice, b1);
                        }else{
                            JOptionPane.showMessageDialog(null, "No existe el dato a modificar !", "", JOptionPane.ERROR_MESSAGE);
                        }
                        C = JOptionPane.showInputDialog(null, "Modificar Nombre: ");
                        if(miAL.contains(C)){
                            indice = miAL.indexOf(C);
                            c1 = JOptionPane.showInputDialog(null, "Ingrese el nuevo Nombre: ");
                            miAL.set(indice, c1);
                        }else{
                            JOptionPane.showMessageDialog(null, "No existe el dato a modificar !", "", JOptionPane.ERROR_MESSAGE);
                        }
                        D = JOptionPane.showInputDialog(null, "Modificar ID: ");
                        if(miAL.contains(D)){
                            indice = miAL.indexOf(D);
                            d1 = JOptionPane.showInputDialog(null, "Ingrese el nuevo ID: ");
                            miAL.set(indice, d1);
                        }else{
                            JOptionPane.showMessageDialog(null, "No existe el dato a modificar !", "", JOptionPane.ERROR_MESSAGE);
                        }
                        n = JOptionPane.showInputDialog(null, "Modificar Numero de Personas: ");
                        if(miAL.contains(n)){
                            indice = miAL.indexOf(n);
                            n1 = JOptionPane.showInputDialog(null, "Ingrese el nuevo Numero de Personas: ");
                            miAL.set(indice, n1);
                        }else{
                            JOptionPane.showMessageDialog(null, "No existe el dato a modificar !", "", JOptionPane.ERROR_MESSAGE);
                        }
                   break;
               case "3"://Bloque para mostar los datos del array list
 
 
                       String Salida= "";
                       for( int i = 0 ; i  < miAL.size(); i++){
                        Salida += "Numero posicion "+i+" : "+miAL.get(i)+"\n"; 
                       }
                        JOptionPane.showMessageDialog(null, Salida);                                   
                   break;                   
               case "4":
                   System.exit(0);
                   break;
               default:
                   JOptionPane.showMessageDialog(null, "Opcion invalida !");
                   break;
           }      
       }while(!op.equals("6"));
    }    
}