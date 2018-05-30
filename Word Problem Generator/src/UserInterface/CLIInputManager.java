package UserInterface;

import Objects.Item;
import Objects.Person;
import Objects.ProblemType;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CLIInputManager implements InputManager
{
	private Scanner scanner = new Scanner(System.in);
	
	// 사람들의 이름을 입력 받음.
	@Override
	public List<Person> getPeopleListFromUser()
	{
		List<Person> peopleList = new ArrayList<>();
		
		System.out.println("아이들이 관심 있어하는 사람들의 이름을 입력하세요.");
		System.out.println("입력 완료는 빈 줄(enter)을 두 번 입력하면 됩니다.");
		System.out.println("----------------------------------------------");
		
		// 사용자에게 입력 받음.
		List<String> inputString = getStringListFromUser();
		
		for (String name : inputString)
		{
			peopleList.add(new Person(name));
		}
		
		return peopleList;
	}
	
	// 물건들의 이름을 입력 받음.
	@Override
	public List<Item> getItemsListFromUser()
	{
		List<Item> itemList = new ArrayList<>();
		
		System.out.println("아이들이 관심 있어하는 물건들의 이름을 입력하세요.");
		System.out.println("입력 완료는 빈 줄(enter)을 두 번 입력하면 됩니다.");
		System.out.println("----------------------------------------------");
		
		// 사용자에게 입력 받음.
		List<String> inputString =  getStringListFromUser();
		
		for (String name : inputString)
		{
			itemList.add(new Item(name));
		}
		
		return itemList;
	}
	
	@Override
	public List<ProblemType> getProblemTypesFromUser()
	{
		List<ProblemType> problemTypes = new ArrayList<>();
		
		System.out.println("생성할 문제의 연산자들을 한 줄에 하나씩 입력하세요");
		System.out.println("가능한 연산자: +, -, *, /");
		System.out.println("입력 완료는 빈 줄(enter)을 두 번 입력하면 됩니다.");
		System.out.println("----------------------------------------------");
		
		List<String> inputType = getStringListFromUser();
		
		// 타입별로 리스트 생성
		for (String type : inputType)
		{
			if(type.equals("+"))
			{
				problemTypes.add(ProblemType.ADDITION);
			}
			else if(type.equals("-"))
			{
				problemTypes.add(ProblemType.SUBTRACTION);
			}
			else if(type.equals("*"))
			{
				problemTypes.add(ProblemType.MULTIPLICATION);
			}
			else if(type.equals("/"))
			{
				problemTypes.add(ProblemType.DIVISION);
			}
		}
		
		return problemTypes;
	}
	
	@Override
	public int getNumberOfProblemsFromUser()
	{
		System.out.println("생성할 문제의 수를 입력하세요");
		System.out.println("----------------------------------------------");
		
		return getIntegerFromUser();
	}
	
	@Override
	public int getMinimumRangeFromUser()
	{
		System.out.println("생성할 문제의 최소 범위를 입력하세요");
		System.out.println("----------------------------------------------");
		
		return getIntegerFromUser();
	}
	
	@Override
	public int getMaximumRangeFromUser()
	{
		System.out.println("생성할 문제의 최대 범위를 입력하세요");
		System.out.println("----------------------------------------------");
		
		return getIntegerFromUser();
	}
	
	@Override
	public double getAnswerFromUser()
	{
		double input;
		
		// 무한 루프하면서 입력 받음.
		while (true)
		{
			try
			{
				input = scanner.nextDouble();
				break;
			}
			catch (Exception e)
			{
				System.out.println("오류가 발생했습니다. 다시 입력하세요.");
				scanner.nextLine();
			}
		}
		
		return input;
	}
	
	// 실제 입력 받는 메소드. 빈 줄을 입력하면 종료, 지금까지 입력한 내용을 리스트로 저장 후 리턴.
	private List<String> getStringListFromUser()
	{
		List<String> inputStringList = new ArrayList<>();
		
		// 무한 루프하면서 입력 받음.
		while (true)
		{
			String input = scanner.nextLine().trim();
			
			
			// 빈 줄을 입력하면 종료
			if (input.length() == 0)
			{
				// 리스트가 비어있으면 다시 입력.
				if (inputStringList.size() == 0)
				{
					continue;
				}
				
				break;
			}
			else
			{
				inputStringList.add(input);
			}
		}
		
		return inputStringList;
	}
	
	// 사용자에게 정수 입력받음.
	private int getIntegerFromUser()
	{
		int input;
		
		// 무한 루프하면서 입력 받음.
		while (true)
		{
			try
			{
				input = scanner.nextInt();
				break;
			}
			catch (Exception e)
			{
				System.out.println("오류가 발생했습니다. 다시 입력하세요.");
				scanner.nextLine();
			}
		}
		
		return input;
	}
}
