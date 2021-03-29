
public class Main {

	public static void main(String[] args) {
		double epsilon = 1e-2;//Точность
		double a, b, c;
		a = -10;//Левая граница отрезка
		b = 10;//Правая граница отрезка
		double prim;
		System.out.println("Формула: cos(x) - x ^ 3 + 2 = 0\nТочность: " + epsilon + "\nИнтервал: [" + a + ", " + b + "]\n");
		int check = 0;
		while(b - a > epsilon) {
			check++;
			System.out.println("Итерация №" + check + "\n");
			c = (a + b)/2;//Середина отрезка
			prim = f(b) * f(c);
			System.out.println("Отрезок [" + a + ", " + b +"]\nСередина отрезка: " + c + "\nРезультат:" + prim + "\n");
			if(prim < 0) {//Передвижение границ отрезка
				a = c;
			}
			else {
				b = c;
			}
		}
		System.out.println("Ответ: " + (a + b) / 2);
	}
	
	static double f(double x) {
		double result = Math.cos(x) - Math.pow(x, 3) + 2;//Формула
		return result;
	}

}