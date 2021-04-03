package demo17;
public class Example1 {
	 int add(int a, int b) {
		return (a+b);
	 }
	 int add(int a, int b, int c) {
			return(a+b+c);
		}
public static void main(String[] args) {
	Example1 ex = new Example1();
	int x = ex.add(3, 5);
	int y = ex.add(6, 4, 9);
	System.out.println("Addition of 2 parameters: "+x);
	System.out.println("Addition of 3 parameters: "+y);
	//System.out.println(Addition.add(2,4));
	//System.out.println(Addition.add(3,9,8));
}
}
/*class Addition{
	static int add(int a, int b, int c) {
		return(a+b+c);
	}
		static int add(int a, int b) {
			return (a+b);
			 }	
}*/