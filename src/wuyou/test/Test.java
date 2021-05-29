package wuyou.test;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main (String args[]){
        List lis=new ArrayList();
        lis.add("1");
        lis.add("2");
        lis.add("3");
        lis.add("4");
        lis.add("2");
        for(int i=0;i<2;i++)
            System.out.println(i);
//            lis.remove(i);
        for(Object s : lis)
            System.out.print(s + " ");
    }
}
