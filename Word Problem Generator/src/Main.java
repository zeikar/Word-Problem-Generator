import Problems.Worksheet;
import UserInterface.UserInterfaceFactory;

public class Main
{
	public static void main(String[] args)
	{
		// CLI 환경에서 동작하는 worksheet 생성.
		// 추상 팩토리 패턴 적용.
		Worksheet worksheet = new Worksheet(UserInterfaceFactory.getUserInterfaceFactory("CLI"));
		
		// 문제 생성
		worksheet.generateProblems();
		
		// 문제 풀이
		worksheet.solveProblems();
	}
}
