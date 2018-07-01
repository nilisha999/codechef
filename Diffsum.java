import java.util.Scanner;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc= new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		if(n1>n2){
		 int s1=n1-n2;
		 System.out.println(s1);
		}
		else{
		    int s2=n1+n2;
		    System.out.println(s2);
		}
	}
}
