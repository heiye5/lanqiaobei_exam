package wuyou.ch20.ch19;

public class Java_1 {

    public static void main(String[] args) {
        int []a = {5,9,2,8,7};
        int max = 0;
        int k = 0,t ;
        for(int i=0;i<5;i++){
          //*********Found********
            if (a[i]%2==0 && max < a[i]){
                max = a[i];
          //*********Found********
                k = i;
            }
        }
        t = a[0];
        a[0] = a[k];
        a[k] = t;
        //*********Found********
        for(int i=0;i<a.length;i++)
            System.out.print(a[i] + "  ");
    }
}