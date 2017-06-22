
public class Exercise1 {
	public static int max(int n, int m){
		if(n>m)
			return n;
		else
			return m;
	}
	public static double max(double n, double m){
		if(n>m)
			return n;
		else
			return m;
	}
	public static void main(String agrs[])
	{
		System.out.println("4와 3 중  큰 수는 " + max(4,3) + "입니다. 5.5와 5.2 중 큰 수는 " + max(5.5, 5.2) + " 입니다.");
	}
}

