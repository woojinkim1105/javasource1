package ch4;

public class DoWhileEx1 {
// do ~ while : 일단 먼저 실행!!
	/* while 문 변형으로 조건식과 블럭의 순서를 바꿔놓은 것
	 * 조건식이 만족하지 않아도 블럭이 한 번은 수행됨
	 */
	public static void main(String[] args) {
		
		int input=0;
		
		do {
			System.out.println("Hello");
		} while (input!=0);  // ;이 무조건 와야 됨!!!

	}

}
