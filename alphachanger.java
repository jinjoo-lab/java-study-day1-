import java.util.Scanner;

public class alphachanger {

	public static void main(String[] args) {
		char input=' '; // 입력을 위해 사용할 문자
		char result=' '; // 알파벳을 바꾼 결과를 저장할 변수
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.print("알파벳을 입력하세요:");
		input= scanner.next().charAt(0); 
		
		if(input>=97&&input<=122) // 입력받은 문자가 소문자일 경우
		{
			result=(char)(input-32); // 대문자와의 유니코드 차이 만큼을 빼준다
			System.out.printf("input : %c, result : %c\n",input,result);
		}
		else if(input>=65&&input<=90) // 입력받은 문자가 대문자일 경우
		{
			result=(char)(input+32); // 소문자와의 유니코드 차이 만큼을 더해준다
			System.out.printf("input : %c, result : %c\n",input,result);
		}
		else // 예외처리
		{
			System.out.println("알파벳만 입력하세요");
		}

	}

}
