package bcs.test;

public class ArithmeticOPTest3 {

	public static void main(String[] args) {
		int a = 10;
		int b = 12;
		System.out.println("(++a + ++a)�� ����� : " + (++a + ++a));
		System.out.println(a++ - 10);
		System.out.println(a++ - 10);
		System.out.println(a++ - 10);
		System.out.println(a++ - b++);
		System.out.println(a++ - ++b);
		a = 10;
		System.out.println("(++a - ++a)�� ����� : " + (a++ - a++));
		a = 10;
		System.out.println("(a++ + a++)�� ����� : " + (a++ + a++));
		a = 10;
		System.out.println("(a++ - a++)�� �����  : " + (a++ - a++));
		a = 10;
		System.out.println("(++a + a++)�� ����� : " + (++a + a++));
		a = 10;
		System.out.println("(++a - a++)�� ����� : " + (++a - a++));
		a = 10;
		System.out.println("(a++ + ++a�� ����� : " + (a++ + ++a));
		a = 10;
		System.out.println("(a++ - ++a)�� ����� : " + (a++ - ++a));
		
		
	}

}
