
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
		System.out.println("4�� 3 ��  ū ���� " + max(4,3) + "�Դϴ�. 5.5�� 5.2 �� ū ���� " + max(5.5, 5.2) + " �Դϴ�.");
	}
}

