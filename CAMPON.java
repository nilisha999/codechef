import java.util.Scanner;
import java.util.Arrays;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t--!=0){
    	    int d=sc.nextInt();
    	    int[][] a=new int[d][2];
    	    for(int i=0;i<a.length;i++){
    	        for(int j=0;j<2;j++){
    	            a[i][j]=sc.nextInt();
    	        }
    	    }
        	    int q=sc.nextInt();
        	    int[][] b=new int[q][2];
                for(int i=0;i<b.length;i++){
                    for(int j=0;j<2;j++){
        	            b[i][j]=sc.nextInt();
                    }
                }   
                int di=0,pi=0,deadi=0,reqi=0,total=0,flag=0,temp=0;
                int day[]=new int[31];
                for(int i=0;i<31;i++)
                    Arrays.fill(day,0+i+1);
                        for(int i=0;i<q;i++){
                             reqi=b[i][1];
                             deadi=b[i][0];
                    for( i=0;i<a.length;i++){
                            di=a[i][0];
                            if(deadi>=di-1){
                                break;
                            }
                    }  
                    if(deadi<di){
                        System.out.println("Go Sleep");
                    }
                    else if(deadi>di){
                        temp=gi(a,14);
                        for(i=0;i<=temp;i++){
                                total +=a[i][1];
                            }
                        }
                    if(total>=reqi)
        	           System.out.println("Go Camp");
	            }
	    }
	}
	    public static int gi(int[][] a1,int k){
	        int k1=0;
	        for(int i=0;i<a1.length;i++){
	            if(a1[i][0]==k){
	            k1=i;    
	            break;
	            }
	        }
	        return k1;
	    }
}