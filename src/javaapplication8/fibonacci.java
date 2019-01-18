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
public class fibonacci {
    public static void main(String arg[])
    {
        Scanner ooo=new Scanner(System.in);
        int a=ooo.nextInt();
        int i=1,j=0;
        while(j<a)
        {
            System.out.println(j);
            int t=j;
            j=i+t;
            i=t;
        }
    }
    
}
