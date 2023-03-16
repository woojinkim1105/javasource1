package ch6;

public class CalcEx2 {

	public static void main(String[] args) {
		Calc2 calc = new Calc2();
		
		
		
		calc.add(5, 3);

		calc.add(1, 3l);
		
		calc.add(3l, 2);
		
		calc.add(1, 1f);
		
		int num[] = {100,200,300,400};
		System.out.println(calc.add(num));
		
		
	}

}
