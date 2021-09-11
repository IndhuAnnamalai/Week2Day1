package week2.day1;

public class FindTypesProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "$$ Welcome to 2nd Class of Automation $$";
		char check;
		int letter=0,space=0, 	num = 0, spclChar = 0;
		char[] charArray = str.toCharArray();
		for (int i=0;i<charArray.length;i++) {
			check= charArray[i];
			if(Character.isLetter(check)) {
				letter = letter +1;
			}else if (Character.isDigit(check)) {
				num = num+1;
			}else if (Character.isSpaceChar(check)) {
				space = space+1;
			}else {
				spclChar = spclChar+1;
			}
			
		}
		System.out.println("The letter count is : " + letter);
		System.out.println("The space count is " + space);
		System.out.println("The number count is " + num);
		System.out.println("The special character count is " + spclChar);
		
		}

}
