package stringprograms;

public class CountCharString {

	//countcharoccurrenceinString
	
	public static void main(String[] args) {
		
		String s= "i love coding" ;
		
		CountCharString.CountChar(s, 'l');
	}
	
	
		public static int CountChar(String str, Character val)
		{
			int count=0;
			
			for(char ch :str.toCharArray())
			{
				//System.out.println(ch);
				if(ch==val)
				{
					count++;
				}
			}
			System.out.println(count);
			return count;
			
		}
}
