public class Main {
	
	static double a = 4.5;
	static double X[] = {2, 4, 6};
	static double Y[] = X;

	public static void main(String[] args){
		for(int i = 0; i < X.length; i++) {
			System.out.print("x" + i + " = " + X[i]); 
			if(i + 1 == X.length) {
				System.out.print("\n");
			}
			else {
				System.out.print(" ");
			}
		}
		for(int i = 0; i < Y.length; i++) {
			Y[i] = f(X[i]);
			System.out.print("y" + i + " = " + Y[i]);
			if(i + 1 == Y.length) {
				System.out.print("\n");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println("f(a) = " + f(a) + "\nP(a) = " + L(a));
		System.out.println("Погрешность " + (L(a) - f(a)));
	}
	
	public static double f(double x) {
		double result = Math.pow(Math.log(x), (double)(11/5)); // формула
		return result;
	}
	
	public static double L(double x) {
		double result = 0;
		for(int i = 0; i < X.length; i++) {
			double P = 1;
			for(int j = 0; j < X.length; j++) {
				if(i != j) {
					P *= (x - X[j]) / (X[i] - X[j]); // вычисление полинома Лагранжа
				}
			}
			result += Y[i] * P;
		}
		return result;
	}
}