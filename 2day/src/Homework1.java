import java.util.Scanner;

public class Homework1 {
	public static void main(String agrs[]){
		Scanner in = new Scanner(System.in);
		int a, b, c;
		int max;
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		
		max = ((a>b)?((a>c)?a:((b>c)?b:c)):((b>c)?b:c));
		System.out.println(max);
		if(max < (a + b + c - max)){
			System.out.println("삼각형을 만들 수 있음");
		}
		else{
			System.out.println("삼각형을 만들 수 없음");
		}
	}
}
