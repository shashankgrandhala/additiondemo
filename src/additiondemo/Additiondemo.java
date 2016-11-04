/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package additiondemo;

import java.util.Scanner;

/**
 *
 * @author Shashank
 */
public class Additiondemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,x,c;
        System.out.println("Enter two numbers");
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        x = in.nextInt();
        c = a+x;
        System.out.println("Sum of numbers ="+c);
        
    }
    
}
