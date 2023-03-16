package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* 컬렉션 프레임 웍
 * 컬렉션 : 여러 데이터들을 모아놓은 것
 * framework : 표준화, 정형화된 프로그래밍 방식
 * 
 * 라이브러리 : 공통으로 사용될만한 유용한 기능을 모듈화
 * 
 *       Collection
 *       
 *   List         Set
 *   
 *   Map
 *   
 *   <필수 암기!!> 파이썬까지 이어짐
 *   
 *   List 인터페이스 : 순서가 존재함, 데이터 중복 허용
 *   구현클래스 : ArrayList, LinkedList, Stack, Vector...
 *   
 *   Set 인터페이스 : 순서를 유지하지 않음, 데이터 중ㅇ복 허용하지 않음
 *   구현클래스 : HashSet, TreeSet...
 *   
 *   Map 인터페이스 : key, value 의 쌍으로 이루어진 데이터 집합
 *   				순서를 유지하지 않음. key는 중복 안되고 value는 중복 허용
 *   구현클래스 : HashMap, TreeMap, Hashtable, Properties...
 *   
 *   <E> or <T>, <K,V> : 지네릭스 개념 ==> 타입 지정
 *   E : element 타입 지정
 *   
 *   타입 : 기본, 참조
 */




public class ListEx1 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(); //비어있는 채로 생성
		ArrayList<String> list2 = new ArrayList<>();
		
		System.out.println("size() "+list.size()); //배열의 length 와 같은 개념
		System.out.println("isEmpty() "+list.isEmpty());
		
		//add() : 요소 추가
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		list2.add("자바");
		list2.add("html");
		list2.add("script");
		list2.add("서블릿");
		
		System.out.println(list);
		System.out.println(list2);
		
		String fruits[] = {"사과","포도","메론","딸기","바나나"};
		//배열 => 리스트로 변환(추가할 내용이 없다면)
		List<String> list3 = Arrays.asList(fruits);
		System.out.println(list3);
		
		//배열 => 리스트로 변환(추가할 내용이 있다면)
		List<String> list4 = new ArrayList<>(Arrays.asList(fruits));
		list4.add("참외");
		
		System.out.println(list4);
		
		//add(int index, 요소)
		list.add(3, 6);
		System.out.println("특정 위치에 추가 후 "+list);
		
		//set()
		list.set(3, 7);
		System.out.println("특정 위치에 요소 변경 "+list);
		
		//remove()
		list2.remove(2);
		System.out.println("특정 위치 요소 제거 후 "+list2);
		
		list4.remove("바나나");
		System.out.println("특정 위치 요소 제거 후 "+list4);

		//get(int index)
		System.out.println("특정 위치 요소 가져오기 "+list2.get(0));
		
		//indexOf(Object o)
		System.out.println("특정 요소의 위치 가져오기 "+list2.indexOf("서블릿"));
		
		
		//Collections.sort() : 오름차순 default, 내림차순을 원할 때는 기준 제공 
		Collections.sort(list4); //오름차순
		System.out.println("정렬 후 "+ list4);
	
		//Comparator.naturalOrder() : 오름차순, Comparator.reverseOrder() : 내림차순
		list.sort(Comparator.reverseOrder());
		System.out.println("정렬 후 "+ list);
	}

}
