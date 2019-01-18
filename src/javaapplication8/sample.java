/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

/**
 *
 * @author admin
 */
import java.util.*;
public class sample {
    public static void main(String arg[]){
//        String name;
//        String na[] =new String[1];
//        Scanner ooo=new Scanner(System.in);
//        name=ooo.nextLine();
//        na=name.split(" ");
//        System.out.println(na[0]);
//        // System.out.println(na[1]);
//         int a=Integer.parseInt(na[0]) ;
//         System.out.println(a/100);
//          System.out.println(na.length);
//          
//     
     Scanner ooo=new Scanner(System.in);
        int monthcode[] = {0,3,3,6,1,4,6,2,5,0,3,5};
        int yearcode[]={6,4,2,0};
        int year,jj=0,limit=12,con=0;
        String monyr[]=new String[1];
        String monthname[]={"january","february","march","april","may","june","july","august","septamber","october","november","desember"};
        String monthyear=ooo.nextLine();
        monyr=monthyear.split(" ");
        if(monyr.length==2){
            year=Integer.parseInt(monyr[0]);
            for(String a:monthname){
                if(a.equals(monyr[1]) )
                 System.out.println(a);
            }
        }
                
//        Scanner ooo=new Scanner(System.in);
//        name[0]=ooo.nextLine();
    }
    
}
