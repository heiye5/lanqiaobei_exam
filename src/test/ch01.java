package test;

public class ch01 {
    public static void main(String[] args) {
        int s;
        for(int i=10;i<19;i++){
            s = 0;
            System.out.println("i = " + i + " ");
            for(int j=2;j<i;j++){
                if(i%j==0){
                    s = s+j;
                    System.out.println("j = " + j + ",s = " + s);
                }
            }
            System.out.println("");
            if(s > i){
                System.out.println("re = " + i);
            }
        }
    }
}
