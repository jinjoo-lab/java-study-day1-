import java.util.Scanner;

public class alphachanger {

	public static void main(String[] args) {
		char input=' '; // �Է��� ���� ����� ����
		char result=' '; // ���ĺ��� �ٲ� ����� ������ ����
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.print("���ĺ��� �Է��ϼ���:");
		input= scanner.next().charAt(0); 
		
		if(input>=97&&input<=122) // �Է¹��� ���ڰ� �ҹ����� ���
		{
			result=(char)(input-32); // �빮�ڿ��� �����ڵ� ���� ��ŭ�� ���ش�
			System.out.printf("input : %c, result : %c\n",input,result);
		}
		else if(input>=65&&input<=90) // �Է¹��� ���ڰ� �빮���� ���
		{
			result=(char)(input+32); // �ҹ��ڿ��� �����ڵ� ���� ��ŭ�� �����ش�
			System.out.printf("input : %c, result : %c\n",input,result);
		}
		else // ����ó��
		{
			System.out.println("���ĺ��� �Է��ϼ���");
		}

	}

}
