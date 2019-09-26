/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fhainzinger_uebung_lambdas;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fabia
 */
public class NumberTester {
    private NumberTest oddTester;
    private NumberTest primeTester;
    private NumberTest palindromeTester;
    private String fileName;
    public NumberTester(String fileName) {
        this.fileName = fileName;
    }
    
    
    public void setOddEventTester(NumberTest oddTester) 
    {
        this.oddTester = oddTester;
    }
    
    public void setPrimeTester(NumberTest primeTester)
    {
        this.primeTester = primeTester;
    }
    public void setPalindromeTester(NumberTest palindromeTester)
    {
        this.palindromeTester = palindromeTester;
    }
    
    public void testFile() {
        try(FileReader reader = new FileReader(fileName);
                BufferedReader br = new BufferedReader(reader))
        {
            System.out.println("File wird gelesen ...");
            int anzahl = Integer.parseInt(br.readLine());
            for(int i = 0; i < anzahl; i++){
                String s = br.readLine();
                String[] arr = s.split(" ");
                switch (Integer.parseInt(arr[0])) {
                    case 1:
                        if(oddTester.testNumber(Integer.parseInt(arr[1])) == true){
                            System.out.println("ODD");
                        }
                        else{
                            System.out.println("EVEN");
                        }
                        break;
                    case 2:
                        if(primeTester.testNumber(Integer.parseInt(arr[1])) == true){
                            System.out.println("PRIME");
                        }
                        else{
                            System.out.println("NO PRIME");
                        }
                        break;
                    case 3:
                        if(palindromeTester.testNumber(Integer.parseInt(arr[1])) == true){
                            System.out.println("PALINDROME");
                        }
                        else{
                            System.out.println("NO PALINDROME");
                        }
                        break;
                    default:
                        break;
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(NumberTester.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(NumberTester.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
