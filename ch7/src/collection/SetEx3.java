package collection;

import java.util.HashSet;
import java.util.Set;

public class SetEx3 {
	public static void main(String[] args) {
		// Person 객체를 Set 구조에 담기
		Set<Person> set = new HashSet<>(); //<> 안에 Person 생략됨
		
		set.add(new Person("David",10));
		set.add(new Person("David",10));

		System.out.println(set);
	}

}
