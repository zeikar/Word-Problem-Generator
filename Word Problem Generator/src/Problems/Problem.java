package Problems;

import Objects.Item;
import Objects.Person;
import Objects.ProblemType;
import UserInterface.Renderer;

import java.util.Random;

/**
 * Created by Zeikar Park. 2013111995
 */
public class Problem
{
	// 출력할 클래스
	private Renderer renderer;
	
	// 문제 생성 시의 데이터.
	private Person person1, person2;
	private Item item;
	private int amount1, amount2;
	
	// 템플릿과 연산.
	private Template template;
	
	private Operation operation;
	
	public Problem(Renderer renderer, ProblemType problemType, Person person1, Person person2, Item item, int minRange, int maxRange)
	{
		this.renderer = renderer;
		this.person1 = person1;
		this.person2 = person2;
		this.item = item;
		
		amount1 = getRangeRandomNum(minRange, maxRange);
		amount2 = getRangeRandomNum(minRange, maxRange);
		
		// 추상 팩토리 패턴
		ProblemStyleFactory problemStyleFactory = ProblemStyleFactory.getProblemStyleFactory(problemType);
		template = problemStyleFactory.getTemplate();
		operation = problemStyleFactory.getOperation();
	}
	
	// 문제를 출력. 템플릿을 이용.
	public void printProblem()
	{
		String problemString = template.makeTemplate(person1.getName(), person2.getName(), item.getName(), amount1, amount2);
		
		renderer.printString(problemString);
	}
	
	// 사용자가 입력한 답이 정답인지 확인.
	public boolean isCorrect(double userAnswer)
	{
		return operation.isAnswerCorrect(amount1, amount2, userAnswer);
	}
	
	private int getRangeRandomNum(int minRange, int maxRange)
	{
		Random rand = new Random();
		int n;
		
		do
		{
			n = rand.nextInt((maxRange - minRange) + 1) + minRange;
		}
		// 양수가 아닌 것은 다시 랜덤 생성
		while (n <= 0);
		
		return n;
	}
}
