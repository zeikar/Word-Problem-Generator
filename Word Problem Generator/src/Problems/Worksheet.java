package Problems;

import Objects.Item;
import Objects.Person;
import Objects.ProblemType;
import UserInterface.InputManager;
import UserInterface.Renderer;
import UserInterface.UserInterfaceFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zeikar Park. 2013111995
 */
public class Worksheet
{
	// 화면 출력과 입력을 담당하는 클래스
	private Renderer renderer;
	private InputManager inputManager;
	
	// 문제에 사용할 데이터를 저장.
	private List<Person> peopleList;
	private List<Item> itemsList;
	private List<ProblemType> problemTypes;
	private int numberOfProblems;
	private int minRange, maxRange;
	
	// 문제들
	private List<Problem> problems;
	
	// 생성자. 변수 초기화.
	public Worksheet(UserInterfaceFactory factory)
	{
		problems = new ArrayList<>();
		
		// 추상 팩토리 패턴으로 가져옴.
		renderer = factory.getRenderer();
		inputManager = factory.getInputManager();
		
		// 사용자가 입력하는 데이터를 가져옴.
		peopleList = inputManager.getPeopleListFromUser();
		itemsList = inputManager.getItemsListFromUser();
		problemTypes = inputManager.getProblemTypesFromUser();
		numberOfProblems = inputManager.getNumberOfProblemsFromUser();
		minRange = inputManager.getMinimumRangeFromUser();
		maxRange = inputManager.getMaximumRangeFromUser();
	}
	
	// 문제를 생성.
	public void generateProblems()
	{
		for (int i = 0; i < numberOfProblems; ++i)
		{
			problems.add(new Problem(renderer, getRandomProblemType(), getRandomPerson(), getRandomPerson(), getRandomItem(), minRange, maxRange));
		}
	}
	
	// 사용자가 문제 풀기.
	public void solveProblems()
	{
		// 맞은 문제 수.
		int correctProblems = 0;
		
		for (int i = 0; i < numberOfProblems; ++i)
		{
			Problem problem = problems.get(i);
			
			renderer.printString((i + 1) + "번 문제. ");
			
			problems.get(i).printProblem();
			
			renderer.printString("답을 입력하세요.");
			
			double answer = inputManager.getAnswerFromUser();
			
			// 정답과 비교
			if(problem.isCorrect(answer))
			{
				renderer.printString("정답!");
				correctProblems++;
			}
			else
			{
				renderer.printString("오답..");
			}
		}
		
		// 점수 출력.
		renderer.printString("점수: " + correctProblems + "/" + problems.size());
	}
	
	private ProblemType getRandomProblemType()
	{
		return (ProblemType) getRandomElementFromList(problemTypes);
	}
	
	private Person getRandomPerson()
	{
		return (Person) getRandomElementFromList(peopleList);
	}
	
	private Item getRandomItem()
	{
		return (Item) getRandomElementFromList(itemsList);
	}
	
	// 리스트에서 랜덤 오브젝트 가져옴.
	private Object getRandomElementFromList(List list)
	{
		int index = (int) (Math.random() * list.size());
		return list.get(index);
	}
}
