package bcs.test;

public class LogicalTest {

	public static void main(String[] args) {
		int charCode =  'A'; 
		
		if( (charCode>=65) & (charCode<=90)) { //65~90
			System.out.println("�빮�ڱ���");
			//�빮�ڴ� 65���� ... &�׸������� �ڿ����� ���� ���� ����.
		}
		
		if( (charCode>=97) && (charCode<=122) ) {
			System.out.println("�ҹ��ڱ���");
			//�ҹ��ڴ� 97���� ... &&�� �׸����� �ǹ�(���� �����̸� �ڴ� ��ŵ)
		}
//		/if( (charCode>48) && (charCode<57) ) 48~57
		if( !(charCode<48) && !(charCode>57) ) {
			System.out.println("0~9 ���ڱ���");
			//���ڴ� 48����
			// 48���� ũ�ų� ����. 57���� �۰ų� ����. �� ��θ� ���������� 
		}
		
		int value = 6;
		if( (value%2==0) | (value%3==0) ) {
			System.out.println("2 �Ǵ� 3�� ����̱���");
			// | �Ǵ�(���ʸ� ���̸� ���̶��)
		}
		
		if( (value%2==0) || (value%3==0)) {
			System.out.println("2 �Ǵ� 3�� ����̱���");
			// || �Ǵ� ������ �տ��� �´ٸ� �ڴ� �Ⱥ���.
		}
		
	}

}
