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
public class W_additionoperator {
    public static void main(String arg[])
    {
        Scanner ooo=new Scanner(System.in);
        int a=ooo.nextInt();
        int b=ooo.nextInt();
        for(int i=0;i<b;i++)
            a=a+1;
        System.out.print(a);
    }
    
}
