import java.util.Scanner;

public class Homework2 {

	public static double triangle(double x1, double y1, double x2, double y2, double x3, double y3){
		
		double temp = ((x1*y2 + x2*y3 + x3*y1) - (x2*y1 + x3*y2 + x1*y3));
		
		if(temp < 0)
			temp = -temp;
		
		return 0.5 * temp;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double arr[] = new double[6];
		
		for(int i=0; i<5; i++){
			arr[i] = in.nextDouble();
		}
		
		System.out.println("삼각형의 면적은 " + triangle(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5]) + " 입니다.");
	}

}
