package exam;

public class Won2Dollor extends Converter{

	public double convert(double src) {
		return src/1200;
	}
	
	public String getSrcString() {
		return "원";
	}

	public String getdestString() {
		return "달러";
	}

	
	
}
