/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author admin
 */
public class linkedlist {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int c){
            data=c;
            next=null;
        }
    }
    void add(int d){
        Node newnode = new Node(d);
        if(head==null){
            head=new Node(d);
            return;
        }
        Node last=head;
        while(last.next!=null){
            last=last.next;
        }
        last.next=newnode;
        return;
        
    }
    void show(){
        Node last=head;
        while(last!=null){
            System.out.print(last.data +" ");
            last=last.next;
        }
        return;
    }
    void delete(int da){
        Node prev=head;
        Node iterate=head.next;
        if(prev.data==da){
            if(iterate!=null){
                head=iterate;
            }
            else{
                head=null;
            }
        }else{
            while(prev!=null){
               // prev=iterate.next;
                if(iterate.data==da){
                    prev.next=iterate.next;
                    break;
                }
                if(iterate.data==da && iterate.next==null){
                    prev.next=null;
                    break;
                }
                prev=prev.next;
                iterate=iterate.next;
            }
        }
    }
    public static void main(String arg[]){
        Scanner ooo=new Scanner(System.in);
        linkedlist list=new linkedlist();
        for(int i=0;i<10;i++)
        {
            int a=ooo.nextInt();
            list.add(a);
        }
        list.delete(9);
        list.show();
    }
}
