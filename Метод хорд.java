
public class Main {

	public static void main(String[] args) {
		double epsilon = 1e-3;//��������
		double a, b;
		a = 1;//����� ������� �������
		b = 2;//������ ������� �������
		System.out.println("�������: cos(x) - x ^ 3 + 2 = 0\n��������: " + epsilon + "\n��������: [" + a + ", " + b + "]\n");
		int check = 0;
		while(true/*Math.abs(b - a) > epsilon*/) {
			check++;
			a = b - (b - a) * f(b) / (f(b) - f(a));
			b = a - (a - b) * f(a) / (f(a) - f(b));
			System.out.println("�������� �" + check + "\n");
			System.out.println("a = " + a + "\nb = " + b + "\n");
		}
		//System.out.println("�����: " + b);
	}
	
	static double f(double x) {
		double result = Math.cos(x) - Math.pow(x, 3) + 2;//�������
		return result;
	}
}