package bcs.test;

public class Test2 {

	public static void main(String[] args) {
		int kor=90, eng=85, hap=0;
		double avg=0.0;
		String name ="홍길동";
		
		//합과 평균을 구하는 식을 완성해서 이름=홍길동
        //					       합계=xx
		//					       평균=xx 이런식으로 출력하세요.
		
		
		System.out.println("이름 = " + name);
		System.out.println("합계 = " + (kor + eng));
		System.out.println("평균 = " + (kor + eng) / 2.0);
		
		
		hap=(kor+eng);
		avg=(double)hap/2;
	
		System.out.println("이름 = " + name);
		System.out.println("합계 = " + hap);
		System.out.println("평균 = " + avg);
		
		
	}

}
