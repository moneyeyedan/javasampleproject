package javaapplication8;
import java.util.*;

public class factorial{
    public static void main(String arg[])
    {
        Scanner ooo=new Scanner(System.in);
        int a=ooo.nextInt();
        pass oo=new pass();
        int t=oo.point(a);
        System.out.print(t);
    }
}
 class pass{
   int point(int s){
        if(s==0)
            return 1;
        else 
            return (s*point(s-1));
            }
}