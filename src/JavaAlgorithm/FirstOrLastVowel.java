package JavaAlgorithm;



public class FirstOrLastVowel {
	
	
	// Return "yes" if the first letter or last letter of the string is a vowel [ aeiouAEIOU ]. 
	// Return "no" if the string does not start or end with a vowel.
	

	public static void main(String[] args) {
		
		String str = "This is a string!";
		System.out.println(go(str));
	
		

	}

	public static String go(String str) {
		String vowels = "aeiouAEIOU";
		
		int pos1 = vowels.indexOf(str.substring(0, 1));
		int pos2 = vowels.indexOf(str.substring(str.length()-1));
		
		if(pos1>-1 || pos2>-1)
			return "yes";
		else
			return "no";
	}
	
	
}
