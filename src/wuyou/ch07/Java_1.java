package wuyou.ch07;

import java.io.*;
public class Java_1{
   public static void main(String[] args) {
      int[] anArray;   //声明一个整数型数组
      //*********Found**********
      anArray = new int [10];   //创建一个整数数组对象s
      //*********Found**********
      for (int i = 0; i < anArray.length;i++) {  //对数组中每个元素赋值并显示
         anArray[i] = i;
         //*********Found**********
         System.out.print(anArray[i]+ " ");
      }
      System.out.println();
   }
}
