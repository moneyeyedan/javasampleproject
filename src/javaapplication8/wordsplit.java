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
public class wordsplit {
    public static void main(String arc[])
    {
        Scanner ooo=new Scanner(System.in);
        int a=ooo.nextInt();
        String s[]=new String[a];
        String ss[][]=new String[a][];
        for(int i=0;i<3;i++){//doubt for this for loop counting
            s[i]=ooo.nextLine();
            ss[i]=s[i].split(" ");
            }
        for(int j=0;j<a;j++)
        {
          for(int k=ss[j].length;k>0;k--)
          {
             // System.out.print(k);
              System.out.print(ss[j][k-1]+" ");
          }
          System.out.println();
        }
        
        
        
    }
    
}
