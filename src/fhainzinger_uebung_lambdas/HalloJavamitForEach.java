/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fhainzinger_uebung_lambdas;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author fabia
 */
public class HalloJavamitForEach {
    public static void main(String[] args){
        List<String> lw = new LinkedList<>();
        HalloJavamitForEach main = new HalloJavamitForEach();
        main.fill(lw);
        
        for(int i = 0; i < lw.size(); i++){
            System.out.println(lw.get(i));
        }
        System.out.println();
        System.out.println("-------------------");
        System.out.println();
        lw.forEach(System.out::println);
    }
    
    public void fill(List<String> lw){
        String s = "Oh mei ";
        for(int i = 0; i < 5; i++){
            lw.add(s);
            s = s + "Oh mei ";
        }
    }
}
