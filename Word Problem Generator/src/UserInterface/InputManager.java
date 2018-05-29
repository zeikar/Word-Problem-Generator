package UserInterface;

import Objects.Item;
import Objects.Person;
import Objects.ProblemType;

import java.util.List;

public interface InputManager
{
	// 사용자가 아이들이 관심 있는 사람의 이름을 입력함.
	List<Person> getPeopleListFromUser();
	
	// 사용자가 아이들이 관심 있는 아이템의 이름을 입력함.
	List<Item> getItemsListFromUser();
	
	// 사용자가 문제의 타입을 입력함. (+ - * /)
	List<ProblemType> getProblemTypesFromUser();
	
	// 사용자가 생성할 문제의 수를 입력함
	int getNumberOfProblemsFromUser();
	
	// 사용자가 최소 범위를 입력함
	int getMinimumRangeFromUser();
	
	// 사용자가 최대 범위를 입력함
	int getMaximumRangeFromUser();
	
	// 사용자가 답을 입력함.
	double getAnswerFromUser();
}
