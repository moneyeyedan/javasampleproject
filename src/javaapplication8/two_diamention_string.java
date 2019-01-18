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
public class two_diamention_string {
    public static void main(String arg[]){
        Scanner ooo=new Scanner(System.in);
        String a[]=new String[5];
        for(int i=0;i<3;i++){
            a[i]=ooo.nextLine();
        }
        for(int i=0;i<a.length;i++)
        System.out.print(a[i]);
    }
}
