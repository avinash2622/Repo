package ques;

public class Array5 {

	public static void main(String as[])
	{
		int [][]array2d = new int [2][2];
		int [][][]array3d = new int [2][2][2];
		array2d[0][0] = 0;
		array2d[0][1]= 1;
		array2d[1][0]= 2;
		array2d[1][1]= 3;
		
		array3d[0][0][0]=30;
		array3d[0][0][1]=31;
		array3d[0][1][0]=32;
		array3d[0][1][1]=33;
		array3d[1][0][0]=34;
		array3d[1][0][1]=35;
		array3d[1][1][0]=36;
		array3d[1][1][1]=37;
		
		System.out.println(array2d);
		System.out.println(array3d);
		
		
	}
}
