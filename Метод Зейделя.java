
public class Main {

	public static void main(String[] args){
		double epsilon = 1e-3;//Точность
		double x1 = 0, x2 = 0, x3 = 0;
		double t1 = 0, t2 = 0, t3 = 0;
		int check = 1;
		while(true) {
			x1 = (6.3 + 7.3 * x2 - 4.8 * x3) / 6.5; // формула
			x2 = (4.5 - 2.8 * x1 + 3.2 * x3) / 3.8;// наибольшие коэффициенты по диагонали
			x3 = (7.1 - 2.5 * x1 + 2.8 * x2) / 3.3;
			System.out.println("Итерация № " + check + "\nx1 = " + x1 + " x2 = " + x2 + " x3 = " + x3 + "\n");
			if(Math.abs(x1 - t1) < epsilon || Math.abs(x2 - t2) < epsilon || Math.abs(x3 - t3) < epsilon) {
				break;
			}
			t1 = x1; t2 = x2; t3 = x3;
			check++;
		}
	}
}