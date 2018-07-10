package string;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		String [] bus = {"괴안사거리", "신정네거리", "보신각"}; //배열에는 주솟값, 데이터, 배열의 길이까지 저장된다.
		for(int i = 0; i<bus.length; i++)  //배열 데이터를 출력하는 일반적인 경우 
		{
			System.out.println(bus[i]);
		}
		
		
		for(String i : bus) { //Fast Enumeration(=for each) == 빠른열거, 단점은 반드시 다음으로 넘어가는 방법밖에 없다. 일반적 for문은 돌아 갈수도 있고 같은 데이터를 반복할수도 있다. 
			System.out.println(i);
		}

	}

}
 







 









