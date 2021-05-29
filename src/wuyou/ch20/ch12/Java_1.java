package wuyou.ch20.ch12;//*********Found**********
public class Java_1{
    public static void main(String[] args){
        int []a = {1,2,3,4,5,6,7,8};
        int []b = {0,1,2,3,4,5,6,7};
        int []c = new int[8];
        int s=0;
        
        //*********Found**********
        for(int i=0;i<a.length;i++)
            c[i]=a[i]+b[i];
        for(int j=c.length-1;j>=0;j--)
            //*********Found**********
            s=s+c[j];
        //*********Found**********
        System.out.println("s="+s);
    }
}