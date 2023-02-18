package arrays;

public class command_line {
	
	public static void main(String... args ) // it will  also act has one dim string array only
	
	{
		for (String s:args) 
		{
		  int n = Integer.parseInt(s);
		  System.out.println(n); 
		
		}
	}

}
