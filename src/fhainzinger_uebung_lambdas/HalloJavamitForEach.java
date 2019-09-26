/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fhainzinger_uebung_lambdas;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author fabia
 */
public class HalloJavamitForEach {
    public static void main(String[] args) {
        List<String> liste = Arrays.asList("\nSelam ", "alejkum!");
        for(String string : liste){
            System.out.print(string);
        }
        
        liste.forEach((String s) -> System.out.print(s + " "));
        liste.forEach(System.out::print);
    }    
}
