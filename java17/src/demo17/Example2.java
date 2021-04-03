package demo17;

class Multiplication{
	int mul(int a, int b, int c) {
		return a*b*c;
	}
}
class Multiply extends Multiplication{
	int mul(int a, int b, int c) {
		return a*b*c;
}
}
public class Example2 {
public static void main(String[] args) {
	Multiply m1 = new Multiply();
	int s =m1.mul(2, 3, 4);
	System.out.println("multiplication: "+s);	
}
}
