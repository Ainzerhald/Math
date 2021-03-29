
public class Main {

	public static void main(String[] args) {
		double epsilon = 1e-3;//Точность
		double a, b;
		a = 1;//Левая граница отрезка
		b = 2;//Правая граница отрезка
		double prim = 0;
		System.out.println("Формула: cos(x) - x ^ 3 + 2 = 0\nТочность: " + epsilon + "\nИнтервал: [" + a + ", " + b + "]\n");
		int check = 0;
		double x, x0 = a;
		while(true) {
			check++;
			x = fp(x0);
			System.out.println("Итерация №" + check + "\n");
			System.out.println("x = " + x + "\nf(x) = " + f(x0) + "\n");
			if(Math.abs(f(x)) < epsilon) {// условие выхода
				break;
			}
			x0 = x;
		}
		System.out.println("Ответ: " + x);
	}
	
	static double f(double x) {
		double result = Math.cos(x) - Math.pow(x, 3) + 2;//Формула
		return result;
	}
	
	static double fp(double x){
		double result = x + 0.2603 * (Math.cos(x) - Math.pow(x, 3) + 2);//производная функции
		return result;
	}
}