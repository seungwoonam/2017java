import java.util.Scanner;

public class Exercise3 {

	public static boolean isAlphabet(char temp){
		if((temp >= 'A' && temp <= 'Z') || (temp >= 'a' && temp <='z'))
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		char input = scanner.next().charAt(0); 
		if(isAlphabet(input)==false)
			System.out.println("영문자가 아닙니다.");
		else {
			if(Character.isUpperCase(input))
				input = Character.toLowerCase(input);
			
			System.out.println(input);
		}
	}

}


