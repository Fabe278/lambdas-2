/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fhainzinger_uebung_lambdas;

/**
 *
 * @author fabia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NumberTester asdf = new NumberTester("aufgabe3.txt");

        asdf.setOddEventTester(number -> {
            return number % 2 != 0;
        });

        asdf.setPrimeTester(number -> {
            if (number <= 1) {
                return false;
            }
            for (int i = 2; i < Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        });
        
        asdf.setPalindromeTester(number -> 
        {
            String test = String.valueOf(number);
            String reversetest = "";
            for(int i = test.length() -1; i >= 0; i--){
                reversetest = reversetest + test.charAt(i);
            }
            return test.equals(reversetest);
        });
    }

}
