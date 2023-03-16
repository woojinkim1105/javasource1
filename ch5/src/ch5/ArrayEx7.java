package ch5;
/*
 * String : char 배열에 기능을 추가한 개념 
 * 
 */
public class ArrayEx7 {

	public static void main(String[] args) {
		//int numArr[]=new int[3];
		
		//main 의 args 배열 건드리기 : run configuration
		System.out.println(args[0]);
		
		String name[] = new String[3];
		
		for (int i = 0; i < name.length; i++) {			
			System.out.println(name[i]); //null : 값이 할당이 안 된 상황
		}

		name[0] = "Kim";
		name[1] = "Park";
		name[2] = "Yi";
		
		System.out.println(name[0]); 
		System.out.println(name[0].charAt(1));
		
		String str = "ABCDE";
		
		System.out.println(str.charAt(3));
		System.out.println(str.charAt(4));
		
		//문자열(String) 비교 ==을 사용하지 않음
		// equals():대소문자 포함 비교, equalsIgnoreCase() : 대소문자 무시하고 비교
		System.out.println(str.equals("abcde"));
		System.out.println(str.equalsIgnoreCase("abcde"));
		
		System.out.println(str.equals("abcde")?"일치함":"일치하지 않음");
		
		if (str.equals("abcde")) {
			System.out.println("일치함");
		} else {System.out.println("일치하지 않음");


		}
		
	}

}
