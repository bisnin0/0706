package bcs.test;

public class Printftest {

	public static void main(String[] args) {
		int value = 123;
		System.out.printf("��ǰ�� ����:%d��\n", value);
		//������ �����ؼ� ����Ѵ�. %d, %6d���� �ִµ� %d��°� 10���� ������ ǥ���ϴ°��̴�. "�� ������ ���� ������ 10���� ������ ���
		//%6d�� 6�ڸ� 10���� = ��°��� 3�ڸ��� �� 3�ڸ� �������� ���
		//%-6d�� ��°��� 3�ڸ��϶�  �� 3�ڸ��� �������� �ϰ� �տ� ǥ��
		
		System.out.printf("��ǰ�� ����:%6d��\n", value);
		System.out.printf("��ǰ�� ����:%-6d��\n", value);
		System.out.printf("��ǰ�� ����:%06d��\n", value);
		
		double area = 3.12159 * 10 * 10;
		System.out.printf("�������� %d�� ���� ����:%10.2f\n", 10, area);
		//%10.2f �Ҽ��� �Ʒ� 2�ڸ������� ǥ��
		
		String name = "ȫ�浿";
		String job = "����";
		System.out.printf("%6d | %-10s | %10s\n", 1, name, job);
		//s�� ��Ʈ��. ȫ�浿 ���� �ڿ� 7�ڸ�. ���� �տ� 8�ڸ�
		
		
	}

}
