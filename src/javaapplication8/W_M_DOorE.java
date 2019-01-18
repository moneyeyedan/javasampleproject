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
public class W_M_DOorE {
    public static void main(String arg[])
    {
        Scanner ooo=new Scanner(System.in);
        int a=ooo.nextInt();
        String aa[]={"even","odd"};
        while(a>1)
        {
            a=a-2;
        }
        System.out.print(aa[a]);
    }
    
}
