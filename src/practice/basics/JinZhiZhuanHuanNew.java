package practice.basics;

import java.util.Scanner;

public class JinZhiZhuanHuanNew {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        String num[] = new String[n];
        int numZhuan[] = new int[n];
        for(int i=0;i<n;i++){
            num[i] = sca.next();
            numZhuan[i] = zhuanHuan(num[i]);
        }

        int flag = 0;
        for(int i=0;i<n;i++){
            changeBase8(numZhuan[i]);
            if(flag < n-1){
                System.out.println("");
            }
            flag++;
        }
    }

    /**
     * 十六进制转十进制
     */
    private static int zhuanHuan(String str) {
        String numStr = "";
        int re = 0;
        char charStr[] = str.toCharArray();
//        System.out.println(charStr.length);
        for(int i=0,j=charStr.length-1;i<charStr.length;i++,j--){
            if(charStr[i] >= 'A' && charStr[i] <= 'F'){
                switch (charStr[i]){
                    case 'A':
                        numStr = "10";
                        break;
                    case 'B':
                        numStr = "11";
                        break;
                    case 'C':
                        numStr = "12";
                        break;
                    case 'D':
                        numStr = "13";
                        break;
                    case 'E':
                        numStr = "14";
                        break;
                    case 'F':
                        numStr = "15";
                        break;
                }
                re += Math.pow(16,j) * Integer.parseInt(numStr);
//                System.out.println("j = "+ j + ",Math.pow(16,j) = "+ Math.pow(16,j) +",re = " + re + ",Integer.parseInt(numStr) = " +Integer.parseInt(numStr));
            }else{
                re += Math.pow(16,j) * Integer.parseInt(String.valueOf(charStr[i]));
//                System.out.println("charStr[i] = " + charStr[i]);
            }
        }
        return re;
    }

    /**
     * 十进制转二进制
     * */
    public static void changeBase2(Integer i){
        System.out.println(Integer.toBinaryString(i));
    }

    /**
     * 十进制转八进制
     * */
    public static void changeBase8(Integer i){
        System.out.print(Integer.toOctalString(i));
    }

    /**
     * 十进制转十六进制
     * */
    public static void changeBase16(Integer i){
        System.out.println(Integer.toHexString(i));
    }
}
