package bcs.test;

public class ArithmeticOPTest3 {

	public static void main(String[] args) {
		int a = 10;
		int b = 12;
		System.out.println("(++a + ++a)의 결과는 : " + (++a + ++a));
		System.out.println(a++ - 10);
		System.out.println(a++ - 10);
		System.out.println(a++ - 10);
		System.out.println(a++ - b++);
		System.out.println(a++ - ++b);
		a = 10;
		System.out.println("(++a - ++a)의 결과는 : " + (a++ - a++));
		a = 10;
		System.out.println("(a++ + a++)의 결과는 : " + (a++ + a++));
		a = 10;
		System.out.println("(a++ - a++)의 결과는  : " + (a++ - a++));
		a = 10;
		System.out.println("(++a + a++)의 결과는 : " + (++a + a++));
		a = 10;
		System.out.println("(++a - a++)의 결과는 : " + (++a - a++));
		a = 10;
		System.out.println("(a++ + ++a의 결과는 : " + (a++ + ++a));
		a = 10;
		System.out.println("(a++ - ++a)의 결과는 : " + (a++ - ++a));
		
		
	}

}
