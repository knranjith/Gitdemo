package basics;

  public class Identifier{

	public static void main(String[]args)
	{
		int number = 10; // java  identifiers are case sensitive
		int Number =20;
		int NumBer =30;
		System.out.println(number);
		System.out.println(Number);
		System.out.println(NumBer);

	}
	
}
  
  class identifier1{
	  
	  public static void main(String[]args)
	  {
		  int x = 10;
		 //int  if = 20; //we can't use reserved words as idtenfiers
		  System.out.println(x);
		  
		  int String =888; //we can use pre-defined class as identifiers
		   System.out.println(String);
		  
		  
		  int Runnable = 999; // we can use pre-defined interface name as identifier
		  System.out.println(Runnable);
		  
	  }
	  
  }
