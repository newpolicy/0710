package arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] fe = {"yangye", "kimji", "awoo", "hermi", "ddung"};
		
		Arrays.sort(fe);
		for(String temp : fe) {System.out.println(temp);}
		//ddung의 위치 검색 해보고 싶다
		int idx = Arrays.binarySearch(fe, "ddung");
		System.out.println(idx);
		
		
		
		Naver []n = new Naver[2];//인스턴스 배열 만들기 - 2개 저장할수 있는 배열 생성, 아직은 모두 null
		n[0] = new Naver();
		n[0].setCafe("joonggo");
		n[0].setMember(1000000);
		n[0].setPage("car");
		n[0].setNews("benz");
		
		n[1] = new Naver();
		n[1].setCafe("wedding");
		n[1].setMember(100000);
		n[1].setPage("food");
		n[1].setNews("price");
		
		//Arrays.sort(n); //에러가 난다 왜냐하면 각 데이터간 크기를 비교할 수 없기 때문이다.
		                //java에서 크기 비교를 하는 메소드는 Comparable 인터페이스의 compare 메소드 입니다. 
		                //직접만든 클래스의 경우는 클래스에 Comparable 인터페이스를 implements 하던가 Comparator 인터페이스를
		                //implements한 인스턴스를 같이 대입해야 합니다.
	/*	Comparator <Naver> comp = new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				Naver first = (Naver)o1;
				Naver second = (Naver)o2;
				return first.getMember() - second.getMember();
			}

		};*/
		
			
		
		Scanner sc = new Scanner(System.in);
		//Arrays.sort(n, comp); // compareTo 메소드를 정의 한뒤 정렬하면 에러가 나지 않고 정렬된다.
		while(true) {
			Comparator <Naver> comparator= null;
		
			System.out.println("0: 종료, 1: 제목 오름차순, 2: 제목 내림차순 ");
		int m = sc.nextInt();
		if(m == 0) {break;}
		else if (m == 1) {
			comparator = new Comparator() {

				@Override
				public int compare(Object o1, Object o2) {
					Naver x = (Naver)o1;
					Naver y = (Naver)o2;
					return x.getMember() - y.getMember();
				}};
		}
		else if (m == 2) {
			comparator = new Comparator() {

				@Override
				public int compare(Object o1, Object o2) {
					Naver x = (Naver)o1;
					Naver y = (Naver)o2;
					return y.getMember() - x.getMember();
				}};
		}
		else {
			continue;
		}
		Arrays.sort( n, comparator);
		for(Naver k : n) {System.out.println(k);}
		System.out.println("---------------------");
		}
		
	}

}
