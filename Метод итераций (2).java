
public class Main {

	public static void main(String[] args) {
		double epsilon = 1e-3;//��������
		double a, b;
		a = 1;//����� ������� �������
		b = 2;//������ ������� �������
		double prim = 0;
		System.out.println("�������: cos(x) - x ^ 3 + 2 = 0\n��������: " + epsilon + "\n��������: [" + a + ", " + b + "]\n");
		int check = 0;
		double x, x0 = a;
		while(true) {
			check++;
			x = fp(x0);
			System.out.println("�������� �" + check + "\n");
			System.out.println("x = " + x + "\nf(x) = " + f(x0) + "\n");
			if(Math.abs(f(x)) < epsilon) {// ������� ������
				break;
			}
			x0 = x;
		}
		System.out.println("�����: " + x);
	}
	
	static double f(double x) {
		double result = Math.cos(x) - Math.pow(x, 3) + 2;//�������
		return result;
	}
	
	static double fp(double x){
		double result = x + 0.2603 * (Math.cos(x) - Math.pow(x, 3) + 2);//����������� �������
		return result;
	}
}