package ch6;

public class StudentEx {

	public static void main(String[] args) {
		Student stu = new Student("홍길동",1,1,100,60,76);
		
		String msg = stu.info();
		System.out.println(msg);
		//msg 출력시
		//홍길동,1,1,100,60,76,점수합계,평균
		
		//Student2 객체 생성
		Student2 stu2 = new Student2("성춘향",2,1,100,67,58);
		System.out.printf("이름 : %s",stu2.name);
		System.out.printf("\n총점 : %s",stu2.getTotal());
		System.out.printf("\n평균 : %s",stu2.getAverage());
		
		System.out.println(stu2);
	}

}
