package selenium.qualiteam;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		String enterText;
		String reverse="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the text or number to be checked for Pallindrome Condition");
		enterText=sc.nextLine();
		for(int i=enterText.length()-1;i>=0;i--) {
			reverse=reverse+ enterText.charAt(i);
		}
		if(enterText.equals(reverse)) {
			System.out.println("Pallindrome");
			}
		else
			System.out.println("Not Pallindrome");
	}

    
	}

