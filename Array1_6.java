package kunalplusStrver.arrays;

import java.util.Arrays;

public class Array1_6 {

	public static void main(String[] args) {
		int[][] ar = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
		setZeroes(ar);
		display(ar);
		int nums[]= {2,2,0,4,3,1};
		nextPermutation(nums);

	}

	public static void setZeroes(int[][] matrix) {
		int row[]=new int[matrix.length];
		 int col[]=new int[matrix[0].length];
		 for(int i=0;i<matrix.length;i++)
		 {
			 for(int j=0;j<matrix[0].length;j++)
			 {
				 if(matrix[i][j]==0){
				 row[i]=1;
				 col[j]=1;
				 }
			 }
		 }
		 for(int i=0;i<matrix.length;i++)
		 {
			 for(int j=0;j<matrix[0].length;j++)
			 {
				 if(row[i]==1||col[j]==1)
				 {
					 matrix[i][j]=0;
				 }
			 }
		 }
	}

	public static void display(int x[][]) {
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[0].length;j++)
			{
				System.out.print(x[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	   public static void nextPermutation(int[] nums) {
	       int b=0;
	       int i=nums.length-1;
	       while(i>0)
	       {
	           if(nums[i]>nums[i-1])
	           {
	                b=i-1;
	                break;
	           }
	           i--;
	       } 
	       // 127653-> 2 ->137652 expected 1,3,2,5,6,7
	       boolean flag=true;
	        i=nums.length-1;
	       while(i>0)
	       {
	           if(nums[i]>nums[b])
	           {
	               int temp=nums[i];
	               nums[i]=nums[b];
	               nums[b]=temp;
	               flag=false;
	                swap(b+1,nums);
	                break;
	           }
	           i--;
	       }
	       if(flag)
	       {
	           swap(0,nums);
	       }
	    }
	    public static void swap(int str,int ar[])
	    {
	        int end=ar.length-1;
	        while(str<=end)
	        {
	            int temp=ar[str];
	            ar[str]=ar[end];
	            ar[end]=temp;
	            str++;
	            end--;
	        }
	    }
	}

