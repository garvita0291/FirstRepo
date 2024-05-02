package PractiseStringManipulation;
/* Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
Output: true
Explanation:
word1 represents string "ab" + "c" -> "abc"
word2 represents string "a" + "bc" -> "abc"
The strings are the same, so return true.*/
public class CheckIfTwoStringArraysareEquivalent {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String	arr[]= { "ab" , "c"};
	String	arr1[]= { "a" , "bc"};
	
		CheckIfTwoStringArraysareEquivalent obj = new CheckIfTwoStringArraysareEquivalent();
	boolean res=	obj.CheckIfTwoStringArraysareEquivalent(arr, arr1);
	System.out.println(res);
		
	}
	


	
	public boolean CheckIfTwoStringArraysareEquivalent(String[] arr, String [] arr1)
	{
        String str1="",str2="";
        
        for(String s:arr){
            str1+=s;
           
        }
        System.out.println(str1);
        for(String s:arr1){
            str2+=s;
            
        }
        System.out.println(str2);
        
        return str1.equals(str2);
    }
}
