import java.util.Scanner;
 class CodeChef {
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc =new Scanner(System.in);
	    int t=sc.nextInt();
	    if( (t<1000) ||(t==1) ){
	    while(t--!=0) {
	    int n=sc.nextInt();
	    int k=sc.nextInt();
	    if( ( (k<=100000)|| (k>=1) )&&( (n>=1) || (n<=100000) ) ) {
	    int ar[]=new int[n];
	    for(int i=0;i<ar.length;i++) {
	    	ar[i]=sc.nextInt();
	    }
	   
	    int[] result=reverse(ar);
	    int jio=search(result,k);
	    if(jio<1000000) {
	    display1(jio);
	    }
	    }
	    }
	    }
		 sc.close();
	}
	
		public static void display1(int c) {
			System.out.println(c);
			System.out.println(" ");
		}
	public static int[] reverse(int[] ar) {
		int temp=0;
		int[] swap=new int[ar.length];
		for(int i=0;i<swap.length;i++) {
			swap[i]=ar[i];
		}
		for(int i=0;i<swap.length-1;i++) {
		for(int j=1;j<swap.length;j++) {
			if(swap[j]>=swap[j-1]) {
				temp=swap[j];
				swap[j]=swap[j-1];
				swap[j-1]=temp;
			}
		}
		}
		return swap;
	}
	public static int search(int[] ar,int k) {
		int[] sorry=new int[ar.length];
		int key=k,count=0;
		for(int i=0;i<sorry.length;i++) {
			sorry[i]=ar[i];
		}
		for(int i=0;i<sorry.length;i++) {
		if (sorry[i]>=sorry[key-1]) {
			count++;
		}
		else {
			break;
		}
		}
		return count;
	}
}