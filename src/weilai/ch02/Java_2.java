package weilai.ch02;

public class Java_2
{
    public static void main(String[] args) {
        int[][] aMatrix = {{1,1,1,1,1},{2,2,2,2,2},{3,3,3,3,3},{4,4,4,4,4}};
		int i = 0; //ѭ������
		int j = 0; //ѭ������
        //print matrix
        for (i = 0; i < aMatrix.length; i++) {
   //*********Found********
	       for ( j = 0; j < aMatrix[0].length; j++) {
   //*********Found********
	        System.out.print(aMatrix[i][j] + " ");
	       }
	    System.out.println();
        }
    }
}
