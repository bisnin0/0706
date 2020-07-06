package bcs.test;

public class Printftest {

	public static void main(String[] args) {
		int value = 123;
		System.out.printf("상품의 가격:%d원\n", value);
		//포맷을 지정해서 출력한다. %d, %6d등이 있는데 %d라는건 10진수 정수로 표현하는것이다. "가 끝나고 값을 넣을때 10진수 정수값 출력
		//%6d면 6자리 10진수 = 출력값이 3자리면 앞 3자리 공백으로 출력
		//%-6d면 출력값이 3자리일때  뒤 3자리를 공백으로 하고 앞에 표기
		
		System.out.printf("상품의 가격:%6d원\n", value);
		System.out.printf("상품의 가격:%-6d원\n", value);
		System.out.printf("상품의 가격:%06d원\n", value);
		
		double area = 3.12159 * 10 * 10;
		System.out.printf("반지름이 %d인 원의 넓이:%10.2f\n", 10, area);
		//%10.2f 소수점 아래 2자리까지만 표기
		
		String name = "홍길동";
		String job = "도적";
		System.out.printf("%6d | %-10s | %10s\n", 1, name, job);
		//s는 스트링. 홍길동 쓰고 뒤에 7자리. 도적 앞에 8자리
		
		
	}

}
