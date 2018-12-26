import java.util.Scanner;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        if(t==1 ||t<=10){
        while(t--!=0){
        int e=0;
        int flag=1;
        int n=sc.nextInt();
        if(n==1 || n<=100000){
        int[] a=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
            for(int i=0;i<a.length;i++){
                if(e==0&&a[i]==0){
                    flag=0;
                    break;
                }
                if(a[i]==1){
                    e++;
                }
                else if(a[i]==0){
                    e--;
                }
            }
                if(flag==1){
                    System.out.println("Valid");
                }
                else{
                    System.out.println("Invalid");
                }
                System.out.println();
                }
            }
        }
    }
}
