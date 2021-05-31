package niuke;

/**
 * 子数组的最大累加和问题
 * 描述
 * 给定一个数组arr，返回子数组的最大累加和
 * 例如，arr = [1, -2, 3, 5, -2, 6, -1]，所有子数组中，[3, 5, -2, 6]可以累加出最大的和12，所以返回12.
 * 题目保证没有全为负数的数据
 * [要求]
 * 时间复杂度为O(n)O(n)，空间复杂度为O(1)O(1)
 *
 * 示例1
 * 输入：
 * [1, -2, 3, 5, -2, 6, -1]
 * 复制
 * 返回值：
 * 12
 */

public class NC19_ArrayMaxAdd {
    public static void main(String[] args) {
        int arr[] = new int[]{1, -2, 3, 5, -2, 6, -1};
        int re = maxsumofSubarray(arr);
        System.out.println(re);
    }

    public static int maxsumofSubarray (int[] arr) {
        int sum = 0;
        for(int i=1;i<arr.length;i++){
            if(sum+arr[i] > arr[i]){
                sum += arr[i];
            }else{
                sum = arr[i];
            }
        }

        return sum;


//        if(arr.length==0||arr==null)
//            return 0;
//        int sum=arr[0];
//        int len=arr.length;
//        for(int i=1;i<len;i++){
//            if(sum+arr[i]>arr[i])
//                sum=sum+arr[i];
//            else
//                sum=arr[i];
//        }
//        return sum;
    }

}
