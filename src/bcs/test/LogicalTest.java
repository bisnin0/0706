package bcs.test;

public class LogicalTest {

	public static void main(String[] args) {
		int charCode =  'A'; 
		
		if( (charCode>=65) & (charCode<=90)) { //65~90
			System.out.println("대문자군요");
			//대문자는 65부터 ... &그리고지만 뒤에까지 보고 값을 낸다.
		}
		
		if( (charCode>=97) && (charCode<=122) ) {
			System.out.println("소문자군요");
			//소문자는 97부터 ... &&는 그리고의 의미(앞이 거짓이면 뒤는 스킵)
		}
//		/if( (charCode>48) && (charCode<57) ) 48~57
		if( !(charCode<48) && !(charCode>57) ) {
			System.out.println("0~9 숫자군요");
			//숫자는 48부터
			// 48보다 크거나 같다. 57보다 작거나 같다. 둘 모두를 만족했을때 
		}
		
		int value = 6;
		if( (value%2==0) | (value%3==0) ) {
			System.out.println("2 또는 3의 배수이군요");
			// | 또는(한쪽만 참이면 참이라고)
		}
		
		if( (value%2==0) || (value%3==0)) {
			System.out.println("2 또는 3의 배수이군요");
			// || 또는 이지만 앞에가 맞다면 뒤는 안본다.
		}
		
	}

}
