package stringprograms;

public class duplicatechar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String chekstring ="world is good world";
		
		duplicatechar.findduplicate(chekstring);

	}
///learn  this 
	
	
	public static String findduplicate(String s)
	
	{
		String str =s;
		
		for(int i=0; i<=str.length();i++)
		{
			if(str.charAt(i)==str.charAt(i-1))
			{
				System.out.println(str.charAt(i));
			}
		}
		
		return str;
	}
}
