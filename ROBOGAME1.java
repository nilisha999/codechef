import java.util.Scanner;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
    	int t=sc.nextInt();
    	if((t==1)||(t<=30000)){
    while(t--!=0){
        StringBuilder str=new StringBuilder(sc.next());
        boolean collides=true;
     for(int i=0;i<str.length();i++){
        if( (str.charAt(i)!='.') && (str.charAt(i)!='t') )
            {
        	int a2=Integer.parseInt(""+str.charAt(i));
        	int LR=i-a2;
        	int RR=i+a2;
        	if(LR<0)
        	    LR=0;
        	if(RR>=str.length())
        	    RR=str.length()-1;
        	for(int j=LR;j<=RR;j++){
        	    if(j==i)
        	        continue;
        	    if(str.charAt(j)!='.'){
        	        collides=false;
        	        break;
        	    }
        	    else{
        	        str.setCharAt(j,'t');
        	    }
        	}
            }
     if(!collides)
         break;
     }
     if(collides){
         System.out.println("safe");
     }
     else{
         System.out.println("unsafe");
     }
    }
    	}
    }
}