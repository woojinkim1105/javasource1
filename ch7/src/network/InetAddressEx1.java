package network;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

/*
 * 네트워킹
 * 두 대 이상의 컴퓨터를 케이블로 연결하여 네트워크를 구성하는 것
 * 
 * 네트워크 어플리케이션 프로그램 작성 시 java.net 패키지를 사용함
 * 
 * 서버와 클라이언트
 * 서버 : 서비스를 제공하는 컴퓨터 (메일서버, 파일서버, 어블리케이션 서버,...,웹서버)
 * 클라이언트 : 서비스를 사용하는 컴퓨터
 * 
 * IP주소 : 호스트를 구별하는데 사용되는 고유한 값
 */

public class InetAddressEx1 {
	public static void main(String[] args) {
	// InetAddress 클래스 : IP 주소를 다루기 위한 클래스
		InetAddress ip = null;
		InetAddress[] ipArr = null;
		
		try {
			//getByName(호스트명) : ip 주소를 얻게 됨
			ip = InetAddress.getByName("www.naver.com");
			// getHostName() : ip를 통해서 호스트명을 얻게 됨
			System.out.println("getHostName() : "+ip.getHostName());
			// getHostAddress() : ip주소
			System.out.println("getHostAddress() : "+ip.getHostAddress());
			System.out.println("toString() : "+ip.toString());
			
			//ip 주소를 byte 배열로 반환
			byte[] ipAddr = ip.getAddress();
			System.out.println("getAddress() : "+Arrays.toString(ipAddr));
			
			String result = "";
			
			for (int i = 0; i < ipAddr.length; i++) {
				result += (ipAddr[i] < 0 ? ipAddr[i]+256 : ipAddr[i]+".");
			}
			
			System.out.println("getAddress()+256 : "+result);
			System.out.println();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		try {
			//getAllByName() : 하나의 도메인명에 여러 IP주소가 매핑될 때 모든 IP 주소 가져오기
			InetAddress ipArr1[] = InetAddress.getAllByName("www.naver.com");
			
			for (int i = 0; i < ipArr1.length; i++) {
				System.out.println("ipArr["+i+"] : "+ipArr1[i]);
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

	}

}
