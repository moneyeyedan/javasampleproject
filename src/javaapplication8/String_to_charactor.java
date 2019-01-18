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
public class String_to_charactor {
    public static void main(String arg[]){
        String name="manikandan";
        char Name[]=name.toCharArray();
        for(char a:Name){
         System.out.println(a);    
        }
         System.out.println(Name.length);
    }
    
}
