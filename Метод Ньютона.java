
public class Main {

	public static void main(String[] args) {
		double epsilon = 1e-3;//Точность
		double a, b;
		a = 1;//Левая граница отрезка
		b = 2;//Правая граница отрезка
		double prim = 0;
		System.out.println("Формула: cos(x) - x ^ 3 + 2 = 0\nТочность: " + epsilon + "\nИнтервал: [" + a + ", " + b + "]\n");
		int check = 0;
		double x0 = a, x1;
		while(true) {
			check++;
			x1 = x0 - (f(x0) / fp(x0));
			System.out.println("Итерация №" + check + "\n");
			System.out.println("x" + (check - 1) + " = " + x0 + "\nx" + check + " = " + x1 + "\n");
			if(Math.abs(f(x0)) < epsilon) {// условие выхода
				break;
			}
			x0 = x1;
		}
		System.out.println("Ответ: " + x1);
	}
	
	static double f(double x) {
		double result = Math.cos(x) - Math.pow(x, 3) + 2;//Формула
		return result;
	}
	
	static double fp(double x){
		double result = -Math.sin(x) - 3 * Math.pow(x, 2);//производная функции
		return result;
	}
}