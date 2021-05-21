package ch_2014_b;

/**
 * 标题：猜字母
 *
 * 把abcd...s共19个字母组成的序列重复拼接106次，得到长度为2014的串。
 *
 *
 *     接下来删除第1个字母（即开头的字母a），以及第3个，第5个等所有奇数位置的字母。
 *
 *
 *     得到的新串再进行删除奇数位置字母的动作。如此下去，最后只剩下一个字母，请写出该字母。
 *
 *  
 *
 * 答案是一个小写字母，请通过浏览器提交答案。不要填写任何多余的内容。
 *
 */

public class CaiZiMu {
    public static void main(String[] args) {
        char arr[] = new char[2014];
        int index = 0;
        for(int j=0;j<106;j++){
            for(int i=0;i<19;i++){
                arr[index++] = (char)('a' + i);
            }
        }

        int len =2014;
        while(len != 1){
            int k=0;
            for(int i=1;i<len;i+=2){
                arr[k++] = arr[i];
            }
            len = k;
        }

        System.out.println(arr[0]);
    }
}
