package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx1 {

	public static void main(String[] args) {

		Set<String>	set = new HashSet<>();
		
		for (int i = 0; i < 10; i++) {
			set.add(String.valueOf(i));
		}
		
		set.add("9"); //9가 추가 안되었음 - 중복을 허용하지 않음 - 있나없나 확인하지 않고 그냥 안 담음
		//따라서 경우에 따라 set 쓰면 편함
		
		System.out.println(set);

		
		//for /while
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String string = (String) it.next();
			
		}
	}

}
