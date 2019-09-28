/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fhainzinger_uebung_lambdas;

import java.util.Scanner;

/**
 *
 * @author fabia
 */
public class CalculatorMain {
    public static void main(String[] args){
        int auswahl;
        Scanner s = new Scanner(System.in);
        s.useDelimiter("\n");
        do{
            System.out.println("Choose calculator:");
            System.out.println("1 - Relational calculator");
            System.out.println("2 - Vector calculator");
            System.out.println("3 - Complex calculator");
            System.out.println("4 - Exit program");
            auswahl = s.nextInt();
            System.out.println("Enter number x a");
            int xa = s.nextInt();
            System.out.println("Enter number x b");
            int xb = s.nextInt();
            System.out.println("Enter number y a");
            int ya = s.nextInt();
            System.out.println("Enter number y b");
            int yb = s.nextInt();
            System.out.println("Choose operation");
            System.out.println("1 - add");
            System.out.println("2 - subtract");
            System.out.println("3 - multiply");
            System.out.println("4 - divide");
            System.out.println("5 - enter numbers again");
            int operation = s.nextInt();
                    
        }while(auswahl!=4);
    }
}
