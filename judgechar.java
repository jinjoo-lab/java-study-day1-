import java.util.*;
public class judgechar {

	public static void main(String[] args) {
		String input; // �Է¿� ���Ǵ� ���ڿ�
		char judge; // �Ǵ��ϱ� ���� char�� ����
		Scanner scanner=new Scanner(System.in);
		
		System.out.printf("input only one char:");
		input=scanner.nextLine();
		judge=input.charAt(0);
		
		if(judge>='0'&&judge<='9')
		{
			System.out.println("�Է��Ͻ� ���ڴ� �����Դϴ�");
		}
		else if((judge>='a'&&judge<='z')||(judge>='A'&&judge<='Z'))
		{
			System.out.println("�Է��Ͻ� ���ڴ� �����Դϴ�");
		}
		else
		{
			System.out.println("�� ���α׷��� ���ڿ� �����ڸ� �Ǵ��մϴ�");
		}
	}

}
