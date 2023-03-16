package ch6;

public class Student2 {
	String name;//학생이름 name ex)홍길동
	int ban;	//반 ban ex)1
	int no;		//번호 no ex)1
	int kor;	//국어점수 kor ex)78
	int eng;	//영어점수 eng ex)66
	int math;	//수학점수 math ex)66
	
	void print() {
		System.out.println(name);
	}
			
	public Student2(String name, int ban, int no, int kor, int eng, int math) {
		super();
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	
	int getTotal(){
		//점수 총계
		return this.kor + this.eng + this.math;
	}
	
	double getAverage(){
		//평균
		return getTotal() / 3.0;
	}

	@Override
	public String toString() {
		return "Student2 [name=" + name + ", ban=" + ban + ", no=" + no + ", kor=" + kor + ", eng=" + eng + ", math="
				+ math + "]";
	}
	

}
