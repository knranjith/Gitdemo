package arrays;

public class Array2 {

	public static void main(String[]args)
	{  
	      // one dim array declaration
		int[] x;
		int  []y;
		int  z[];
		// two dim array decalration
		int [][] a;
		int []  []b;
		int     [][]c;
		int     d[][];
		int    []e[];
		// anothere way two dim array declaration 
		 int []   []f,g;   // f=2 ,g=2
		 int []  i[],j[];   //i=2,j=2
		 int[]   []k,l[];  //k=2,l=3
		 int[]  m,n;     //m=1,n==1
		 
		 //int []  []o,[]p;   //dim before varibale can be written only for 1st variable
		 
		
		int[] r=new int[3];
		System.out.println(r.getClass().getName());
		
		// int [6] h; //at the time of array declaration should not specify size
	 //	int []h = new int[]; //at the time of creation we should specify the size
		int []h =new int[6];
		
		System.out.println(args.length) ;
		
		int []q = new int[-3];
		System.out.println(q);
		
		
		
		
		
	}
	
	
}
