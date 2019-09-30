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
    
    static RationalCalculator rc;
    static VectorCalculator vc;
    static ComplexCalculator cc;
    
    public static void main(String[] args) {
        
        CalculationOperation add = (a, b)
                -> {
            Number n = new Number();
            n.setA(a.getA() * b.getB() + a.getB() * b.getA());
            n.setB(a.getB() * b.getB());
            return n;
        };
        CalculationOperation subtract = (a, b)
                -> {
            Number n = new Number();
            n.setA(a.getA() * b.getB() - a.getB() * b.getA());
            n.setB(a.getB() * b.getB());
            return n;
        };
        CalculationOperation multiply = (a, b)
                -> {
            Number n = new Number();
            n.setA(a.getA() * b.getB() * a.getB() * b.getA());
            n.setB(a.getB() * b.getB());
            return n;
        };
        CalculationOperation divide = (a, b)
                -> {
            Number n = new Number();
            n.setA(a.getA() * b.getB() / a.getB() * b.getA());
            n.setB(a.getB() * b.getB());
            return n;
        };
        
        CalculationOperation vadd = (a, b)
                -> {
            Number n = new Number();
            n.setA(a.getA() + b.getA());
            n.setB(a.getB() + b.getB());
            return n;
        };
        CalculationOperation vsubtract = (a, b)
                -> {
            Number n = new Number();
            n.setA(a.getA() - b.getA());
            n.setB(a.getB() - b.getB());
            return n;
        };
        CalculationOperation vmultiply = (a, b)
                -> {
            Number n = new Number();
            n.setA(a.getA() * b.getB());
            n.setA(a.getB() * b.getA());
            return n;
        };
        CalculationOperation vdivide = (a, b)
                -> {
            Number n = new Number();
            double num = a.getA() - a.getB();
            n.setA(b.getA() * num);
            n.setB(b.getB() * num);
            return n;
        };
        
        CalculationOperation cadd = (a, b)
                -> {
            Number n = new Number();
            n.setA(a.getA() + b.getA());
            n.setB(a.getB() + b.getB());
            return n;
        };
        CalculationOperation csubtract = (a, b)
                -> {
            Number n = new Number();
            n.setA(a.getA() - b.getA());
            n.setB((a.getB() - b.getB()) * Math.sqrt(-1));
            return n;
        };
        CalculationOperation cmultiply = (a, b)
                -> {
            Number n = new Number();
            n.setA(a.getA() * b.getA() - a.getB() * b.getB());
            n.setB(a.getA() * b.getB() + (a.getB() + b.getA()) * Math.sqrt(-1));
            return n;
        };
        CalculationOperation cdivide = (a, b)
                -> {
            Number n = new Number();
            return n;
        };
        rc = new RationalCalculator(add, subtract, multiply, divide);
        vc = new VectorCalculator(vadd, vsubtract, vmultiply, vdivide);
        cc = new ComplexCalculator(cadd, csubtract, cmultiply, cdivide);
        ////////////////////////////////////////////////////////////////////        
        
        CalculatorMain main = new CalculatorMain();
        int auswahl;
        Scanner s = new Scanner(System.in);
        s.useDelimiter("\n");
        do {
            System.out.println("Choose calculator:");
            System.out.println("1 - Relational calculator");
            System.out.println("2 - Vector calculator");
            System.out.println("3 - Complex calculator");
            System.out.println("4 - Exit program");
            auswahl = s.nextInt();
            main.zahlEingeben(auswahl);
            
        } while (auswahl != 4);
        
    }
    
    public void zahlEingeben(int calculatorNumber) {
        Scanner s = new Scanner(System.in);
        s.useDelimiter("\n");
        
        System.out.println("Enter number x a");
        double xa = s.nextInt();
        System.out.println("Enter number x b");
        double xb = s.nextInt();
        System.out.println("Enter number y a");
        double ya = s.nextInt();
        System.out.println("Enter number y b");
        double yb = s.nextInt();
        
        Number a = new Number();
        Number b = new Number();
        a.setA(xa);
        a.setB(xb);
        b.setA(ya);
        b.setB(yb);
        
        System.out.println("Choose operation");
        System.out.println("1 - add");
        System.out.println("2 - subtract");
        System.out.println("3 - multiply");
        System.out.println("4 - divide");
        System.out.println("5 - enter numbers again");
        int operation = s.nextInt();
        
        Number output;
        switch (calculatorNumber) {
            case 1:
                switch (operation) {
                    case 1:
                        output = rc.add(a, b);
                        System.out.println("a = " + output.getA());
                        System.out.println("b = " + output.getB());
                        break;
                    case 2:
                        output = rc.subtract(a, b);
                        System.out.println("a = " + output.getA());
                        System.out.println("b = " + output.getB());
                        break;
                    case 3:
                        output = rc.multiply(a, b);
                        System.out.println("a = " + output.getA());
                        System.out.println("b = " + output.getB());
                        break;
                    case 4:
                        output = rc.divide(a, b);
                        System.out.println("a = " + output.getA());
                        System.out.println("b = " + output.getB());
                        break;
                    case 5:
                        zahlEingeben(calculatorNumber);
                        break;
                }
                break;
            case 2:
                switch (operation) {
                    case 1:
                        output = vc.add(a, b);
                        System.out.println("a = " + output.getA());
                        System.out.println("b = " + output.getB());
                        break;
                    case 2:
                        output = vc.subtract(a, b);
                        System.out.println("a = " + output.getA());
                        System.out.println("b = " + output.getB());
                        break;
                    case 3:
                        output = vc.multiply(a, b);
                        System.out.println("a = " + output.getA());
                        System.out.println("b = " + output.getB());
                        break;
                    case 4:
                        output = vc.divide(a, b);
                        System.out.println("a = " + output.getA());
                        System.out.println("b = " + output.getB());
                        break;
                    case 5:
                        zahlEingeben(calculatorNumber);
                        break;
                }
                break;
            case 3:
                switch (operation) {
                    case 1:
                        output = cc.add(a, b);
                        System.out.println("a = " + output.getA());
                        System.out.println("b = " + output.getB());
                        break;
                    case 2:
                        output = cc.subtract(a, b);
                        System.out.println("a = " + output.getA());
                        System.out.println("b = " + output.getB());
                        break;
                    case 3:
                        output = cc.multiply(a, b);
                        System.out.println("a = " + output.getA());
                        System.out.println("b = " + output.getB());
                        break;
                    case 4:
                        output = cc.divide(a, b);
                        System.out.println("a = " + output.getA());
                        System.out.println("b = " + output.getB());
                        break;
                    case 5:
                        zahlEingeben(calculatorNumber);
                        break;
                }
                break;
            case 4:
                System.exit(0);
                break;
        }
    }
}
