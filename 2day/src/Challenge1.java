import java.util.Scanner;

public class Challenge1 {
	public static void main(String agrs[]) {
		System.out.print("1~99 사이의 정수를 입력하시오>>");
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int clapCount = 0;

		if(number < 1 || number >99){
			System.out.println("1~99사이의 정수를 입력받지 않아 종료합니다.");
			return;
		}
		while (number != 0) {
			int temp = number % 10;
			clapCount += (temp == 3 || temp == 6 || temp == 9) ? 1 : 0;
			number /= 10;
		}

		if (clapCount == 0) {
			System.out.println("...");
		} else {
			System.out.print("박수");
			for (int i = 0; i < clapCount; i++) {
				System.out.print("짝");
			}
		}
	}
}


