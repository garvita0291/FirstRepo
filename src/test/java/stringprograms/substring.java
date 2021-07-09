package stringprograms;

public class substring {

	public static void main(String[] args) {
		
		
		String s= "selenium is a good tool";
		
		String s1="good";
	
		/*
		 * System.out.println(s.substring(1));
		 * 
		 * System.out.println(s.substring(2, 12));
		 * 
		 * System.out.println(s.subSequence(3, 10));
		 * 
		 * System.out.println(s.contains(s1));
		 * 
		 * System.out.println(s.lastIndexOf('g'));
		 * 
		 * System.out.println(s.lastIndexOf('l'));
		 */
		
		System.out.println(substring.FindString(s, s1));
		
		}

	public static boolean FindString(String main, String sub)
	{
		if (main.contains(sub)==true)
		{
			System.out.println(main.lastIndexOf(sub));
		
		      for(int i=3;i>=0;i--)
		         {
			           System.out.print(sub.charAt(i));
		         }
		}
		System.out.println("");
		return true;
		
		//return main.contains(sub);
		
	}
	
	
}
