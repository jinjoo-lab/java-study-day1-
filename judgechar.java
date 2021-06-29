import java.util.*;
public class judgechar {

	public static void main(String[] args) {
		String input; // 입력에 사용되는 문자열
		char judge; // 판단하기 위한 char형 변수
		Scanner scanner=new Scanner(System.in);
		
		System.out.printf("input only one char:");
		input=scanner.nextLine();
		judge=input.charAt(0);
		
		if(judge>='0'&&judge<='9')
		{
			System.out.println("입력하신 문자는 숫자입니다");
		}
		else if((judge>='a'&&judge<='z')||(judge>='A'&&judge<='Z'))
		{
			System.out.println("입력하신 문자는 영문입니다");
		}
		else
		{
			System.out.println("이 프로그램은 숫자와 영문자만 판단합니다");
		}
	}

}
