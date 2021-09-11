package week2.day1;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "MADAM";
		String rev = "";
		
		
		for (int i=(str.length())-1; i>=0;i--) { 
			
			rev = rev+str.charAt(i);	
			System.out.println("The reversed String is: "+rev);
		}
		if (rev.equalsIgnoreCase(str)) {
			System.out.println("The String is a Palindrome");
		}else {
			System.out.println("The String is not a Palindrome");
		}
		
			
		
	}

}
