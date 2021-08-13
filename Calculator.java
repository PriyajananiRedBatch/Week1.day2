package week1.day2;

public class Calculator {
	int num1 = 5, num2 = 2, num3 = 3, sum, sub;
	double n1=1000.99, n2=100.22, mul;
	float m1 = 15.0f, m2=3.0f, div;
	
	public int add() {
		sum = num1+num2+num3;
		System.out.println("Sum of the given numbers is: " + sum );
		return sum;
	}
	
	public int sub() {
		sub = num1-num2;
		System.out.println("Difference between two numbers is: " + sub);
		return sub;
	}

	public double mul() {
		mul=n1*n2;
		System.out.println("Product of the numbers taken is: " + mul);
		return mul;
	}
	
	public float div() {
		div = m1/m2;
		System.out.println("The quotient after division of two numbers taken is: " + div);
		return div;
	}
	
	
	
	//public static void main(String[] args) {
	//Calculator calc = new Calculator();
	//calc.add(); 
	//calc.sub();
	//calc.mul();
	//calc.div();
}
}
