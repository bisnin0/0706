package bcs.test;

public class ConversionTest {

	public static void main(String[] args) {
		int value1 = Integer.parseInt("10");
		// 괄호 안에 있는 스트링을 정수형으로 변환시켜라 integer.p 이거 자주씀
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");

		System.out.println("value1: " + value1);
		System.out.println("value2: " + value2);
		System.out.println("value3: " + value3);

		String str1 = String.valueOf(10);
		// 괄호 안에 있는 정수형을 스트링으로 변환
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf(true);

		System.out.println("str1: " + str1);
		System.out.println("str2: " + str2);
		System.out.println("str3: " + str3);
		
		// 정렬키 = 컨트롤 + 쉬프트 + F
		
		 

	}

}
