
public class Exercise2 {

	public static double rectangle(double sx, double sy, double ex, double ey){
		
		return (ex-sx)*(ey-sy);
	}
    public static double circle(double radius){
		
    	final double PI = 3.14;
    	
		return radius * radius * PI;
	}
	public static void main(String[] args) {
		System.out.println("(0,0)���� (3.4)���� ���콺�� �巡���� �簢���� ������ " + rectangle(0,0,3,4) + " �Դϴ�.");
		System.out.println("���� �������� 3�� �� ���� ������ " + circle(3) + " �Դϴ�.");
	}

}

