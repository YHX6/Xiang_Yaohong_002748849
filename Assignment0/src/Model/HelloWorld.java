/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Arrays;

/**
 *
 * @author xyh10
 */
public class HelloWorld {
    public static void main(String[] args) {
        int var1 = 123;
        String var2 = "123";
        boolean var3 = false;
        char var4 = 'x';
        double var5 = 1.23;
        float var6 = 3.1f;
        
        int[] arr = new int[10];
        
        System.out.println("int variable: " + var1);
        System.out.println("String variable: " + var2);
        System.out.println("boolean variable: " + var3);
        System.out.println("char variable: " + var4);
        System.out.println("double variable: " + var5);
        System.out.println("float variable: " + var6);
        System.out.println("array variable: " + Arrays.toString(arr));
    }
    
}
