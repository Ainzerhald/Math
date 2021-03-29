
public class Main {

	public static void main(String[] args) {
		double epsilon = 1e-2;//��������
		double a, b, c;
		a = -10;//����� ������� �������
		b = 10;//������ ������� �������
		double prim;
		System.out.println("�������: cos(x) - x ^ 3 + 2 = 0\n��������: " + epsilon + "\n��������: [" + a + ", " + b + "]\n");
		int check = 0;
		while(b - a > epsilon) {
			check++;
			System.out.println("�������� �" + check + "\n");
			c = (a + b)/2;//�������� �������
			prim = f(b) * f(c);
			System.out.println("������� [" + a + ", " + b +"]\n�������� �������: " + c + "\n���������:" + prim + "\n");
			if(prim < 0) {//������������ ������ �������
				a = c;
			}
			else {
				b = c;
			}
		}
		System.out.println("�����: " + (a + b) / 2);
	}
	
	static double f(double x) {
		double result = Math.cos(x) - Math.pow(x, 3) + 2;//�������
		return result;
	}

}