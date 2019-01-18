/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;
import java.util.*;

/**
 *
 * @author admin
 */
public class oddoreven {
    public static void main(String arg[])
    {
        Scanner ooo=new Scanner(System.in);
        int a=ooo.nextInt();
        if(a%2==0)
            System.out.print("It is even");
        else
            System.out.print("It is Odd");
    }
    
}
