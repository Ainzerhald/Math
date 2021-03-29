public class Main {

	public static void main(String[] args) {
		double epsilon = 1e-3;//Точность
		double x1 = 0, x2 = 0, x3 = 0, x4 = 0;//переменные
		double t1 = 0, t2 = 0, t3 = 0, t4 = 0;// предыдущее значение переменной
		int check = 1;
		while(true) {
			x1 = 0.17 * t2 - 0.31 * t3 + 0.16 * t4 - 1.2; // Формула
			x2 = 0.18 * t2 + 0.43 * t3 - 0.08 * t4 + 0.38;
			x3 = 0.22 * t1 + 0.18 * t2 + 0.25 * t3 + 0.07 * t4 + 0.48;
			x4 = 0.08 * t1 + 0.07 * t2 + 0.71 * t3 + 0.04 * t4 - 1.24;
			System.out.println("Итерация №" + check + "\nx1 = " + x1 + " x2 = " + x2 + " x3 = " + x3 + " x4 = " + x4 + "\n");
			if(Math.abs(x1 - t1) < epsilon && Math.abs(x2 - t2) < epsilon && Math.abs(x3 - t3) < epsilon && Math.abs(x4 - t4) < epsilon) {
				break; //условие выхода
			}
			t1 = x1; t2 = x2; t3 = x3; t4 = x4;
			check++;
		}
	}
}