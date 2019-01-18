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
public class swap_w_uing_temporay {
    public static void main(String arg[])
    {
        Scanner ooo=new Scanner(System.in);
        int a=ooo.nextInt();
        int b=ooo.nextInt();
        System.out.println("before swap"+a+"and"+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.print("after swap"+a +"and"+b);
    }
    
}
