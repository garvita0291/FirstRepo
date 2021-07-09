package stringprograms;

public class CapitalinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1= "New WoRld";
		
		CapitalinString.Capsletter(s1);
	}
	
	public static String Capsletter(String s)
	
	{
		String str= s;
		
		for (int i=0; i<=str.length();i++)
		{
			if (str.charAt(i)>='A' && str.charAt(i)<='Z')
			{
				System.out.print(str.charAt(i));
			}
		}
			
		
		return  str;
	}

}
