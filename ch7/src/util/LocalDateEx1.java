package util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateEx1 {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
		
		System.out.println(today.getYear());
		System.out.println(today.getMonthValue()); // 월 1~12
		
		LocalTime time = LocalTime.now();
		System.out.println(time.getHour());
		System.out.println(time.getMinute());
		System.out.println(time.getSecond());

	}
//내일 수업 내용 중요함
/* 컬렉션 프레임 워크 ==> 자료구조
 * 면접 단골 질문
 */
}
