/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gustavoteste;

import java.util.Scanner;

/**
 *
 * @author Gusta
 */
public class Gustavoteste {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);
                
       
           // TODO code application logic here
           
       for (int i = 0; i <= 5; i++) {
            System.out.println("nome");
            String name = input.next();
            
            if( name == "-1") {
                break;
            }
        
            System.out.println("Nota: 1");
            int n1 = input.nextInt();

            System.out.print("nota 2");
            int n2 = input.nextInt();

            int media = (n1 * 2 + n2 * 3) / 5;


            System.out.println(media);
       }
    }
}
