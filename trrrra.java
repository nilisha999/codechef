import java.util.Scanner;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int n=sc.nextInt();
		int [][]a=new int[n][n];
		for(int i=0;i<a.length;i++){
		    for(int j=0;j<a.length;j++){
		        a[i][j]=sc.nextInt();
		    }
		}
	int r=n-1;
	int sum=0;
	int sum1=0;
	int i=0;
	int j;
	int temp;
	int [][]B=new int[r][r];
	while(i<r){
	    for(i=0;i<r;i++){
	        for( i=0;i<B.length;i++){
	            for( j=0;j<B.length;j++){
	                B[i][j]=a[i][j];
	                        System.out.print(B[i][j]+" ");
	                    if( i== j){
	                       sum+=B[i][j];
	                     }
	           }
	                System.out.println();
	        }
	    }
	}
	             System.out.println(" SUM IS: "+sum);
	             temp=sum;
	             int summ=0;
	             int sumq=0;
	             for( j=0;j<n;j++){
	                 for( i=0;i<n;i++){
	                      summ+=a[i][j];
	                 }
	             
	             System.out.println(" new sum is: "+summ);
	             B[0][j]=summ;
	             for( i=1;i<n-r+1;i++){
	                 sumq+=a[i+r-1][j]-a[i-1][j];
	                 System.out.println("sumq is: "+sumq);
	                 B[i][j]=sumq;
	                 System.out.println("sumq is: "+B[i][j]);
	             }
	             }
	}
}

