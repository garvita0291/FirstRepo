package stringprograms;

public class reverseaString {

	public static void main(String[] args) {
		
		
		String s= "selenium";
        
		String s1= "Selenium";
		
		/*System.out.println(s.equals(s1));
		
		System.out.println(s.equalsIgnoreCase(s1));
		
		System.out.println(s.compareTo(s1));
		
		System.out.println(s.hashCode());
		
		System.out.println(s.hashCode());
	
	  System.out.println( s.charAt(4));
	  */
	  System.out.println(s.length());
	  
	  
	  //print string
	  for(int i=0;i<=s.length()-1;i++)
		  
	  {
		  System.out.print( s.charAt(i));
		    
	  }
	  
	  System.out.println("");
	  
	  //print reverse string using for loop
	  for(int i=7;i>=0;i--)
	  
	  {
		  System.out.print( s.charAt(i));
		  
	  }
	  System.out.println("");
		 //  reverse using string buffer
	  
	  StringBuffer sb = new StringBuffer(s);
	  
	           System.out.println("using string buffer class :-" +sb.reverse());
	
	}
	

}
