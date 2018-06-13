import java.util.Scanner;
import java.io.*;
import java.lang.*;
class ClassLoader{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<10000000;i++){
            int a=sc.nextInt();
            if(a==42){
                break;
            }
            else{
                System.out.println (a);
            }
        }
    }
    
}