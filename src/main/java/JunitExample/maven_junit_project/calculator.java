package JunitExample.maven_junit_project;

public class calculator {

	public int add(int... a) {
		int sum = 0;
		for (int i : a) {
			sum += i;
		}
		
		return sum;
	}

	public static void main(String[] args) {
		calculator calculator = new calculator();
		int result = calculator.add(1, 2, 3);
		System.out.println(result);
	}
}
