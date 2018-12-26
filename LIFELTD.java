import java.util.Scanner;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		System.out.println("no. of test cases is "+T);
		while(T--!=0){
		    char[][] ARRAY=new char[3][3];
		    for(int i=0;i<3;i++){
		         String S=sc.next();
		         ARRAY[i][0]=S.charAt(0);
		        ARRAY[i][1]=S.charAt(1);
		         ARRAY[i][2]=S.charAt(2);
		    }    
		    if(ARRAY[0][0]=='l' && ARRAY[1][0]=='l' && ARRAY[1][1]=='l'){
		        System.out.println("yes");
		    }
		    else{
		        System.out.println("no.");
		    }
		}
	}
}
