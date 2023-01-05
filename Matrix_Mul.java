package java_programs;

import java.util.Scanner;

public class Matrix_Mul {

	public static void main(String[] args) {
		int row1,col1,row2,col2;
		int matrix1[][];
		int matrix2[][];
		int res_matrix[][];
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter rows of first matrix");
		row1=sc.nextInt();
		System.out.println("Enter columnss of first matrix");
		col1=sc.nextInt();
		
		System.out.println("Enter rows of second matrix");
		row2=sc.nextInt();
		System.out.println("Enter columnss of second matrix");
		col2=sc.nextInt();
		
		matrix1=new int[row1][col1];
		matrix2=new int[row2][col2];
		res_matrix=new int[col1][row2];
		
		for(int i=0;i<row1;i++)
		{
			for(int j=0;j<col1;j++)
			{
				System.out.println("Enter element of "+i+" row "+j+" column");
				matrix1[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<row2;i++)
		{
			for(int j=0;j<col2;j++)
			{
				System.out.println("Enter element of "+i+" row "+j+" column");
				matrix2[i][j]=sc.nextInt();
			}
		}
		
		if(col1==row2)
		{
			for(int i=0;i<row1;i++)
			{
				for(int j=0;j<col2;j++)
				{
					//System.out.println("Enter element of "+i+" row "+j+" column");
					res_matrix[i][j]=matrix1[i][j]*matrix2[i][j];
				}
			}
			
			for(int i=0;i<row1;i++)
			{
				for(int j=0;j<col2;j++)
				{
					//System.out.println("Enter element of "+i+" row "+j+" column");
					System.out.print(res_matrix[i][j]+" ");
				}
				System.out.println();
			}
		}
		
		else
			System.out.println("Matrixes are not compatible to multiply");

	}

}
