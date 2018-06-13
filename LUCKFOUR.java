import java.util.Scanner;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		  	int  a=sc.nextInt();
		  	int count=0;
	        while(a>0){
	            
                if(a%10==4){
		            count++;
		        }
		        a=a/10;
	        }
	  		System.out.println(count);

		}
	}
}
