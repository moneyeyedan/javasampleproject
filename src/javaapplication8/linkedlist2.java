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
public class linkedlist2 {
    Nose head;
    class Nose{
        int data;
        Nose next;
        Nose(int value){
            data=value;
            next=null;
        }
    }
    void insertlast(int d1){
        Nose newnode = new Nose(d1);
        if(head==null){
            head=new Nose(d1);
            return;
        }
        Nose last=head;
        while(last.next!=null){
            last=last.next;
        }
        last.next=newnode;
        return;
    }
    void inserthead(int d1){
        Nose newnode = new Nose(d1);
        if(head==null){
            head = new Nose (d1);
            return;
        }
        newnode.next = head;
        head = newnode;
    }
    void show(){
        Nose last=head;
        while(last!=null){
            System.out.println(last.data);
            last=last.next;
        }
        
    }
    public static void main(String a[])
    {
        linkedlist2 list = new linkedlist2();
        list.insertlast(1);
        list.insertlast(5);
        list.inserthead(10);
        list.show();
    }
    
}
